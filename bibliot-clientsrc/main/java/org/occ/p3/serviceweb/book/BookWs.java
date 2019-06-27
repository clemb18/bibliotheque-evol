
package org.occ.p3.serviceweb.book;

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
@WebService(name = "bookWs", targetNamespace = "http://book.serviceWeb.p3.occ.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BookWs {


    /**
     * 
     */
    @WebMethod
    @RequestWrapper(localName = "init", targetNamespace = "http://book.serviceWeb.p3.occ.org/", className = "org.occ.p3.serviceweb.book.Init")
    @ResponseWrapper(localName = "initResponse", targetNamespace = "http://book.serviceWeb.p3.occ.org/", className = "org.occ.p3.serviceweb.book.InitResponse")
    @Action(input = "http://book.serviceWeb.p3.occ.org/bookWs/initRequest", output = "http://book.serviceWeb.p3.occ.org/bookWs/initResponse")
    public void init();

    /**
     * 
     * @param arg0
     * @return
     *     returns org.occ.p3.serviceweb.book.Book
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getBookById", targetNamespace = "http://book.serviceWeb.p3.occ.org/", className = "org.occ.p3.serviceweb.book.GetBookById")
    @ResponseWrapper(localName = "getBookByIdResponse", targetNamespace = "http://book.serviceWeb.p3.occ.org/", className = "org.occ.p3.serviceweb.book.GetBookByIdResponse")
    @Action(input = "http://book.serviceWeb.p3.occ.org/bookWs/getBookByIdRequest", output = "http://book.serviceWeb.p3.occ.org/bookWs/getBookByIdResponse")
    public Book getBookById(
        @WebParam(name = "arg0", targetNamespace = "")
        Integer arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns org.occ.p3.serviceweb.book.Book
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "saveNewBook", targetNamespace = "http://book.serviceWeb.p3.occ.org/", className = "org.occ.p3.serviceweb.book.SaveNewBook")
    @ResponseWrapper(localName = "saveNewBookResponse", targetNamespace = "http://book.serviceWeb.p3.occ.org/", className = "org.occ.p3.serviceweb.book.SaveNewBookResponse")
    @Action(input = "http://book.serviceWeb.p3.occ.org/bookWs/saveNewBookRequest", output = "http://book.serviceWeb.p3.occ.org/bookWs/saveNewBookResponse")
    public Book saveNewBook(
        @WebParam(name = "arg0", targetNamespace = "")
        Book arg0);

}
