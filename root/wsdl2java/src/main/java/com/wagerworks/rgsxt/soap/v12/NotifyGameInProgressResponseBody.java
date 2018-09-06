
package com.wagerworks.rgsxt.soap.v12;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotifyGameInProgressResponseBody complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotifyGameInProgressResponseBody"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="status" type="{http://www.wagerworks.com/rgsXT/soap/v12/}NotifyGameInProgressResponseStatusEnum"/&gt;
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotifyGameInProgressResponseBody", propOrder = {
    "status",
    "message"
})
public class NotifyGameInProgressResponseBody {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected NotifyGameInProgressResponseStatusEnum status;
    @XmlElement(required = true)
    protected String message;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link NotifyGameInProgressResponseStatusEnum }
     *     
     */
    public NotifyGameInProgressResponseStatusEnum getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotifyGameInProgressResponseStatusEnum }
     *     
     */
    public void setStatus(NotifyGameInProgressResponseStatusEnum value) {
        this.status = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

}
