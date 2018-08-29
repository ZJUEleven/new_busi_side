package cn.summer.new_bus_side.service_impl;

import cn.summer.new_bus_side.dao.DealMapper;
import cn.summer.new_bus_side.domain.Deal;
import com.alibaba.dubbo.config.annotation.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import share.busside.service.InfoRecFromMiddleware;
import share.util.MsgHandleResult;

import javax.xml.datatype.XMLGregorianCalendar;
import java.util.Date;

@Service(
        version = "0.0.1",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class InfoRecFromMiddlewareImp implements InfoRecFromMiddleware {
    @Autowired
    DealMapper dealMapper;
    private static final Logger logger = LoggerFactory.getLogger(InfoRecFromMiddlewareImp.class);
    public static  final String BUSI_ID = "busiId:";
    @Override
    public MsgHandleResult sendMsgCES010ToBusSide(String busiId, String msgType,share.msg.CES010Msg.MainBody ces010Msg) {
        MsgHandleResult result = new MsgHandleResult();
        result.setResultCode("1");
        logger.info("busiId:{} 收到确认报文",busiId);
        return result;
    }

    @Override
    public MsgHandleResult sendMsgCES002ToBusSide(String busiId, String msgType, share.msg.CES002Msg.MainBody ces002Msg) {
        MsgHandleResult result = new MsgHandleResult();
        logger.info( "busiId:{} 收到转发报文",busiId );
        try {
            Deal deal = new Deal();
            deal.setBusId(busiId);
            deal.setMsgId(ces002Msg.getMsgId().getId());
            deal.setTrdDir(ces002Msg.getQuoteInf().getTrdDir().value());
            deal.setMsgType(msgType);
            deal.setStatus((byte)1);
            share.msg.CES002Msg.SlfInf slfInf = ces002Msg.getSlfInf();
            deal.setReqBranch(slfInf.getReqBranch());
            deal.setReqUser(slfInf.getReqUser());
            share.msg.CES002Msg.CpInf cpInf = ces002Msg.getCpInf();
            deal.setCpBranch(cpInf.getCpBranch());
            deal.setCpUser(cpInf.getCpUser());
            share.msg.CES002Msg. QuoteFctInf quoteFctInf = ces002Msg.getQuoteFctInf();
            deal.setCdType(quoteFctInf.getCdType().value());
            deal.setDrftNm(quoteFctInf.getDrftNm());
            deal.setSumAmt(quoteFctInf.getSumAmt().getValue().toString());
            deal.setQuoteTime(convertToDate(quoteFctInf.getQuoteTime()));
            deal.setSetAmt(quoteFctInf.getSetAmt().getValue().toString());
            deal.setSetTime(convertToDate(quoteFctInf.getSetTime()));

            dealMapper.insert(deal);

        }catch (Exception e){
            logger.info("ces002保存失败{}",e.getMessage());

        }

        result.setResultCode("1");

        return result;
    }

    @Override
    public MsgHandleResult sendMsgCES003ToBusSide(String busiId, String msgType, share.msg.CES003Msg.MainBody ces003Msg) {
        MsgHandleResult result = new MsgHandleResult();
        result.setResultCode("1");
        logger.info("busiId:{} 收到成交报文",busiId);

        //传到前端，该笔交易已经成交
        return result;
    }

    @Override
    public MsgHandleResult sendMsgCES012ToBusSide(String busiId, String msgType, share.msg.CES012Msg.MainBody ces012Msg) {
        MsgHandleResult result = new MsgHandleResult();
        result.setResultCode("1");
        logger.info("busiId:{} 收到终止报文",busiId);
        //传到前端，该笔交易已经终止
        return result;
    }


    public static Date convertToDate(XMLGregorianCalendar cal){
        return cal.toGregorianCalendar().getTime();
    }
}
