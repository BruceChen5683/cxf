package com.cjl.cxf.spring;

public class MyServiceImpl implements MyService{
    @Override
    public String hello(String username) {
        System.out.println("MyServiceImpl.hello");

        return "Hello "+username;
    }
}
