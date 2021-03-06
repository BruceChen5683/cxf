package com.cjl4;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.3.1
 * 2019-05-23T08:40:26.852+08:00
 * Generated source version: 3.3.1
 *
 */
@WebService(targetNamespace = "http://cjl.com/", name = "MyService")
@XmlSeeAlso({ObjectFactory.class})
public interface MyService {

    @WebMethod
    @RequestWrapper(localName = "hello2", targetNamespace = "http://cjl.com/", className = "com.cjl.Hello2")
    @ResponseWrapper(localName = "hello2Response", targetNamespace = "http://cjl.com/", className = "com.cjl.Hello2Response")
    @WebResult(name = "return", targetNamespace = "")
    public String hello2(
            @WebParam(name = "arg0", targetNamespace = "")
                    String arg0,
            @WebParam(name = "arg1", targetNamespace = "")
                    String arg1
    );

    @WebMethod
    @RequestWrapper(localName = "hello", targetNamespace = "http://cjl.com/", className = "com.cjl.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://cjl.com/", className = "com.cjl.HelloResponse")
    @WebResult(name = "helloResult", targetNamespace = "")
    public String hello(
            @WebParam(name = "name", targetNamespace = "")
                    String name
    );
}
