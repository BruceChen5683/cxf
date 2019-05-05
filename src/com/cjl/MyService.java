package com.cjl;


import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
public interface MyService {

    @WebResult(name = "helloResult")
    public String hello(@WebParam(name = "name") String name);

    public String hello2(String name,String password);
}
