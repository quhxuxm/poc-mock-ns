package com.wagerworks.rgsxt.soap.v13;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.6
 * 2018-09-06T09:36:36.341+08:00
 * Generated source version: 3.2.6
 *
 */
@WebServiceClient(name = "RgsXTServiceV13HeartBeat",
                  wsdlLocation = "classpath:wsdl/rgsXTv13-heartBeat.wsdl",
                  targetNamespace = "http://www.wagerworks.com/rgsXT/soap/v13/")
public class RgsXTServiceV13HeartBeat extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.wagerworks.com/rgsXT/soap/v13/", "RgsXTServiceV13HeartBeat");
    public final static QName RgsXTv13HeartBeat = new QName("http://www.wagerworks.com/rgsXT/soap/v13/", "RgsXTv13HeartBeat");
    static {
        URL url = RgsXTServiceV13HeartBeat.class.getClassLoader().getResource("wsdl/rgsXTv13-heartBeat.wsdl");
        if (url == null) {
            java.util.logging.Logger.getLogger(RgsXTServiceV13HeartBeat.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "classpath:wsdl/rgsXTv13-heartBeat.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public RgsXTServiceV13HeartBeat(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public RgsXTServiceV13HeartBeat(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public RgsXTServiceV13HeartBeat() {
        super(WSDL_LOCATION, SERVICE);
    }

    public RgsXTServiceV13HeartBeat(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public RgsXTServiceV13HeartBeat(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public RgsXTServiceV13HeartBeat(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns RgsXTv13HeartBeat
     */
    @WebEndpoint(name = "RgsXTv13HeartBeat")
    public RgsXTv13HeartBeat getRgsXTv13HeartBeat() {
        return super.getPort(RgsXTv13HeartBeat, RgsXTv13HeartBeat.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns RgsXTv13HeartBeat
     */
    @WebEndpoint(name = "RgsXTv13HeartBeat")
    public RgsXTv13HeartBeat getRgsXTv13HeartBeat(WebServiceFeature... features) {
        return super.getPort(RgsXTv13HeartBeat, RgsXTv13HeartBeat.class, features);
    }

}