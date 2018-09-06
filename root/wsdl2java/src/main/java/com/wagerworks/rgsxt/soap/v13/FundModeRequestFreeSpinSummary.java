
package com.wagerworks.rgsxt.soap.v13;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FundModeRequestFreeSpinSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FundModeRequestFreeSpinSummary"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="totalSpins" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="totalWin" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FundModeRequestFreeSpinSummary")
public class FundModeRequestFreeSpinSummary {

    @XmlAttribute(name = "totalSpins")
    protected Long totalSpins;
    @XmlAttribute(name = "totalWin")
    protected BigDecimal totalWin;

    /**
     * Gets the value of the totalSpins property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalSpins() {
        return totalSpins;
    }

    /**
     * Sets the value of the totalSpins property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalSpins(Long value) {
        this.totalSpins = value;
    }

    /**
     * Gets the value of the totalWin property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalWin() {
        return totalWin;
    }

    /**
     * Sets the value of the totalWin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalWin(BigDecimal value) {
        this.totalWin = value;
    }

}
