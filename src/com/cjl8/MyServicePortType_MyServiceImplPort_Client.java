
package com.cjl8;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.3.1
 * 2019-06-03T22:29:15.713+08:00
 * Generated source version: 3.3.1
 *
 */
public final class MyServicePortType_MyServiceImplPort_Client {

    private static final QName SERVICE_NAME = new QName("http://cjl.com/", "MyServiceImplService");

    private MyServicePortType_MyServiceImplPort_Client() {
    }

    public static void main(String args[]) throws Exception {
        URL wsdlURL = MyServiceImplService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) {
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }

        MyServiceImplService ss = new MyServiceImplService(wsdlURL, SERVICE_NAME);
        MyServicePortType port = ss.getMyServiceImplPort();

        {
        System.out.println("Invoking getPersonById...");
        com.cjl8.IdType _getPersonById_parameters = null;
        com.cjl8.PersonType _getPersonById__return = port.getPersonById(_getPersonById_parameters);
        System.out.println("getPersonById.result=" + _getPersonById__return);


        }

        System.exit(0);
    }

}
