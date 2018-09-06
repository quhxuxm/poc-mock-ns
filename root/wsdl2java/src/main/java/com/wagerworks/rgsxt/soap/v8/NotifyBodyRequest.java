
package com.wagerworks.rgsxt.soap.v8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotifyBodyRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotifyBodyRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RealityCheck" type="{http://www.wagerworks.com/rgsXT/soap/v8/}RealityCheckContent"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotifyBodyRequest", propOrder = {
    "realityCheck"
})
public class NotifyBodyRequest {

    @XmlElement(name = "RealityCheck", required = true)
    protected RealityCheckContent realityCheck;

    /**
     * Gets the value of the realityCheck property.
     * 
     * @return
     *     possible object is
     *     {@link RealityCheckContent }
     *     
     */
    public RealityCheckContent getRealityCheck() {
        return realityCheck;
    }

    /**
     * Sets the value of the realityCheck property.
     * 
     * @param value
     *     allowed object is
     *     {@link RealityCheckContent }
     *     
     */
    public void setRealityCheck(RealityCheckContent value) {
        this.realityCheck = value;
    }

}
