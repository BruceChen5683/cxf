package com.cjl.cxf.spring;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Client {
    public static void main(String[] args) {

        XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("WEB-INF/applicationContext.xml"));

        MyService myService = (MyService) factory.getBean("myServiceClient");

        System.out.println("Client.main "+myService.hello("cjl"));
    }
}
