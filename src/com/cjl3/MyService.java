package com.cjl3;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.3.1
 * 2019-05-05T07:53:44.593+08:00
 * Generated source version: 3.3.1
 *
 */
@WebService(targetNamespace = "http://cjl3.com/", name = "MyService")
@XmlSeeAlso({ObjectFactory.class})
public interface MyService {

    @WebMethod
    @RequestWrapper(localName = "hello2", targetNamespace = "http://cjl3.com/", className = "com.cjl3.Hello2")
    @ResponseWrapper(localName = "hello2Response", targetNamespace = "http://cjl3.com/", className = "com.cjl3.Hello2Response")
    @WebResult(name = "return", targetNamespace = "")
    public String hello2(
            @WebParam(name = "arg0", targetNamespace = "")
                    String arg0,
            @WebParam(name = "arg1", targetNamespace = "")
                    String arg1
    );

    @WebMethod
    @RequestWrapper(localName = "hello", targetNamespace = "http://cjl3.com/", className = "com.cjl3.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://cjl3.com/", className = "com.cjl3.HelloResponse")
    @WebResult(name = "helloResult", targetNamespace = "")
    public String hello(
            @WebParam(name = "customNameParm", targetNamespace = "")
                    String customNameParm
    );
}
