//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.30 at 10:14:23 下午 CST 
//


package share.msg.CAS001Msg;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.io.Serializable;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DlvOrderNo" type="{}Max24AlphaNumericText"/>
 *         &lt;element name="StlTm" type="{}ISODateTime" minOccurs="0"/>
 *         &lt;element ref="{}StlTp"/>
 *         &lt;element ref="{}SetMode"/>
 *         &lt;element ref="{}ClrTp"/>
 *         &lt;element name="SetAmt" type="{}CurrencyAndAmount" minOccurs="0"/>
 *         &lt;element name="PayInt" type="{}CurrencyAndAmount" minOccurs="0"/>
 *         &lt;element name="DrftNm" type="{}Max10NumericText"/>
 *         &lt;element name="DealId" type="{}Max20AlphaNumericText" minOccurs="0"/>
 *         &lt;element name="CdNo" type="{}Max30NumericText"/>
 *         &lt;element ref="{}RcvInf"/>
 *         &lt;element ref="{}PayInf"/>
 *         &lt;element name="CcpcMsgId" type="{}Max35NumericText" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "dlvOrderNo",
    "stlTm",
    "stlTp",
    "setMode",
    "clrTp",
    "setAmt",
    "payInt",
    "drftNm",
    "dealId",
    "cdNo",
    "rcvInf",
    "payInf",
    "ccpcMsgId"
})
@XmlRootElement(name = "StlInf")
public class StlInf implements Serializable {

    @XmlElement(name = "DlvOrderNo", required = true)
    protected String dlvOrderNo;
    @XmlElement(name = "StlTm")
    protected XMLGregorianCalendar stlTm;
    @XmlElement(name = "StlTp", required = true)
    protected String stlTp;
    @XmlElement(name = "SetMode", required = true)
    protected String setMode;
    @XmlElement(name = "ClrTp", required = true)
    protected String clrTp;
    @XmlElement(name = "SetAmt")
    protected CurrencyAndAmount setAmt;
    @XmlElement(name = "PayInt")
    protected CurrencyAndAmount payInt;
    @XmlElement(name = "DrftNm", required = true)
    protected String drftNm;
    @XmlElement(name = "DealId")
    protected String dealId;
    @XmlElement(name = "CdNo", required = true)
    protected String cdNo;
    @XmlElement(name = "RcvInf", required = true)
    protected RcvInf rcvInf;
    @XmlElement(name = "PayInf", required = true)
    protected PayInf payInf;
    @XmlElement(name = "CcpcMsgId")
    protected String ccpcMsgId;

    /**
     * Gets the value of the dlvOrderNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDlvOrderNo() {
        return dlvOrderNo;
    }

    /**
     * Sets the value of the dlvOrderNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDlvOrderNo(String value) {
        this.dlvOrderNo = value;
    }

    /**
     * Gets the value of the stlTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStlTm() {
        return stlTm;
    }

    /**
     * Sets the value of the stlTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStlTm(XMLGregorianCalendar value) {
        this.stlTm = value;
    }

    /**
     * Gets the value of the stlTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStlTp() {
        return stlTp;
    }

    /**
     * Sets the value of the stlTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStlTp(String value) {
        this.stlTp = value;
    }

    /**
     * Gets the value of the setMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSetMode() {
        return setMode;
    }

    /**
     * Sets the value of the setMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSetMode(String value) {
        this.setMode = value;
    }

    /**
     * Gets the value of the clrTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClrTp() {
        return clrTp;
    }

    /**
     * Sets the value of the clrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClrTp(String value) {
        this.clrTp = value;
    }

    /**
     * Gets the value of the setAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getSetAmt() {
        return setAmt;
    }

    /**
     * Sets the value of the setAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public void setSetAmt(CurrencyAndAmount value) {
        this.setAmt = value;
    }

    /**
     * Gets the value of the payInt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getPayInt() {
        return payInt;
    }

    /**
     * Sets the value of the payInt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public void setPayInt(CurrencyAndAmount value) {
        this.payInt = value;
    }

    /**
     * Gets the value of the drftNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrftNm() {
        return drftNm;
    }

    /**
     * Sets the value of the drftNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrftNm(String value) {
        this.drftNm = value;
    }

    /**
     * Gets the value of the dealId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDealId() {
        return dealId;
    }

    /**
     * Sets the value of the dealId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDealId(String value) {
        this.dealId = value;
    }

    /**
     * Gets the value of the cdNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdNo() {
        return cdNo;
    }

    /**
     * Sets the value of the cdNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdNo(String value) {
        this.cdNo = value;
    }

    /**
     * Gets the value of the rcvInf property.
     * 
     * @return
     *     possible object is
     *     {@link RcvInf }
     *     
     */
    public RcvInf getRcvInf() {
        return rcvInf;
    }

    /**
     * Sets the value of the rcvInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link RcvInf }
     *     
     */
    public void setRcvInf(RcvInf value) {
        this.rcvInf = value;
    }

    /**
     * Gets the value of the payInf property.
     * 
     * @return
     *     possible object is
     *     {@link PayInf }
     *     
     */
    public PayInf getPayInf() {
        return payInf;
    }

    /**
     * Sets the value of the payInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayInf }
     *     
     */
    public void setPayInf(PayInf value) {
        this.payInf = value;
    }

    /**
     * Gets the value of the ccpcMsgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcpcMsgId() {
        return ccpcMsgId;
    }

    /**
     * Sets the value of the ccpcMsgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcpcMsgId(String value) {
        this.ccpcMsgId = value;
    }

}
