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
import java.io.Serializable;


/**
 * <p>Java class for CpInf complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CpInf">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CpBranch" type="{}MaxMin9NumericText"/>
 *         &lt;element name="CpProductId" type="{}MaxMin9NumericText" minOccurs="0"/>
 *         &lt;element name="CpUser" type="{}Max10AlphaNumericText"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CpInf", propOrder = {
    "cpBranch",
    "cpProductId",
    "cpUser"
})
public class CpInf implements Serializable {

    @XmlElement(name = "CpBranch", required = true)
    protected String cpBranch;
    @XmlElement(name = "CpProductId")
    protected String cpProductId;
    @XmlElement(name = "CpUser", required = true)
    protected String cpUser;

    /**
     * Gets the value of the cpBranch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpBranch() {
        return cpBranch;
    }

    /**
     * Sets the value of the cpBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpBranch(String value) {
        this.cpBranch = value;
    }

    /**
     * Gets the value of the cpProductId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpProductId() {
        return cpProductId;
    }

    /**
     * Sets the value of the cpProductId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpProductId(String value) {
        this.cpProductId = value;
    }

    /**
     * Gets the value of the cpUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpUser() {
        return cpUser;
    }

    /**
     * Sets the value of the cpUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpUser(String value) {
        this.cpUser = value;
    }

}
