package com.cjl;


import javax.jws.WebService;

@WebService
public interface MyService {

    public String hello(String name);
}
