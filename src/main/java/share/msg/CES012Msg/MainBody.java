//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.30 at 10:25:27 下午 CST 
//


package share.msg.CES012Msg;

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
 *         &lt;element name="QuoteInf" type="{}QuoteInf"/>
 *         &lt;element name="RefInf" type="{}RefInf"/>
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
    "quoteInf",
    "refInf"
})
public class MainBody implements Serializable {

    @XmlElement(name = "MsgId", required = true)
    protected MsgId msgId;
    @XmlElement(name = "QuoteInf", required = true)
    protected QuoteInf quoteInf;
    @XmlElement(name = "RefInf", required = true)
    protected RefInf refInf;

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
     * Gets the value of the refInf property.
     * 
     * @return
     *     possible object is
     *     {@link RefInf }
     *     
     */
    public RefInf getRefInf() {
        return refInf;
    }

    /**
     * Sets the value of the refInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefInf }
     *     
     */
    public void setRefInf(RefInf value) {
        this.refInf = value;
    }

}
