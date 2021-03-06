package com.wagerworks.rgsxt.soap.v13;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.6
 * 2018-09-06T09:36:23.699+08:00
 * Generated source version: 3.2.6
 *
 */
@WebServiceClient(name = "RgsXTServiceV13Init",
                  wsdlLocation = "classpath:wsdl/rgsXTv13-init.wsdl",
                  targetNamespace = "http://www.wagerworks.com/rgsXT/soap/v13/")
public class RgsXTServiceV13Init extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.wagerworks.com/rgsXT/soap/v13/", "RgsXTServiceV13Init");
    public final static QName RgsXTv13Init = new QName("http://www.wagerworks.com/rgsXT/soap/v13/", "RgsXTv13Init");
    static {
        URL url = RgsXTServiceV13Init.class.getClassLoader().getResource("wsdl/rgsXTv13-init.wsdl");
        if (url == null) {
            java.util.logging.Logger.getLogger(RgsXTServiceV13Init.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "classpath:wsdl/rgsXTv13-init.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public RgsXTServiceV13Init(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public RgsXTServiceV13Init(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public RgsXTServiceV13Init() {
        super(WSDL_LOCATION, SERVICE);
    }

    public RgsXTServiceV13Init(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public RgsXTServiceV13Init(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public RgsXTServiceV13Init(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns RgsXTv13Init
     */
    @WebEndpoint(name = "RgsXTv13Init")
    public RgsXTv13Init getRgsXTv13Init() {
        return super.getPort(RgsXTv13Init, RgsXTv13Init.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns RgsXTv13Init
     */
    @WebEndpoint(name = "RgsXTv13Init")
    public RgsXTv13Init getRgsXTv13Init(WebServiceFeature... features) {
        return super.getPort(RgsXTv13Init, RgsXTv13Init.class, features);
    }

}
