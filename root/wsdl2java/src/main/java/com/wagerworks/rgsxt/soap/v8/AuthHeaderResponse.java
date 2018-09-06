
package com.wagerworks.rgsxt.soap.v8;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.wagerworks.rgsxt.soap.v1.AuthCustomerResponse;
import com.wagerworks.rgsxt.soap.v1.GameDetailsResponse;


/**
 * <p>Java class for AuthHeaderResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuthHeaderResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GameDetails" type="{http://www.wagerworks.com/rgsXT/soap/v1/}GameDetailsResponse"/&gt;
 *         &lt;element name="Customer" type="{http://www.wagerworks.com/rgsXT/soap/v1/}AuthCustomerResponse"/&gt;
 *         &lt;element name="Messages" type="{http://www.wagerworks.com/rgsXT/soap/v8/}Messages"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthHeaderResponse", propOrder = {
    "gameDetails",
    "customer",
    "messages"
})
public class AuthHeaderResponse {

    @XmlElement(name = "GameDetails", required = true)
    protected GameDetailsResponse gameDetails;
    @XmlElement(name = "Customer", required = true)
    protected AuthCustomerResponse customer;
    @XmlElement(name = "Messages", required = true)
    protected Messages messages;

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
     *     {@link AuthCustomerResponse }
     *     
     */
    public AuthCustomerResponse getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthCustomerResponse }
     *     
     */
    public void setCustomer(AuthCustomerResponse value) {
        this.customer = value;
    }

    /**
     * Gets the value of the messages property.
     * 
     * @return
     *     possible object is
     *     {@link Messages }
     *     
     */
    public Messages getMessages() {
        return messages;
    }

    /**
     * Sets the value of the messages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Messages }
     *     
     */
    public void setMessages(Messages value) {
        this.messages = value;
    }

}
