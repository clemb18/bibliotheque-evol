
package org.occ.p3.client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "userWeb", targetNamespace = "http://serviceWeb.p3.occ.org/", wsdlLocation = "http://localhost:8080/serviceWeb/ws/userWs?wsdl")
public class UserWeb
    extends Service
{

    private final static URL USERWEB_WSDL_LOCATION;
    private final static WebServiceException USERWEB_EXCEPTION;
    private final static QName USERWEB_QNAME = new QName("http://serviceWeb.p3.occ.org/", "userWeb");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/serviceWeb/ws/userWs?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        USERWEB_WSDL_LOCATION = url;
        USERWEB_EXCEPTION = e;
    }

    public UserWeb() {
        super(__getWsdlLocation(), USERWEB_QNAME);
    }

    public UserWeb(WebServiceFeature... features) {
        super(__getWsdlLocation(), USERWEB_QNAME, features);
    }

    public UserWeb(URL wsdlLocation) {
        super(wsdlLocation, USERWEB_QNAME);
    }

    public UserWeb(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, USERWEB_QNAME, features);
    }

    public UserWeb(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public UserWeb(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns UserWs
     */
    @WebEndpoint(name = "userWsPort")
    public UserWs getUserWsPort() {
        return super.getPort(new QName("http://serviceWeb.p3.occ.org/", "userWsPort"), UserWs.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns UserWs
     */
    @WebEndpoint(name = "userWsPort")
    public UserWs getUserWsPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://serviceWeb.p3.occ.org/", "userWsPort"), UserWs.class, features);
    }

    private static URL __getWsdlLocation() {
        if (USERWEB_EXCEPTION!= null) {
            throw USERWEB_EXCEPTION;
        }
        return USERWEB_WSDL_LOCATION;
    }

}
