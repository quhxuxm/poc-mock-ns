
package com.wagerworks.rgsxt.soap.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HeaderResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HeaderResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GameDetails" type="{http://www.wagerworks.com/rgsXT/soap/v1/}GameDetailsResponse"/&gt;
 *         &lt;element name="Customer" type="{http://www.wagerworks.com/rgsXT/soap/v1/}CustomerResponse"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HeaderResponse", propOrder = {
    "gameDetails",
    "customer"
})
public class HeaderResponse {

    @XmlElement(name = "GameDetails", required = true)
    protected GameDetailsResponse gameDetails;
    @XmlElement(name = "Customer", required = true)
    protected CustomerResponse customer;

    /**
     * Gets the value of the gameDetails property.
     * 
     * @return
     *     possible object is
     *     {@link GameDetailsResponse }
     *     
     */
    public GameDetailsResponse getGameDetails() {
        return gameDetails;
    }

    /**
     * Sets the value of the gameDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link GameDetailsResponse }
     *     
     */
    public void setGameDetails(GameDetailsResponse value) {
        this.gameDetails = value;
    }

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerResponse }
     *     
     */
    public CustomerResponse getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerResponse }
     *     
     */
    public void setCustomer(CustomerResponse value) {
        this.customer = value;
    }

}
