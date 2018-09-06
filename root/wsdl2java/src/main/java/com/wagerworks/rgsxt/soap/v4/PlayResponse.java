
package com.wagerworks.rgsxt.soap.v4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.wagerworks.rgsxt.soap.v1.BaseResponse;
import com.wagerworks.rgsxt.soap.v1.PlayBodyResponse;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.wagerworks.com/rgsXT/soap/v1/}BaseResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Header" type="{http://www.wagerworks.com/rgsXT/soap/v4/}AuthHeaderResponse"/&gt;
 *         &lt;element name="Body" type="{http://www.wagerworks.com/rgsXT/soap/v1/}PlayBodyResponse"/&gt;
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
@XmlRootElement(name = "PlayResponse")
public class PlayResponse
    extends BaseResponse
{

    @XmlElement(name = "Header", required = true)
    protected AuthHeaderResponse header;
    @XmlElement(name = "Body", required = true)
    protected PlayBodyResponse body;

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link AuthHeaderResponse }
     *     
     */
    public AuthHeaderResponse getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthHeaderResponse }
     *     
     */
    public void setHeader(AuthHeaderResponse value) {
        this.header = value;
    }

    /**
     * Gets the value of the body property.
     * 
     * @return
     *     possible object is
     *     {@link PlayBodyResponse }
     *     
     */
    public PlayBodyResponse getBody() {
        return body;
    }

    /**
     * Sets the value of the body property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlayBodyResponse }
     *     
     */
    public void setBody(PlayBodyResponse value) {
        this.body = value;
    }

}
