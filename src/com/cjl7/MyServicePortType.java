package com.cjl7;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.3.1
 * 2019-06-01T21:48:15.734+08:00
 * Generated source version: 3.3.1
 *
 */
@WebService(targetNamespace = "http://cjl.com/", name = "MyServicePortType")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface MyServicePortType {

    @WebMethod
    @WebResult(name = "getPersonByIdResponse", targetNamespace = "http://cjl.com/", partName = "parameters")
    public PersonType getPersonById(
            @WebParam(partName = "parameters", name = "getPersonByIdRequest", targetNamespace = "http://cjl.com/")
                    IdType parameters
    );
}
