
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
@WebServiceClient(name = "bookWeb", targetNamespace = "http://serviceWeb.p3.occ.org/", wsdlLocation = "http://localhost:8080/serviceWeb/ws/bookWs?wsdl")
public class BookWeb
    extends Service
{

    private final static URL BOOKWEB_WSDL_LOCATION;
    private final static WebServiceException BOOKWEB_EXCEPTION;
    private final static QName BOOKWEB_QNAME = new QName("http://serviceWeb.p3.occ.org/", "bookWeb");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/serviceWeb/ws/bookWs?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        BOOKWEB_WSDL_LOCATION = url;
        BOOKWEB_EXCEPTION = e;
    }

    public BookWeb() {
        super(__getWsdlLocation(), BOOKWEB_QNAME);
    }

    public BookWeb(WebServiceFeature... features) {
        super(__getWsdlLocation(), BOOKWEB_QNAME, features);
    }

    public BookWeb(URL wsdlLocation) {
        super(wsdlLocation, BOOKWEB_QNAME);
    }

    public BookWeb(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, BOOKWEB_QNAME, features);
    }

    public BookWeb(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BookWeb(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns BookWs
     */
    @WebEndpoint(name = "bookWsPort")
    public BookWs getBookWsPort() {
        return super.getPort(new QName("http://serviceWeb.p3.occ.org/", "bookWsPort"), BookWs.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BookWs
     */
    @WebEndpoint(name = "bookWsPort")
    public BookWs getBookWsPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://serviceWeb.p3.occ.org/", "bookWsPort"), BookWs.class, features);
    }

    private static URL __getWsdlLocation() {
        if (BOOKWEB_EXCEPTION!= null) {
            throw BOOKWEB_EXCEPTION;
        }
        return BOOKWEB_WSDL_LOCATION;
    }

}
