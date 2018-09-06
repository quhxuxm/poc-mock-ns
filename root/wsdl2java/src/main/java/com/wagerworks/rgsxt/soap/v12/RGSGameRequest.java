
package com.wagerworks.rgsxt.soap.v12;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RGSGameRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RGSGameRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.wagerworks.com/rgsXT/soap/v9/}RGSGameRequest"&gt;
 *       &lt;attribute name="division" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="refExternalId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="txnStartTime" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="notificationType" type="{http://www.wagerworks.com/rgsXT/soap/v12/}NotificationTypeEnum" /&gt;
 *       &lt;attribute name="totalStake" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RGSGameRequest")
public class RGSGameRequest
    extends com.wagerworks.rgsxt.soap.v9.RGSGameRequest
{

    @XmlAttribute(name = "division")
    protected Integer division;
    @XmlAttribute(name = "refExternalId")
    protected String refExternalId;
    @XmlAttribute(name = "txnStartTime")
    protected Long txnStartTime;
    @XmlAttribute(name = "notificationType")
    protected NotificationTypeEnum notificationType;
    @XmlAttribute(name = "totalStake")
    protected BigDecimal totalStake;

    /**
     * Gets the value of the division property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDivision() {
        return division;
    }

    /**
     * Sets the value of the division property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDivision(Integer value) {
        this.division = value;
    }

    /**
     * Gets the value of the refExternalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefExternalId() {
        return refExternalId;
    }

    /**
     * Sets the value of the refExternalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefExternalId(String value) {
        this.refExternalId = value;
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
     * Gets the value of the notificationType property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationTypeEnum }
     *     
     */
    public NotificationTypeEnum getNotificationType() {
        return notificationType;
    }

    /**
     * Sets the value of the notificationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationTypeEnum }
     *     
     */
    public void setNotificationType(NotificationTypeEnum value) {
        this.notificationType = value;
    }

    /**
     * Gets the value of the totalStake property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalStake() {
        return totalStake;
    }

    /**
     * Sets the value of the totalStake property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalStake(BigDecimal value) {
        this.totalStake = value;
    }

}
