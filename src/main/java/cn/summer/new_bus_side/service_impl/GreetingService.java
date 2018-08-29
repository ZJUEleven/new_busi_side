package cn.summer.new_bus_side.service_impl;

import cn.summer.new_bus_side.dao.BillMapper;
import cn.summer.new_bus_side.dao.DealMapper;
import cn.summer.new_bus_side.domain.Deal;
import com.alibaba.dubbo.config.annotation.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import share.middle.service.MsgHandlerForBusi;
import share.msg.CES001Msg.MainBody;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

@Service
public class GreetingService {
    @Autowired
    public DealMapper dealMapper;
    @Autowired
    public  BillMapper billMapper;

    private Logger logger = LoggerFactory.getLogger(GreetingService.class);
    public static final String CONTEXT = "CONTEXT";
    @Reference(
            version = "0.0.1",
            application = "${dubbo.application.id}",
            url = "dubbo://localhost:23456"
    )
    private MsgHandlerForBusi msgHandlerForBusi;

    public void insertDeal(Deal deal){
        if (deal.getMsgId() == null)
            deal.setMsgId("1");
        send001Msg(deal);

        dealMapper.insert(deal);


        //调用接口传递参数

    }
    public void resultDeal(Deal deal, String recCode){
        send011Msg(deal,recCode);
    }

    private void send001Msg(Deal deal){
        MainBody mainBody001 = new MainBody();
        createCES001Object(mainBody001, deal);
        msgHandlerForBusi.sendMsgCES001ToShcpe(deal.getBusId(),deal.getMsgType(),mainBody001);
    }
    private void send011Msg(Deal deal, String recCode){
        String busId = deal.getBusId();
        share.msg.CES011Msg.MainBody mainBody011 = new share.msg.CES011Msg.MainBody();
        createCES011Object(mainBody011,deal,recCode);
        msgHandlerForBusi.sendMsgCES011ToShcpe(busId, "CES.011.001",mainBody011);

    }
    public List<Deal> listByBusId(String busId){

        return dealMapper.selectByBusId(busId);
    }

    public List<Deal> selectByStatus(Byte status){
        return dealMapper.selectByStatus(status);


    }

