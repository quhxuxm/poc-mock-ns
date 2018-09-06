
package com.wagerworks.rgsxt.soap.v13;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FundModeRequestFreeSpin complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FundModeRequestFreeSpin"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Summary" type="{http://www.wagerworks.com/rgsXT/soap/v13/}FundModeRequestFreeSpinSummary" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="campaignId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="externalId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="lines" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="betPerLine" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="finished" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="remaining" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FundModeRequestFreeSpin", propOrder = {
    "summary"
})
public class FundModeRequestFreeSpin {

    @XmlElement(name = "Summary")
    protected FundModeRequestFreeSpinSummary summary;
    @XmlAttribute(name = "campaignId", required = true)
    protected String campaignId;
    @XmlAttribute(name = "externalId")
    protected String externalId;
    @XmlAttribute(name = "lines")
    protected Integer lines;
    @XmlAttribute(name = "betPerLine")
    protected BigDecimal betPerLine;
    @XmlAttribute(name = "finished")
    protected String finished;
    @XmlAttribute(name = "remaining")
    protected Integer remaining;

    /**
     * Gets the value of the summary property.
     * 
     * @return
     *     possible object is
     *     {@link FundModeRequestFreeSpinSummary }
     *     
     */
    public FundModeRequestFreeSpinSummary getSummary() {
        return summary;
    }

    /**
     * Sets the value of the summary property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundModeRequestFreeSpinSummary }
     *     
     */
    public void setSummary(FundModeRequestFreeSpinSummary value) {
        this.summary = value;
    }

    /**
     * Gets the value of the campaignId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampaignId() {
        return campaignId;
    }

    /**
     * Sets the value of the campaignId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampaignId(String value) {
        this.campaignId = value;
    }

    /**
     * Gets the value of the externalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalId() {
        return externalId;
    }

    /**
     * Sets the value of the externalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalId(String value) {
        this.externalId = value;
    }

    /**
     * Gets the value of the lines property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLines() {
        return lines;
    }

    /**
     * Sets the value of the lines property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLines(Integer value) {
        this.lines = value;
    }

    /**
     * Gets the value of the betPerLine property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBetPerLine() {
        return betPerLine;
    }

    /**
     * Sets the value of the betPerLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBetPerLine(BigDecimal value) {
        this.betPerLine = value;
    }

    /**
     * Gets the value of the finished property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinished() {
        return finished;
    }

    /**
     * Sets the value of the finished property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinished(String value) {
        this.finished = value;
    }

    /**
     * Gets the value of the remaining property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRemaining() {
        return remaining;
    }

    /**
     * Sets the value of the remaining property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRemaining(Integer value) {
        this.remaining = value;
    }

}
