
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
 * 2018-09-06T09:36:36.307+08:00
 * Generated source version: 3.2.6
 *
 */

@javax.jws.WebService(
                      serviceName = "RgsXTServiceV13HeartBeat",
                      portName = "RgsXTv13HeartBeat",
                      targetNamespace = "http://www.wagerworks.com/rgsXT/soap/v13/",
                      wsdlLocation = "classpath:wsdl/rgsXTv13-heartBeat.wsdl",
                      endpointInterface = "com.wagerworks.rgsxt.soap.v13.RgsXTv13HeartBeat")

public class RgsXTv13HeartBeatImpl implements RgsXTv13HeartBeat {

    private static final Logger LOG = Logger.getLogger(RgsXTv13HeartBeatImpl.class.getName());

    /* (non-Javadoc)
     * @see com.wagerworks.rgsxt.soap.v13.RgsXTv13HeartBeat#heartBeat(com.wagerworks.rgsxt.soap.v1.HeartBeat heartBeatRequest)*
     */
    public com.wagerworks.rgsxt.soap.v1.HeartBeatResponse heartBeat(com.wagerworks.rgsxt.soap.v1.HeartBeat heartBeatRequest) throws XTException   {
        LOG.info("Executing operation heartBeat");
        System.out.println(heartBeatRequest);
        try {
            com.wagerworks.rgsxt.soap.v1.HeartBeatResponse _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new XTException("XTException...");
    }

}
