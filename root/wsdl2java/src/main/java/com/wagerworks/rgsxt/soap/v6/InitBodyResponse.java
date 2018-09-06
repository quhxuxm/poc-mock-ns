
package com.wagerworks.rgsxt.soap.v6;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InitBodyResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InitBodyResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="status" type="{http://www.wagerworks.com/rgsXT/soap/v6/}InitResponseStatusEnum" /&gt;
 *       &lt;attribute name="msg" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InitBodyResponse")
public class InitBodyResponse {

    @XmlAttribute(name = "status")
    protected InitResponseStatusEnum status;
    @XmlAttribute(name = "msg")
    protected String msg;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link InitResponseStatusEnum }
     *     
     */
    public InitResponseStatusEnum getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link InitResponseStatusEnum }
     *     
     */
    public void setStatus(InitResponseStatusEnum value) {
        this.status = value;
    }

    /**
     * Gets the value of the msg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsg() {
        return msg;
    }

    /**
     * Sets the value of the msg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsg(String value) {
        this.msg = value;
    }

}