    private void createCES001Object(MainBody ces001Msg, Deal deal) {
        ces001Msg.setMsgId(new share.msg.CES001Msg.MsgId());
        ces001Msg.setOrgnlMsgId(new share.msg.CES001Msg.OrgnlMsgId());
        ces001Msg.setQuoteInf(new share.msg.CES001Msg.QuoteInf());
        ces001Msg.setSlfInf(new share.msg.CES001Msg.SlfInf());
        ces001Msg.setBlist(new share.msg.CES001Msg.Blist());
        ces001Msg.setCpInf(new share.msg.CES001Msg.CpInf());
        ces001Msg.setQuoteFctInf(new share.msg.CES001Msg.QuoteFctInf());
        share.msg.CES001Msg.CurrencyAndAmount sumAmt = new share.msg.CES001Msg.CurrencyAndAmount();
        share.msg.CES001Msg.CurrencyAndAmount setAmt = new share.msg.CES001Msg.CurrencyAndAmount();
        share.msg.CES001Msg.Bill bill = new share.msg.CES001Msg.Bill();
        //格式化时间
        String iSODateTimeFormater = "yyyy-MM-dd'T'HH:mm:ss";
        String iSODateFormater = "yyyy-MM-dd";
        String iSOTimeFormater = "HH:mm:ss";
        DateFormat dateTimeFormat = new SimpleDateFormat(iSODateTimeFormater);
        DateFormat dateFormat = new SimpleDateFormat(iSODateFormater);
        DateFormat timeFormat = new SimpleDateFormat(iSOTimeFormater);
        Date date = new Date();
        XMLGregorianCalendar isoDateTime = null;
        XMLGregorianCalendar isoDate = null;
        XMLGregorianCalendar isoTime = null;
        XMLGregorianCalendar quoteTime = null;
        try {
            isoDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(dateFormat.format(date));
            isoDateTime = DatatypeFactory.newInstance().newXMLGregorianCalendar(dateTimeFormat.format(date));
            isoTime = DatatypeFactory.newInstance().newXMLGregorianCalendar(timeFormat.format(date));
            quoteTime = DatatypeFactory.newInstance().newXMLGregorianCalendar(timeFormat.format(deal.getQuoteTime()));
        } catch (DatatypeConfigurationException e) {
            logger.error(CONTEXT, e);
        }

        //报文标识
        ces001Msg.getMsgId().setId("264748363726473637273646372727");
        ces001Msg.getMsgId().setCreDtTm(isoDateTime);
        //原报文标识
        ces001Msg.getOrgnlMsgId().setId(deal.getMsgId());
        ces001Msg.getOrgnlMsgId().setCreDtTm(isoDateTime);
        //报价单信息
        ces001Msg.getQuoteInf().setTrdDir(share.msg.CES001Msg.TrdDir.fromValue(deal.getTrdDir()));
        ces001Msg.getQuoteInf().setQuoteOp("0");
        ces001Msg.getQuoteInf().setBusiType(share.msg.CES001Msg.BusiType.fromValue("BT01"));
        //本方信息
        ces001Msg.getSlfInf().setReqBranch(deal.getReqBranch());
        ces001Msg.getSlfInf().setProductId("000000000");
        ces001Msg.getSlfInf().setReqUser(deal.getReqUser());
        //对方信息
        ces001Msg.getCpInf().setCpBranch(deal.getCpBranch());
        ces001Msg.getCpInf().setCpProductId("222222222");
        ces001Msg.getCpInf().setCpUser(deal.getReqUser());
        //报价信息
        ces001Msg.getQuoteFctInf().setCdType(share.msg.CES001Msg.CdType.fromValue(deal.getCdType()));
        ces001Msg.getQuoteFctInf().setCdMedia(share.msg.CES001Msg.CdMedia.fromValue("ME01"));
        ces001Msg.getQuoteFctInf().setDrftNm(deal.getDrftNm());
        setAmt.setCcy("CNY");
        setAmt.setValue(new BigDecimal(deal.getSetAmt()));
        sumAmt.setCcy("CNY");
        sumAmt.setValue(new BigDecimal(deal.getSumAmt()));
        ces001Msg.getQuoteFctInf().setSumAmt(sumAmt);
        ces001Msg.getQuoteFctInf().setTenorDays("20");
        ces001Msg.getQuoteFctInf().setSubDeal("1");
        ces001Msg.getQuoteFctInf().setQuoteTime(quoteTime);
        ces001Msg.getQuoteFctInf().setSetSpeed(share.msg.CES001Msg.SetSpeed.fromValue("CS00"));
        ces001Msg.getQuoteFctInf().setClrTp(share.msg.CES001Msg.ClrTp.fromValue("CT01"));
        ces001Msg.getQuoteFctInf().setSetTime(isoTime);
        ces001Msg.getQuoteFctInf().setSetMode(share.msg.CES001Msg.SetMode.fromValue("ST01"));
        ces001Msg.getQuoteFctInf().setSetAmt(setAmt);
        ces001Msg.getQuoteFctInf().setSetDate(isoDate);
        ces001Msg.getQuoteFctInf().setTrdRate("0.534");
        ces001Msg.getQuoteFctInf().setPayInt(setAmt);
        ces001Msg.getQuoteFctInf().setYieldRate("12.22");
        //票据清单
        bill.setCdNo("01");
        bill.setCdAmt(setAmt);
        bill.setDueDt(isoDate);
        bill.setMatDt(isoDate);
        bill.setTenorDays("23");
        bill.setPayInt(setAmt);
        bill.setSetAmt(setAmt);
        for (int i = 0; i < 10; i++) {
            ces001Msg.getBlist().getBill().add(bill);
        }
    }
    private void createCES011Object(share.msg.CES011Msg.MainBody ces011Msg, Deal deal, String recCode) {
        ces011Msg.setMsgId(new share.msg.CES011Msg.MsgId());
        ces011Msg.setOrgnlMsgId(new share.msg.CES011Msg.OrgnlMsgId());
        ces011Msg.setQuoteInf(new share.msg.CES011Msg.QuoteInf());
        ces011Msg.setRecInf(new share.msg.CES011Msg.RecInf());
        String iSODateTimeFormater = "yyyy-MM-dd'T'HH:mm:ss";
        DateFormat dateTimeFormat = new SimpleDateFormat(iSODateTimeFormater);
        Date date = new Date();
        XMLGregorianCalendar isoDateTime = null;
        try {
            isoDateTime = DatatypeFactory.newInstance().newXMLGregorianCalendar(dateTimeFormat.format(date));
        } catch (DatatypeConfigurationException e) {
            logger.error(CONTEXT, e);

        }
        //报文标识
        ces011Msg.getMsgId().setId("11");
        ces011Msg.getMsgId().setCreDtTm(isoDateTime);
        //原报文标识
        ces011Msg.getOrgnlMsgId().setId(deal.getMsgId());
        ces011Msg.getOrgnlMsgId().setCreDtTm(isoDateTime);
        //报价单信息
        ces011Msg.getQuoteInf().setBusiType(share.msg.CES011Msg.BusiType.fromValue("BT01"));
        //应答信息
        ces011Msg.getRecInf().setRecBranch(deal.getReqBranch());
        ces011Msg.getRecInf().setRecUser(deal.getReqUser());
        ces011Msg.getRecInf().setRecProductId("111111111");
        ces011Msg.getRecInf().setRecCmd(recCode);
    }

    public XMLGregorianCalendar xmlToDate(Date date){
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTime(date);
        XMLGregorianCalendar gc = null;
        try {
            gc = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
        } catch (Exception e) {
            logger.error(CONTEXT, e);

        }
        return gc;
    }

}
