
package com.microsoft.ai108;

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
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Ai108IService", targetNamespace = "http://ai108.microsoft.com")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Ai108IService {


    /**
     * 
     * @param i
     * @param j
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(name = "additionResult", targetNamespace = "http://ai108.microsoft.com")
    @RequestWrapper(localName = "addition", targetNamespace = "http://ai108.microsoft.com", className = "com.microsoft.ai108.Addition")
    @ResponseWrapper(localName = "additionResponse", targetNamespace = "http://ai108.microsoft.com", className = "com.microsoft.ai108.AdditionResponse")
    @Action(input = "http://ai108.microsoft.com/Ai108IService/additionRequest", output = "http://ai108.microsoft.com/Ai108IService/additionResponse")
    public int addition(
        @WebParam(name = "i", targetNamespace = "")
        int i,
        @WebParam(name = "j", targetNamespace = "")
        int j);

    /**
     * 
     * @param a
     * @param b
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(name = "powResult", targetNamespace = "http://ai108.microsoft.com")
    @RequestWrapper(localName = "pow", targetNamespace = "http://ai108.microsoft.com", className = "com.microsoft.ai108.Pow")
    @ResponseWrapper(localName = "powResponse", targetNamespace = "http://ai108.microsoft.com", className = "com.microsoft.ai108.PowResponse")
    @Action(input = "http://ai108.microsoft.com/Ai108IService/powRequest", output = "http://ai108.microsoft.com/Ai108IService/powResponse")
    public double pow(
        @WebParam(name = "a", targetNamespace = "")
        double a,
        @WebParam(name = "b", targetNamespace = "")
        double b);

    /**
     * 
     * @param inputPerson
     * @return
     *     returns com.microsoft.ai108.Personne
     */
    @WebMethod
    @WebResult(name = "personResult", targetNamespace = "")
    @RequestWrapper(localName = "serialTest", targetNamespace = "http://ai108.microsoft.com", className = "com.microsoft.ai108.SerialTest")
    @ResponseWrapper(localName = "serialTestResponse", targetNamespace = "http://ai108.microsoft.com", className = "com.microsoft.ai108.SerialTestResponse")
    @Action(input = "http://ai108.microsoft.com/Ai108IService/serialTestRequest", output = "http://ai108.microsoft.com/Ai108IService/serialTestResponse")
    public Personne serialTest(
        @WebParam(name = "inputPerson", targetNamespace = "")
        Personne inputPerson);

}
