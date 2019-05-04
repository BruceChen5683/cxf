package com.cjl;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

public class MyClient {
    public static void main(String[] args) {
        JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();

        jaxWsProxyFactoryBean.setAddress("http://localhost:8080/myservice");
        jaxWsProxyFactoryBean.setServiceClass(MyService.class);

        MyService service = (MyService) jaxWsProxyFactoryBean.create();

        System.out.println(System.currentTimeMillis());
        System.out.println(service+","+service.getClass().getSuperclass());


        System.out.println(service.hello("from Java"));
        System.out.println(System.currentTimeMillis());

    }
}
