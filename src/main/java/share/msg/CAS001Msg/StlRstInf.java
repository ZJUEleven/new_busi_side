//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.30 at 10:14:23 下午 CST 
//


package share.msg.CAS001Msg;

import javax.xml.bind.annotation.*;
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
 *         &lt;element ref="{}StlRlt"/>
 *         &lt;element ref="{}StlFailRsn" minOccurs="0"/>
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
    "stlRlt",
    "stlFailRsn"
})
@XmlRootElement(name = "StlRstInf")
public class StlRstInf implements Serializable {

    @XmlElement(name = "StlRlt", required = true)
    protected String stlRlt;
    @XmlElement(name = "StlFailRsn")
    protected String stlFailRsn;

    /**
     * Gets the value of the stlRlt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStlRlt() {
        return stlRlt;
    }

    /**
     * Sets the value of the stlRlt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStlRlt(String value) {
        this.stlRlt = value;
    }

    /**
     * Gets the value of the stlFailRsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStlFailRsn() {
        return stlFailRsn;
    }

    /**
     * Sets the value of the stlFailRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStlFailRsn(String value) {
        this.stlFailRsn = value;
    }

}
