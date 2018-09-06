
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */
package com.igt.interactivegame.poc.mock.ns.impl;

import com.wagerworks.rgsxt.soap.v1.AuthCustomerResponse;
import com.wagerworks.rgsxt.soap.v1.GameDetailsResponse;
import com.wagerworks.rgsxt.soap.v12.CAPStatusEnum;
import com.wagerworks.rgsxt.soap.v12.RGSGameResponse;
import com.wagerworks.rgsxt.soap.v13.RgsXTv13Notify;
import com.wagerworks.rgsxt.soap.v13.XTException;
import com.wagerworks.rgsxt.soap.v4.AuthHeaderResponse;
import com.wagerworks.rgsxt.soap.v8.Notify;
import com.wagerworks.rgsxt.soap.v8.NotifyBodyResponse;
import com.wagerworks.rgsxt.soap.v8.NotifyResponse;
import com.wagerworks.rgsxt.soap.v8.NotifyResponseStatus;

import javax.jws.WebService;
import java.util.Date;
import java.util.logging.Logger;

/**
 * This class was generated by Apache CXF 3.2.6
 * 2018-09-05T13:14:57.604+08:00
 * Generated source version: 3.2.6
 */
@WebService(
        serviceName = "RgsXTServiceV13Notify",
        portName = "RgsXTv13Notify",
        targetNamespace = "http://www.wagerworks.com/rgsXT/soap/v13/",
        wsdlLocation = "classpath:wsdl/rgsXTv13-notify.wsdl",
        endpointInterface = "com.wagerworks.rgsxt.soap.v13.RgsXTv13Notify")
public class RgsXTv13NotifyImpl implements RgsXTv13Notify {
    private static final Logger LOG = Logger.getLogger(RgsXTv13NotifyImpl.class.getName());

    /* (non-Javadoc)
     * @see com.wagerworks.rgsxt.soap.v13.RgsXTv13Notify#notify(com.wagerworks.rgsxt.soap.v8.Notify notifyRequest)*
     */
    public NotifyResponse notify(Notify notifyRequest) throws
            XTException {
        LOG.info("Executing operation notify");
        System.out.println(notifyRequest);
        try {
            NotifyResponse _return = new NotifyResponse();
            AuthHeaderResponse headerResponse = new AuthHeaderResponse();
            AuthCustomerResponse authCustomerResponse = new AuthCustomerResponse();
            authCustomerResponse.setSecureToken(notifyRequest.getHeader().getCustomer().getSecureToken());
            authCustomerResponse.setCcyCode(notifyRequest.getHeader().getCustomer().getCcyCode());
            authCustomerResponse.setUserId(notifyRequest.getHeader().getCustomer().getUserId());
            headerResponse.setCustomer(authCustomerResponse);
            GameDetailsResponse gameDetailsResponse = new GameDetailsResponse();
            gameDetailsResponse.setGameId(notifyRequest.getHeader().getGameDetails().getGameId());
            gameDetailsResponse.setName(notifyRequest.getHeader().getGameDetails().getName());
            headerResponse.setGameDetails(gameDetailsResponse);
            _return.setHeader(headerResponse);
            NotifyBodyResponse bodyResponse = new NotifyBodyResponse();
            bodyResponse.setStatus(NotifyResponseStatus.SUCCESS);
            RGSGameResponse rgsGameResponse = new RGSGameResponse();
            rgsGameResponse.setCapStatus(CAPStatusEnum.NON_PENDING);
            rgsGameResponse.setTxnStartTime(new Date().getTime());
            rgsGameResponse.setFinished(true);
            rgsGameResponse.setTxnId(1L);
            bodyResponse.setRGSGame(rgsGameResponse);
            _return.setBody(bodyResponse);
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new XTException("XTException...");
    }
}
