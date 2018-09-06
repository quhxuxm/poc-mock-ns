
package com.wagerworks.rgsxt.soap.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.wagerworks.rgsxt.soap.v1.BaseRequest;
import com.wagerworks.rgsxt.soap.v1.HeaderRequest;


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
 *         &lt;element name="Header" type="{http://www.wagerworks.com/rgsXT/soap/v1/}HeaderRequest"/&gt;
 *         &lt;element name="Status" type="{http://www.wagerworks.com/rgsXT/soap/v5/}TerminateSessionTypEnum"/&gt;
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
    "status"
})
@XmlRootElement(name = "EndGameSessionReq")
public class EndGameSessionReq
    extends BaseRequest
{

    @XmlElement(name = "Header", required = true)
    protected HeaderRequest header;
    @XmlElement(name = "Status", required = true)
    @XmlSchemaType(name = "string")
    protected TerminateSessionTypEnum status;

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link HeaderRequest }
     *     
     */
    public HeaderRequest getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeaderRequest }
     *     
     */
    public void setHeader(HeaderRequest value) {
        this.header = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link TerminateSessionTypEnum }
     *     
     */
    public TerminateSessionTypEnum getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminateSessionTypEnum }
     *     
     */
    public void setStatus(TerminateSessionTypEnum value) {
        this.status = value;
    }

}
