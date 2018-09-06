
package com.wagerworks.rgsxt.soap.v9;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RGSGameRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RGSGameRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.wagerworks.com/rgsXT/soap/v4/}RGSGameRequest"&gt;
 *       &lt;attribute name="hasJackpot" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RGSGameRequest")
@XmlSeeAlso({
    com.wagerworks.rgsxt.soap.v12.RGSGameRequest.class
})
public class RGSGameRequest
    extends com.wagerworks.rgsxt.soap.v4.RGSGameRequest
{

    @XmlAttribute(name = "hasJackpot")
    protected Boolean hasJackpot;

    /**
     * Gets the value of the hasJackpot property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasJackpot() {
        return hasJackpot;
    }

    /**
     * Sets the value of the hasJackpot property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasJackpot(Boolean value) {
        this.hasJackpot = value;
    }

}
