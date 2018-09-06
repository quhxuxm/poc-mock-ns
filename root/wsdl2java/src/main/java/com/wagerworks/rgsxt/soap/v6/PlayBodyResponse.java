
package com.wagerworks.rgsxt.soap.v6;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import com.wagerworks.rgsxt.soap.v1.BodyResponse;


/**
 * <p>Java class for PlayBodyResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PlayBodyResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.wagerworks.com/rgsXT/soap/v1/}BodyResponse"&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="msg" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="status" type="{http://www.wagerworks.com/rgsXT/soap/v6/}PlayResponseStatusEnum" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlayBodyResponse")
public class PlayBodyResponse
    extends BodyResponse
{

    @XmlAttribute(name = "id")
    protected String id;
    @XmlAttribute(name = "msg")
    protected String msg;
    @XmlAttribute(name = "status")
    protected PlayResponseStatusEnum status;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
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

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link PlayResponseStatusEnum }
     *     
     */
    public PlayResponseStatusEnum getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlayResponseStatusEnum }
     *     
     */
    public void setStatus(PlayResponseStatusEnum value) {
        this.status = value;
    }

}
