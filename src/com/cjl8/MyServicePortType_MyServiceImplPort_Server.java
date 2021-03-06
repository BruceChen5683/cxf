
package com.cjl8;

import javax.xml.ws.Endpoint;

/**
 * This class was generated by Apache CXF 3.3.1
 * 2019-06-04T21:41:51.497+08:00
 * Generated source version: 3.3.1
 *
 */

public class MyServicePortType_MyServiceImplPort_Server{

    protected MyServicePortType_MyServiceImplPort_Server() throws Exception {
        System.out.println("Starting Server");
        Object implementor = new MyServiceImplPortImpl();
        String address = "http://localhost:8080/myservice";
        Endpoint.publish(address, implementor);
    }

    public static void main(String args[]) throws Exception {
        new MyServicePortType_MyServiceImplPort_Server();
        System.out.println("Server ready...");

        Thread.sleep(5 * 60 * 1000);
        System.out.println("Server exiting");
        System.exit(0);
    }
}
