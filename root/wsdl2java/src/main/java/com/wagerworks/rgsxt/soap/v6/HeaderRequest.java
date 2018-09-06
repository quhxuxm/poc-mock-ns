
package com.wagerworks.rgsxt.soap.v6;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HeaderRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HeaderRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.wagerworks.com/rgsXT/soap/v1/}HeaderRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FundMode" type="{http://www.wagerworks.com/rgsXT/soap/v6/}FundModeRequest" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HeaderRequest", propOrder = {
    "fundMode"
})
public class HeaderRequest
    extends com.wagerworks.rgsxt.soap.v1.HeaderRequest
{

    @XmlElement(name = "FundMode")
    protected FundModeRequest fundMode;

    /**
     * Gets the value of the fundMode property.
     * 
     * @return
     *     possible object is
     *     {@link FundModeRequest }
     *     
     */
    public FundModeRequest getFundMode() {
        return fundMode;
    }

    /**
     * Sets the value of the fundMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundModeRequest }
     *     
     */
    public void setFundMode(FundModeRequest value) {
        this.fundMode = value;
    }

}
