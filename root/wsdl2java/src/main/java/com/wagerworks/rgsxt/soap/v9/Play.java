
package com.wagerworks.rgsxt.soap.v9;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.wagerworks.rgsxt.soap.v1.AuthHeaderRequest;
import com.wagerworks.rgsxt.soap.v1.BaseRequest;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.wagerworks.com/rgsXT/soap/v1/}BaseRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Header" type="{http://www.wagerworks.com/rgsXT/soap/v1/}AuthHeaderRequest"/&gt;
 *         &lt;element name="Body" type="{http://www.wagerworks.com/rgsXT/soap/v9/}BodyRequest"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "header",
    "body"
})
@XmlRootElement(name = "Play")
public class Play
    extends BaseRequest
{

    @XmlElement(name = "Header", required = true)
    protected AuthHeaderRequest header;
    @XmlElement(name = "Body", required = true)
    protected BodyRequest body;

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link AuthHeaderRequest }
     *     
     */
    public AuthHeaderRequest getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthHeaderRequest }
     *     
     */
    public void setHeader(AuthHeaderRequest value) {
        this.header = value;
    }

    /**
     * Gets the value of the body property.
     * 
     * @return
     *     possible object is
     *     {@link BodyRequest }
     *     
     */
    public BodyRequest getBody() {
        return body;
    }

    /**
     * Sets the value of the body property.
     * 
     * @param value
     *     allowed object is
     *     {@link BodyRequest }
     *     
     */
    public void setBody(BodyRequest value) {
        this.body = value;
    }

}
