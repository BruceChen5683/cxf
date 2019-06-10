package com.cjl.cxf.spring;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
public interface MyService {
    @WebResult(name = "helloResult")
    public String hello(@WebParam(name = "username") String username);
}
