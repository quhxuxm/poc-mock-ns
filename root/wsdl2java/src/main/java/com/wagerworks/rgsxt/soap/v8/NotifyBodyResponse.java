
package com.wagerworks.rgsxt.soap.v8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import com.wagerworks.rgsxt.soap.v1.BodyResponse;


/**
 * <p>Java class for NotifyBodyResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotifyBodyResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.wagerworks.com/rgsXT/soap/v1/}BodyResponse"&gt;
 *       &lt;attribute name="status" type="{http://www.wagerworks.com/rgsXT/soap/v8/}NotifyResponseStatus" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotifyBodyResponse")
public class NotifyBodyResponse
    extends BodyResponse
{

    @XmlAttribute(name = "status")
    protected NotifyResponseStatus status;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link NotifyResponseStatus }
     *     
     */
    public NotifyResponseStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotifyResponseStatus }
     *     
     */
    public void setStatus(NotifyResponseStatus value) {
        this.status = value;
    }

}
