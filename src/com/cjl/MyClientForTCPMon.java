package com.cjl;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

public class MyClientForTCPMon {
    public static void main(String[] args) {
        JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();

        jaxWsProxyFactoryBean.setAddress("http://localhost:5555/myservice");
        jaxWsProxyFactoryBean.setServiceClass(MyService.class);

        MyService service = (MyService) jaxWsProxyFactoryBean.create();
        System.out.println(service+","+service.getClass().getSuperclass());


        System.out.println(service.hello("from Java"));
    }
}
