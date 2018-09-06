
package com.wagerworks.rgsxt.soap.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BodyRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BodyRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RGSGame" type="{http://www.wagerworks.com/rgsXT/soap/v1/}RGSGameRequest"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BodyRequest", propOrder = {
    "rgsGame"
})
@XmlSeeAlso({
    VoidBodyRequest.class
})
public class BodyRequest {

    @XmlElement(name = "RGSGame", required = true)
    protected RGSGameRequest rgsGame;

    /**
     * Gets the value of the rgsGame property.
     * 
     * @return
     *     possible object is
     *     {@link RGSGameRequest }
     *     
     */
    public RGSGameRequest getRGSGame() {
        return rgsGame;
    }

    /**
     * Sets the value of the rgsGame property.
     * 
     * @param value
     *     allowed object is
     *     {@link RGSGameRequest }
     *     
     */
    public void setRGSGame(RGSGameRequest value) {
        this.rgsGame = value;
    }

}
