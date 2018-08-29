//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.30 at 10:25:27 下午 CST 
//


package share.msg.CES002Msg;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import java.io.Serializable;


/**
 * <p>Java class for QuoteFctInf complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuoteFctInf">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CdType" type="{}CdType"/>
 *         &lt;element name="CdMedia" type="{}CdMedia"/>
 *         &lt;element name="DrftNm" type="{}Max10NumericText"/>
 *         &lt;element name="SumAmt" type="{}CurrencyAndAmount"/>
 *         &lt;element name="TenorDays" type="{}Max10NumericText"/>
 *         &lt;element name="SubDeal" type="{}SubDeal"/>
 *         &lt;element name="QuoteTime" type="{}ISOTime"/>
 *         &lt;element name="SetSpeed" type="{}SetSpeed"/>
 *         &lt;element name="ClrTp" type="{}ClrTp"/>
 *         &lt;element name="SetTime" type="{}ISOTime"/>
 *         &lt;element name="SetMode" type="{}SetMode"/>
 *         &lt;element name="SetAmt" type="{}CurrencyAndAmount"/>
 *         &lt;element name="SetDate" type="{}ISODate"/>
 *         &lt;element name="TrdRate" type="{}PercentageRate"/>
 *         &lt;element name="PayInt" type="{}CurrencyAndAmount"/>
 *         &lt;element name="YieldRate" type="{}PercentRate"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuoteFctInf", propOrder = {
    "cdType",
    "cdMedia",
    "drftNm",
    "sumAmt",
    "tenorDays",
    "subDeal",
    "quoteTime",
    "setSpeed",
    "clrTp",
    "setTime",
    "setMode",
    "setAmt",
    "setDate",
    "trdRate",
    "payInt",
    "yieldRate"
})
public class QuoteFctInf implements Serializable {

    @XmlElement(name = "CdType", required = true)
    protected CdType cdType;
    @XmlElement(name = "CdMedia", required = true)
    protected CdMedia cdMedia;
    @XmlElement(name = "DrftNm", required = true)
    protected String drftNm;
    @XmlElement(name = "SumAmt", required = true)
    protected CurrencyAndAmount sumAmt;
    @XmlElement(name = "TenorDays", required = true)
    protected String tenorDays;
    @XmlElement(name = "SubDeal", required = true)
    protected String subDeal;
    @XmlElement(name = "QuoteTime", required = true)
    protected XMLGregorianCalendar quoteTime;
    @XmlElement(name = "SetSpeed", required = true)
    protected SetSpeed setSpeed;
    @XmlElement(name = "ClrTp", required = true)
    protected ClrTp clrTp;
    @XmlElement(name = "SetTime", required = true)
    protected XMLGregorianCalendar setTime;
    @XmlElement(name = "SetMode", required = true)
    protected SetMode setMode;
    @XmlElement(name = "SetAmt", required = true)
    protected CurrencyAndAmount setAmt;
    @XmlElement(name = "SetDate", required = true)
    protected XMLGregorianCalendar setDate;
    @XmlElement(name = "TrdRate", required = true)
    protected String trdRate;
    @XmlElement(name = "PayInt", required = true)
    protected CurrencyAndAmount payInt;
    @XmlElement(name = "YieldRate", required = true)
    protected String yieldRate;

    /**
     * Gets the value of the cdType property.
     * 
     * @return
     *     possible object is
     *     {@link CdType }
     *     
     */
    public CdType getCdType() {
        return cdType;
    }

    /**
     * Sets the value of the cdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CdType }
     *     
     */
    public void setCdType(CdType value) {
        this.cdType = value;
    }

    /**
     * Gets the value of the cdMedia property.
     * 
     * @return
     *     possible object is
     *     {@link CdMedia }
     *     
     */
    public CdMedia getCdMedia() {
        return cdMedia;
    }

    /**
     * Sets the value of the cdMedia property.
     * 
     * @param value
     *     allowed object is
     *     {@link CdMedia }
     *     
     */
    public void setCdMedia(CdMedia value) {
        this.cdMedia = value;
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
     * Gets the value of the sumAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getSumAmt() {
        return sumAmt;
    }

    /**
     * Sets the value of the sumAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public void setSumAmt(CurrencyAndAmount value) {
        this.sumAmt = value;
    }

    /**
     * Gets the value of the tenorDays property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTenorDays() {
        return tenorDays;
    }

    /**
     * Sets the value of the tenorDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTenorDays(String value) {
        this.tenorDays = value;
    }

    /**
     * Gets the value of the subDeal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubDeal() {
        return subDeal;
    }

    /**
     * Sets the value of the subDeal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubDeal(String value) {
        this.subDeal = value;
    }

    /**
     * Gets the value of the quoteTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getQuoteTime() {
        return quoteTime;
    }

    /**
     * Sets the value of the quoteTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setQuoteTime(XMLGregorianCalendar value) {
        this.quoteTime = value;
    }

    /**
     * Gets the value of the setSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link SetSpeed }
     *     
     */
    public SetSpeed getSetSpeed() {
        return setSpeed;
    }

    /**
     * Sets the value of the setSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetSpeed }
     *     
     */
    public void setSetSpeed(SetSpeed value) {
        this.setSpeed = value;
    }

    /**
     * Gets the value of the clrTp property.
     * 
     * @return
     *     possible object is
     *     {@link ClrTp }
     *     
     */
    public ClrTp getClrTp() {
        return clrTp;
    }

    /**
     * Sets the value of the clrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClrTp }
     *     
     */
    public void setClrTp(ClrTp value) {
        this.clrTp = value;
    }

    /**
     * Gets the value of the setTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSetTime() {
        return setTime;
    }

    /**
     * Sets the value of the setTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSetTime(XMLGregorianCalendar value) {
        this.setTime = value;
    }

    /**
     * Gets the value of the setMode property.
     * 
     * @return
     *     possible object is
     *     {@link SetMode }
     *     
     */
    public SetMode getSetMode() {
        return setMode;
    }

    /**
     * Sets the value of the setMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetMode }
     *     
     */
    public void setSetMode(SetMode value) {
        this.setMode = value;
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
     * Gets the value of the setDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSetDate() {
        return setDate;
    }

    /**
     * Sets the value of the setDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSetDate(XMLGregorianCalendar value) {
        this.setDate = value;
    }

    /**
     * Gets the value of the trdRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrdRate() {
        return trdRate;
    }

    /**
     * Sets the value of the trdRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrdRate(String value) {
        this.trdRate = value;
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
     * Gets the value of the yieldRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYieldRate() {
        return yieldRate;
    }

    /**
     * Sets the value of the yieldRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYieldRate(String value) {
        this.yieldRate = value;
    }

}
