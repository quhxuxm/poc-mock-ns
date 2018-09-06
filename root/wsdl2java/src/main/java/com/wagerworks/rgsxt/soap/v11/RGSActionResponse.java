
package com.wagerworks.rgsxt.soap.v11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RGSActionResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RGSActionResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.wagerworks.com/rgsXT/soap/v1/}RGSActionResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SourceType" type="{http://www.wagerworks.com/rgsXT/soap/v11/}SourceType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RGSActionResponse", propOrder = {
    "sourceType"
})
public class RGSActionResponse
    extends com.wagerworks.rgsxt.soap.v1.RGSActionResponse
{

    @XmlElement(name = "SourceType")
    protected SourceType sourceType;

    /**
     * Gets the value of the sourceType property.
     * 
     * @return
     *     possible object is
     *     {@link SourceType }
     *     
     */
    public SourceType getSourceType() {
        return sourceType;
    }

    /**
     * Sets the value of the sourceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceType }
     *     
     */
    public void setSourceType(SourceType value) {
        this.sourceType = value;
    }

}
