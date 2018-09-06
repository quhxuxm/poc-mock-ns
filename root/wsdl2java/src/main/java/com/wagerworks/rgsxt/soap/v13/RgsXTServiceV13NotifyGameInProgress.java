package com.wagerworks.rgsxt.soap.v13;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.6
 * 2018-09-06T09:36:45.834+08:00
 * Generated source version: 3.2.6
 *
 */
@WebServiceClient(name = "RgsXTServiceV13NotifyGameInProgress",
                  wsdlLocation = "classpath:wsdl/rgsXTv13-notifyGameInProgress.wsdl",
                  targetNamespace = "http://www.wagerworks.com/rgsXT/soap/v13/")
public class RgsXTServiceV13NotifyGameInProgress extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.wagerworks.com/rgsXT/soap/v13/", "RgsXTServiceV13NotifyGameInProgress");
    public final static QName RgsXTv13NotifyGameInProgress = new QName("http://www.wagerworks.com/rgsXT/soap/v13/", "RgsXTv13NotifyGameInProgress");
    static {
        URL url = RgsXTServiceV13NotifyGameInProgress.class.getClassLoader().getResource("wsdl/rgsXTv13-notifyGameInProgress.wsdl");
        if (url == null) {
            java.util.logging.Logger.getLogger(RgsXTServiceV13NotifyGameInProgress.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "classpath:wsdl/rgsXTv13-notifyGameInProgress.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public RgsXTServiceV13NotifyGameInProgress(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public RgsXTServiceV13NotifyGameInProgress(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public RgsXTServiceV13NotifyGameInProgress() {
        super(WSDL_LOCATION, SERVICE);
    }

    public RgsXTServiceV13NotifyGameInProgress(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public RgsXTServiceV13NotifyGameInProgress(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public RgsXTServiceV13NotifyGameInProgress(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns RgsXTv13NotifyGameInProgress
     */
    @WebEndpoint(name = "RgsXTv13NotifyGameInProgress")
    public RgsXTv13NotifyGameInProgress getRgsXTv13NotifyGameInProgress() {
        return super.getPort(RgsXTv13NotifyGameInProgress, RgsXTv13NotifyGameInProgress.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns RgsXTv13NotifyGameInProgress
     */
    @WebEndpoint(name = "RgsXTv13NotifyGameInProgress")
    public RgsXTv13NotifyGameInProgress getRgsXTv13NotifyGameInProgress(WebServiceFeature... features) {
        return super.getPort(RgsXTv13NotifyGameInProgress, RgsXTv13NotifyGameInProgress.class, features);
    }

}