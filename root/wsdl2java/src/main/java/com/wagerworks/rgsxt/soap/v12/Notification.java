
package com.wagerworks.rgsxt.soap.v12;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Notification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Notification"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="type" type="{http://www.wagerworks.com/rgsXT/soap/v12/}NotificationTypeEnum" /&gt;
 *       &lt;attribute name="txnId" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="txnStartTime" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="wagerAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Notification")
public class Notification {

    @XmlAttribute(name = "type")
    protected NotificationTypeEnum type;
    @XmlAttribute(name = "txnId")
    protected Long txnId;
    @XmlAttribute(name = "txnStartTime")
    protected Long txnStartTime;
    @XmlAttribute(name = "wagerAmount")
    protected BigDecimal wagerAmount;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationTypeEnum }
     *     
     */
    public NotificationTypeEnum getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationTypeEnum }
     *     
     */
    public void setType(NotificationTypeEnum value) {
        this.type = value;
    }

    /**
     * Gets the value of the txnId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTxnId() {
        return txnId;
    }

    /**
     * Sets the value of the txnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTxnId(Long value) {
        this.txnId = value;
    }

    /**
     * Gets the value of the txnStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTxnStartTime() {
        return txnStartTime;
    }

    /**
     * Sets the value of the txnStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTxnStartTime(Long value) {
        this.txnStartTime = value;
    }

    /**
     * Gets the value of the wagerAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWagerAmount() {
        return wagerAmount;
    }

    /**
     * Sets the value of the wagerAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWagerAmount(BigDecimal value) {
        this.wagerAmount = value;
    }

}
