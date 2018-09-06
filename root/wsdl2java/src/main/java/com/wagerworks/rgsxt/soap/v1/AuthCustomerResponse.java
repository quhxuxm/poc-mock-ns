
package com.wagerworks.rgsxt.soap.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuthCustomerResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuthCustomerResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.wagerworks.com/rgsXT/soap/v1/}CustomerResponse"&gt;
 *       &lt;attribute name="secureToken" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthCustomerResponse")
public class AuthCustomerResponse
    extends CustomerResponse
{

    @XmlAttribute(name = "secureToken")
    protected String secureToken;

    /**
     * Gets the value of the secureToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecureToken() {
        return secureToken;
    }

    /**
     * Sets the value of the secureToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecureToken(String value) {
        this.secureToken = value;
    }

}
