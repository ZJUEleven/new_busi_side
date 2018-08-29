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
import javax.xml.datatype.XMLGregorianCalendar;
import java.io.Serializable;


/**
 * <p>Java class for Bill complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Bill">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CdNo" type="{}Max30NumericText"/>
 *         &lt;element name="CdAmt" type="{}CurrencyAndAmount"/>
 *         &lt;element name="DueDt" type="{}ISODate"/>
 *         &lt;element name="MatDt" type="{}ISODate"/>
 *         &lt;element name="TenorDays" type="{}Max10NumericText"/>
 *         &lt;element name="PayInt" type="{}CurrencyAndAmount"/>
 *         &lt;element name="SetAmt" type="{}CurrencyAndAmount"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Bill", propOrder = {
    "cdNo",
    "cdAmt",
    "dueDt",
    "matDt",
    "tenorDays",
    "payInt",
    "setAmt"
})
public class Bill implements Serializable {

    @XmlElement(name = "CdNo", required = true)
    protected String cdNo;
    @XmlElement(name = "CdAmt", required = true)
    protected CurrencyAndAmount cdAmt;
    @XmlElement(name = "DueDt", required = true)
    protected XMLGregorianCalendar dueDt;
    @XmlElement(name = "MatDt", required = true)
    protected XMLGregorianCalendar matDt;
    @XmlElement(name = "TenorDays", required = true)
    protected String tenorDays;
    @XmlElement(name = "PayInt", required = true)
    protected CurrencyAndAmount payInt;
    @XmlElement(name = "SetAmt", required = true)
    protected CurrencyAndAmount setAmt;

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
     * Gets the value of the cdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getCdAmt() {
        return cdAmt;
    }

    /**
     * Sets the value of the cdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public void setCdAmt(CurrencyAndAmount value) {
        this.cdAmt = value;
    }

    /**
     * Gets the value of the dueDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDueDt() {
        return dueDt;
    }

    /**
     * Sets the value of the dueDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDueDt(XMLGregorianCalendar value) {
        this.dueDt = value;
    }

    /**
     * Gets the value of the matDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMatDt() {
        return matDt;
    }

    /**
     * Sets the value of the matDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMatDt(XMLGregorianCalendar value) {
        this.matDt = value;
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

}
