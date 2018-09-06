
package com.wagerworks.rgsxt.soap.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HeaderRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HeaderRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GameDetails" type="{http://www.wagerworks.com/rgsXT/soap/v1/}GameDetailsRequest"/&gt;
 *         &lt;element name="Customer" type="{http://www.wagerworks.com/rgsXT/soap/v1/}CustomerRequest"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HeaderRequest", propOrder = {
    "gameDetails",
    "customer"
})
@XmlSeeAlso({
    com.wagerworks.rgsxt.soap.v6.HeaderRequest.class
})
public class HeaderRequest {

    @XmlElement(name = "GameDetails", required = true)
    protected GameDetailsRequest gameDetails;
    @XmlElement(name = "Customer", required = true)
    protected CustomerRequest customer;

    /**
     * Gets the value of the gameDetails property.
     * 
     * @return
     *     possible object is
     *     {@link GameDetailsRequest }
     *     
     */
    public GameDetailsRequest getGameDetails() {
        return gameDetails;
    }

    /**
     * Sets the value of the gameDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link GameDetailsRequest }
     *     
     */
    public void setGameDetails(GameDetailsRequest value) {
        this.gameDetails = value;
    }

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerRequest }
     *     
     */
    public CustomerRequest getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerRequest }
     *     
     */
    public void setCustomer(CustomerRequest value) {
        this.customer = value;
    }

}
