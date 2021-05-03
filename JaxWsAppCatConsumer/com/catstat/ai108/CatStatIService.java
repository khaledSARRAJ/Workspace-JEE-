
package com.catstat.ai108;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CatStatIService", targetNamespace = "http://ai108.catstat.com")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CatStatIService {


    /**
     * 
     * @return
     *     returns java.lang.Long
     */
    @WebMethod
    @WebResult(name = "nbUser", targetNamespace = "http://ai108.catstat.com")
    @RequestWrapper(localName = "getNbUser", targetNamespace = "http://ai108.catstat.com", className = "com.catstat.ai108.GetNbUser")
    @ResponseWrapper(localName = "getNbUserResponse", targetNamespace = "http://ai108.catstat.com", className = "com.catstat.ai108.GetNbUserResponse")
    public Long getNbUser();

    /**
     * 
     * @return
     *     returns java.lang.Long
     */
    @WebMethod
    @WebResult(name = "nbCat", targetNamespace = "http://ai108.catstat.com")
    @RequestWrapper(localName = "getNbCat", targetNamespace = "http://ai108.catstat.com", className = "com.catstat.ai108.GetNbCat")
    @ResponseWrapper(localName = "getNbCatResponse", targetNamespace = "http://ai108.catstat.com", className = "com.catstat.ai108.GetNbCatResponse")
    public Long getNbCat();

}
