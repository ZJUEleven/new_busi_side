//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.30 at 10:25:27 下午 CST 
//


package share.msg.CES010Msg;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;


/**
 * <p>Java class for Document complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Document">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MainBody" type="{}MainBody"/>
 *         &lt;element name="CdesSgntr" type="{}CdesSgntr"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "mainBody",
    "cdesSgntr"
})
public class Document implements Serializable {

    @XmlElement(name = "MainBody", required = true)
    protected MainBody mainBody;
    @XmlElement(name = "CdesSgntr", required = true)
    protected String cdesSgntr;

    /**
     * Gets the value of the mainBody property.
     * 
     * @return
     *     possible object is
     *     {@link MainBody }
     *     
     */
    public MainBody getMainBody() {
        return mainBody;
    }

    /**
     * Sets the value of the mainBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link MainBody }
     *     
     */
    public void setMainBody(MainBody value) {
        this.mainBody = value;
    }

    /**
     * Gets the value of the cdesSgntr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdesSgntr() {
        return cdesSgntr;
    }

    /**
     * Sets the value of the cdesSgntr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdesSgntr(String value) {
        this.cdesSgntr = value;
    }

}
