package com.cjl;


import javax.jws.WebService;

@WebService
public interface MyService {

    public String hello(String name);

    public String hello2(String name,String password);
}
