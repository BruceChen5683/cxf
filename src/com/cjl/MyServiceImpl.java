package com.cjl;

public class MyServiceImpl implements MyService {
    @Override
    public String hello(String name) {
        System.out.println("hello is invoked "+name);
        return "hello:"+name;
    }
}
