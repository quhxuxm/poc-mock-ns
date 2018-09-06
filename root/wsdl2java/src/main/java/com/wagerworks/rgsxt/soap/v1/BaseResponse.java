
package com.wagerworks.rgsxt.soap.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.wagerworks.rgsxt.soap.v12.NotifyGameInProgressResponse;
import com.wagerworks.rgsxt.soap.v8.NotifyResponse;


/**
 * <p>Java class for BaseResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseResponse"&gt;
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
@XmlType(name = "BaseResponse")
@XmlSeeAlso({
    com.wagerworks.rgsxt.soap.v1.VoidResponse.class,
    com.wagerworks.rgsxt.soap.v1.ReconResponse.class,
    com.wagerworks.rgsxt.soap.v1.PlayResponse.class,
    com.wagerworks.rgsxt.soap.v1.InitResponse.class,
    NotifyResponse.class,
    com.wagerworks.rgsxt.soap.v8.PlayResponse.class,
    com.wagerworks.rgsxt.soap.v12.ReconResponse.class,
    com.wagerworks.rgsxt.soap.v12.PlayResponse.class,
    NotifyGameInProgressResponse.class,
    com.wagerworks.rgsxt.soap.v2.EndGameSessionResp.class,
    com.wagerworks.rgsxt.soap.v6.GetPlayerBalanceResponse.class,
    com.wagerworks.rgsxt.soap.v6.EndGameSessionResp.class,
    com.wagerworks.rgsxt.soap.v6.ReconResponse.class,
    com.wagerworks.rgsxt.soap.v6.VoidResponse.class,
    com.wagerworks.rgsxt.soap.v6.PlayResponse.class,
    com.wagerworks.rgsxt.soap.v6.InitResponse.class,
    com.wagerworks.rgsxt.soap.v4.PlayResponse.class,
    com.wagerworks.rgsxt.soap.v3.GetPlayerBalanceResponse.class
})
public class BaseResponse {


}
