
package org.occ.p3.client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebService(name = "bookWs", targetNamespace = "http://serviceWeb.p3.occ.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BookWs {


    /**
     * 
     */
    @WebMethod
    @RequestWrapper(localName = "init", targetNamespace = "http://serviceWeb.p3.occ.org/", className = "org.occ.p3.serviceweb.Init")
    @ResponseWrapper(localName = "initResponse", targetNamespace = "http://serviceWeb.p3.occ.org/", className = "org.occ.p3.serviceweb.InitResponse")
    @Action(input = "http://serviceWeb.p3.occ.org/bookWs/initRequest", output = "http://serviceWeb.p3.occ.org/bookWs/initResponse")
    public void init();

    /**
     * 
     * @param arg0
     * @return
     *     returns org.occ.p3.serviceweb.Book
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getBookById", targetNamespace = "http://serviceWeb.p3.occ.org/", className = "org.occ.p3.serviceweb.GetBookById")
    @ResponseWrapper(localName = "getBookByIdResponse", targetNamespace = "http://serviceWeb.p3.occ.org/", className = "org.occ.p3.serviceweb.GetBookByIdResponse")
    @Action(input = "http://serviceWeb.p3.occ.org/bookWs/getBookByIdRequest", output = "http://serviceWeb.p3.occ.org/bookWs/getBookByIdResponse")
    public Book getBookById(
        @WebParam(name = "arg0", targetNamespace = "")
        Integer arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns org.occ.p3.serviceweb.Book
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "saveNewBook", targetNamespace = "http://serviceWeb.p3.occ.org/", className = "org.occ.p3.serviceweb.SaveNewBook")
    @ResponseWrapper(localName = "saveNewBookResponse", targetNamespace = "http://serviceWeb.p3.occ.org/", className = "org.occ.p3.serviceweb.SaveNewBookResponse")
    @Action(input = "http://serviceWeb.p3.occ.org/bookWs/saveNewBookRequest", output = "http://serviceWeb.p3.occ.org/bookWs/saveNewBookResponse")
    public Book saveNewBook(
        @WebParam(name = "arg0", targetNamespace = "")
        Book arg0);

}
