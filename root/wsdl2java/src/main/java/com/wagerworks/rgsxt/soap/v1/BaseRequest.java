
package com.wagerworks.rgsxt.soap.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.wagerworks.rgsxt.soap.v12.NotifyGameInProgressRequest;
import com.wagerworks.rgsxt.soap.v3.GetPlayerBalance;
import com.wagerworks.rgsxt.soap.v8.Notify;


/**
 * <p>Java class for BaseRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseRequest")
@XmlSeeAlso({
    Void.class,
    com.wagerworks.rgsxt.soap.v1.Recon.class,
    com.wagerworks.rgsxt.soap.v1.Play.class,
    Init.class,
    Notify.class,
    com.wagerworks.rgsxt.soap.v5.EndGameSessionReq.class,
    NotifyGameInProgressRequest.class,
    com.wagerworks.rgsxt.soap.v2.EndGameSessionReq.class,
    com.wagerworks.rgsxt.soap.v9.Recon.class,
    com.wagerworks.rgsxt.soap.v9.Play.class,
    com.wagerworks.rgsxt.soap.v4.Recon.class,
    com.wagerworks.rgsxt.soap.v4.Play.class,
    GetPlayerBalance.class
})
public class BaseRequest {


}
