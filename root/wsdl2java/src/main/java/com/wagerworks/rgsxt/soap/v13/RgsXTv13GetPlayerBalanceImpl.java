
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.wagerworks.rgsxt.soap.v13;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.2.6
 * 2018-09-06T09:36:42.708+08:00
 * Generated source version: 3.2.6
 *
 */

@javax.jws.WebService(
                      serviceName = "RgsXTServiceV13GetPlayerBalance",
                      portName = "RgsXTv13GetPlayerBalance",
                      targetNamespace = "http://www.wagerworks.com/rgsXT/soap/v13/",
                      wsdlLocation = "classpath:wsdl/rgsXTv13-getPlayerBalance.wsdl",
                      endpointInterface = "com.wagerworks.rgsxt.soap.v13.RgsXTv13GetPlayerBalance")

public class RgsXTv13GetPlayerBalanceImpl implements RgsXTv13GetPlayerBalance {

    private static final Logger LOG = Logger.getLogger(RgsXTv13GetPlayerBalanceImpl.class.getName());

    /* (non-Javadoc)
     * @see com.wagerworks.rgsxt.soap.v13.RgsXTv13GetPlayerBalance#getPlayerBalance(com.wagerworks.rgsxt.soap.v3.GetPlayerBalance getPlayerBalanceRequest)*
     */
    public com.wagerworks.rgsxt.soap.v6.GetPlayerBalanceResponse getPlayerBalance(com.wagerworks.rgsxt.soap.v3.GetPlayerBalance getPlayerBalanceRequest) throws XTException   {
        LOG.info("Executing operation getPlayerBalance");
        System.out.println(getPlayerBalanceRequest);
        try {
            com.wagerworks.rgsxt.soap.v6.GetPlayerBalanceResponse _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new XTException("XTException...");
    }

}
