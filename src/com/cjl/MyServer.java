package com.cjl;


import org.apache.cxf.endpoint.Server;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

public class MyServer {
    public static void main(String[] args) {

        try {
            JaxWsServerFactoryBean sf = new JaxWsServerFactoryBean();
            sf.setServiceClass(MyServiceImpl.class);
            sf.setAddress("http://localhost:8080/myservice");
            Server server = sf.create();
            server.start();
        }catch (Exception e){
            e.printStackTrace();
        }finally {

        }


    }
}
