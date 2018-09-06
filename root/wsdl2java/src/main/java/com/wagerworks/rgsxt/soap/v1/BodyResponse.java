
package com.wagerworks.rgsxt.soap.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.wagerworks.rgsxt.soap.v8.NotifyBodyResponse;


/**
 * <p>Java class for BodyResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BodyResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RGSGame" type="{http://www.wagerworks.com/rgsXT/soap/v1/}RGSGameResponse"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BodyResponse", propOrder = {
    "rgsGame"
})
@XmlSeeAlso({
    com.wagerworks.rgsxt.soap.v1.PlayBodyResponse.class,
    com.wagerworks.rgsxt.soap.v6.PlayBodyResponse.class,
    com.wagerworks.rgsxt.soap.v6.VoidBodyResponse.class,
    com.wagerworks.rgsxt.soap.v6.ReconBodyResponse.class,
    com.wagerworks.rgsxt.soap.v12.PlayBodyResponse.class,
    com.wagerworks.rgsxt.soap.v12.ReconBodyResponse.class,
    NotifyBodyResponse.class,
    com.wagerworks.rgsxt.soap.v1.ReconBodyResponse.class,
    com.wagerworks.rgsxt.soap.v1.VoidBodyResponse.class
})
public class BodyResponse {

    @XmlElement(name = "RGSGame", required = true)
    protected RGSGameResponse rgsGame;

    /**
     * Gets the value of the rgsGame property.
     * 
     * @return
     *     possible object is
     *     {@link RGSGameResponse }
     *     
     */
    public RGSGameResponse getRGSGame() {
        return rgsGame;
    }

    /**
     * Sets the value of the rgsGame property.
     * 
     * @param value
     *     allowed object is
     *     {@link RGSGameResponse }
     *     
     */
    public void setRGSGame(RGSGameResponse value) {
        this.rgsGame = value;
    }

}
