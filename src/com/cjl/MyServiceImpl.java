package com.cjl;

public class MyServiceImpl implements MyService {
    @Override
    public String hello(String name) {
        System.out.println("hello is invoked "+name);
        return "hello:"+name;
    }

    @Override
    public String hello2(String name, String password) {
        System.out.println("hello2 is invoked");
        return "";
    }
}
