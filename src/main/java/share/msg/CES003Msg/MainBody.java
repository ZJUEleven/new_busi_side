//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.30 at 10:25:27 下午 CST 
//


package share.msg.CES003Msg;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;


/**
 * <p>Java class for MainBody complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MainBody">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MsgId" type="{}MsgId"/>
 *         &lt;element name="DealInf" type="{}DealInf"/>
 *         &lt;element name="QuoteInf" type="{}QuoteInf"/>
 *         &lt;element name="SlfInf" type="{}SlfInf"/>
 *         &lt;element name="CpInf" type="{}CpInf"/>
 *         &lt;element name="QuoteFctInf" type="{}QuoteFctInf"/>
 *         &lt;element name="Blist" type="{}Blist"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MainBody", propOrder = {
    "msgId",
    "dealInf",
    "quoteInf",
    "slfInf",
    "cpInf",
    "quoteFctInf",
    "blist"
})
public class MainBody implements Serializable {

    @XmlElement(name = "MsgId", required = true)
    protected MsgId msgId;
    @XmlElement(name = "DealInf", required = true)
    protected DealInf dealInf;
    @XmlElement(name = "QuoteInf", required = true)
    protected QuoteInf quoteInf;
    @XmlElement(name = "SlfInf", required = true)
    protected SlfInf slfInf;
    @XmlElement(name = "CpInf", required = true)
    protected CpInf cpInf;
    @XmlElement(name = "QuoteFctInf", required = true)
    protected QuoteFctInf quoteFctInf;
    @XmlElement(name = "Blist", required = true)
    protected Blist blist;

    /**
     * Gets the value of the msgId property.
     * 
     * @return
     *     possible object is
     *     {@link MsgId }
     *     
     */
    public MsgId getMsgId() {
        return msgId;
    }

    /**
     * Sets the value of the msgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MsgId }
     *     
     */
    public void setMsgId(MsgId value) {
        this.msgId = value;
    }

    /**
     * Gets the value of the dealInf property.
     * 
     * @return
     *     possible object is
     *     {@link DealInf }
     *     
     */
    public DealInf getDealInf() {
        return dealInf;
    }

    /**
     * Sets the value of the dealInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link DealInf }
     *     
     */
    public void setDealInf(DealInf value) {
        this.dealInf = value;
    }

    /**
     * Gets the value of the quoteInf property.
     * 
     * @return
     *     possible object is
     *     {@link QuoteInf }
     *     
     */
    public QuoteInf getQuoteInf() {
        return quoteInf;
    }

    /**
     * Sets the value of the quoteInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuoteInf }
     *     
     */
    public void setQuoteInf(QuoteInf value) {
        this.quoteInf = value;
    }

    /**
     * Gets the value of the slfInf property.
     * 
     * @return
     *     possible object is
     *     {@link SlfInf }
     *     
     */
    public SlfInf getSlfInf() {
        return slfInf;
    }

    /**
     * Sets the value of the slfInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link SlfInf }
     *     
     */
    public void setSlfInf(SlfInf value) {
        this.slfInf = value;
    }

    /**
     * Gets the value of the cpInf property.
     * 
     * @return
     *     possible object is
     *     {@link CpInf }
     *     
     */
    public CpInf getCpInf() {
        return cpInf;
    }

    /**
     * Sets the value of the cpInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CpInf }
     *     
     */
    public void setCpInf(CpInf value) {
        this.cpInf = value;
    }

    /**
     * Gets the value of the quoteFctInf property.
     * 
     * @return
     *     possible object is
     *     {@link QuoteFctInf }
     *     
     */
    public QuoteFctInf getQuoteFctInf() {
        return quoteFctInf;
    }

    /**
     * Sets the value of the quoteFctInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuoteFctInf }
     *     
     */
    public void setQuoteFctInf(QuoteFctInf value) {
        this.quoteFctInf = value;
    }

    /**
     * Gets the value of the blist property.
     * 
     * @return
     *     possible object is
     *     {@link Blist }
     *     
     */
    public Blist getBlist() {
        return blist;
    }

    /**
     * Sets the value of the blist property.
     * 
     * @param value
     *     allowed object is
     *     {@link Blist }
     *     
     */
    public void setBlist(Blist value) {
        this.blist = value;
    }

}
