
package com.wagerworks.rgsxt.soap.v8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RealityCheckContent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RealityCheckContent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="action" type="{http://www.wagerworks.com/rgsXT/soap/v8/}RealityCheckType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RealityCheckContent", propOrder = {
    "action"
})
public class RealityCheckContent {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected RealityCheckType action;

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link RealityCheckType }
     *     
     */
    public RealityCheckType getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link RealityCheckType }
     *     
     */
    public void setAction(RealityCheckType value) {
        this.action = value;
    }

}
