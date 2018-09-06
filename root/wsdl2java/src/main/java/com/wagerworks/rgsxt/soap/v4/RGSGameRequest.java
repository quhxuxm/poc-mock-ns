
package com.wagerworks.rgsxt.soap.v4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RGSGameRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RGSGameRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.wagerworks.com/rgsXT/soap/v1/}RGSGameRequest"&gt;
 *       &lt;attribute name="subGameIND" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RGSGameRequest")
@XmlSeeAlso({
    com.wagerworks.rgsxt.soap.v9.RGSGameRequest.class
})
public class RGSGameRequest
    extends com.wagerworks.rgsxt.soap.v1.RGSGameRequest
{

    @XmlAttribute(name = "subGameIND")
    protected String subGameIND;

    /**
     * Gets the value of the subGameIND property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubGameIND() {
        return subGameIND;
    }

    /**
     * Sets the value of the subGameIND property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubGameIND(String value) {
        this.subGameIND = value;
    }

}
