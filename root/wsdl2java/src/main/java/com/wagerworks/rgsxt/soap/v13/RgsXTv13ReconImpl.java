
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
 * 2018-09-06T09:36:29.951+08:00
 * Generated source version: 3.2.6
 *
 */

@javax.jws.WebService(
                      serviceName = "RgsXTServiceV13Recon",
                      portName = "RgsXTv13Recon",
                      targetNamespace = "http://www.wagerworks.com/rgsXT/soap/v13/",
                      wsdlLocation = "classpath:wsdl/rgsXTv13-recon.wsdl",
                      endpointInterface = "com.wagerworks.rgsxt.soap.v13.RgsXTv13Recon")

public class RgsXTv13ReconImpl implements RgsXTv13Recon {

    private static final Logger LOG = Logger.getLogger(RgsXTv13ReconImpl.class.getName());

    /* (non-Javadoc)
     * @see com.wagerworks.rgsxt.soap.v13.RgsXTv13Recon#recon(com.wagerworks.rgsxt.soap.v9.Recon reconRequest)*
     */
    public com.wagerworks.rgsxt.soap.v12.ReconResponse recon(com.wagerworks.rgsxt.soap.v9.Recon reconRequest) throws XTException   {
        LOG.info("Executing operation recon");
        System.out.println(reconRequest);
        try {
            com.wagerworks.rgsxt.soap.v12.ReconResponse _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new XTException("XTException...");
    }

}
