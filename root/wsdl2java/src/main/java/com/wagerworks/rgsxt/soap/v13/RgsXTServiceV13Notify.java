package com.wagerworks.rgsxt.soap.v13;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.6
 * 2018-09-06T09:36:33.277+08:00
 * Generated source version: 3.2.6
 *
 */
@WebServiceClient(name = "RgsXTServiceV13Notify",
                  wsdlLocation = "classpath:wsdl/rgsXTv13-notify.wsdl",
                  targetNamespace = "http://www.wagerworks.com/rgsXT/soap/v13/")
public class RgsXTServiceV13Notify extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.wagerworks.com/rgsXT/soap/v13/", "RgsXTServiceV13Notify");
    public final static QName RgsXTv13Notify = new QName("http://www.wagerworks.com/rgsXT/soap/v13/", "RgsXTv13Notify");
    static {
        URL url = RgsXTServiceV13Notify.class.getClassLoader().getResource("wsdl/rgsXTv13-notify.wsdl");
        if (url == null) {
            java.util.logging.Logger.getLogger(RgsXTServiceV13Notify.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "classpath:wsdl/rgsXTv13-notify.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public RgsXTServiceV13Notify(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public RgsXTServiceV13Notify(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public RgsXTServiceV13Notify() {
        super(WSDL_LOCATION, SERVICE);
    }

    public RgsXTServiceV13Notify(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public RgsXTServiceV13Notify(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public RgsXTServiceV13Notify(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns RgsXTv13Notify
     */
    @WebEndpoint(name = "RgsXTv13Notify")
    public RgsXTv13Notify getRgsXTv13Notify() {
        return super.getPort(RgsXTv13Notify, RgsXTv13Notify.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns RgsXTv13Notify
     */
    @WebEndpoint(name = "RgsXTv13Notify")
    public RgsXTv13Notify getRgsXTv13Notify(WebServiceFeature... features) {
        return super.getPort(RgsXTv13Notify, RgsXTv13Notify.class, features);
    }

}