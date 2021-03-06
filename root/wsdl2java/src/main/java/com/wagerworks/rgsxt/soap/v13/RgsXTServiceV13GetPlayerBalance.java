package com.wagerworks.rgsxt.soap.v13;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.6
 * 2018-09-06T09:36:42.740+08:00
 * Generated source version: 3.2.6
 *
 */
@WebServiceClient(name = "RgsXTServiceV13GetPlayerBalance",
                  wsdlLocation = "classpath:wsdl/rgsXTv13-getPlayerBalance.wsdl",
                  targetNamespace = "http://www.wagerworks.com/rgsXT/soap/v13/")
public class RgsXTServiceV13GetPlayerBalance extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.wagerworks.com/rgsXT/soap/v13/", "RgsXTServiceV13GetPlayerBalance");
    public final static QName RgsXTv13GetPlayerBalance = new QName("http://www.wagerworks.com/rgsXT/soap/v13/", "RgsXTv13GetPlayerBalance");
    static {
        URL url = RgsXTServiceV13GetPlayerBalance.class.getClassLoader().getResource("wsdl/rgsXTv13-getPlayerBalance.wsdl");
        if (url == null) {
            java.util.logging.Logger.getLogger(RgsXTServiceV13GetPlayerBalance.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "classpath:wsdl/rgsXTv13-getPlayerBalance.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public RgsXTServiceV13GetPlayerBalance(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public RgsXTServiceV13GetPlayerBalance(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public RgsXTServiceV13GetPlayerBalance() {
        super(WSDL_LOCATION, SERVICE);
    }

    public RgsXTServiceV13GetPlayerBalance(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public RgsXTServiceV13GetPlayerBalance(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public RgsXTServiceV13GetPlayerBalance(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns RgsXTv13GetPlayerBalance
     */
    @WebEndpoint(name = "RgsXTv13GetPlayerBalance")
    public RgsXTv13GetPlayerBalance getRgsXTv13GetPlayerBalance() {
        return super.getPort(RgsXTv13GetPlayerBalance, RgsXTv13GetPlayerBalance.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns RgsXTv13GetPlayerBalance
     */
    @WebEndpoint(name = "RgsXTv13GetPlayerBalance")
    public RgsXTv13GetPlayerBalance getRgsXTv13GetPlayerBalance(WebServiceFeature... features) {
        return super.getPort(RgsXTv13GetPlayerBalance, RgsXTv13GetPlayerBalance.class, features);
    }

}
