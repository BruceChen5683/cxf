
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.cjl4;

import com.cjl.MyService;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.3.1
 * 2019-05-23T08:40:26.802+08:00
 * Generated source version: 3.3.1
 *
 */

@WebService(
                      serviceName = "MyServiceImplService",
                      portName = "MyServiceImplPort",
                      targetNamespace = "http://cjl.com/",
                      wsdlLocation = "file:///home/battlecall/myservice.xml",
                      endpointInterface = "com.cjl.MyService")

public class MyServiceImplPortImpl implements MyService {

    private static final Logger LOG = Logger.getLogger(MyServiceImplPortImpl.class.getName());

    /* (non-Javadoc)
     * @see com.cjl.MyService#hello2(java.lang.String arg0, java.lang.String arg1)*
     */
    public String hello2(String arg0, String arg1) {
        LOG.info("Executing operation hello2");
        System.out.println(arg0);
        System.out.println(arg1);
        try {
            String _return = "";
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.cjl.MyService#hello(java.lang.String name)*
     */
    public String hello(String name) {
        LOG.info("Executing operation hello");
        System.out.println(name);
        try {
            String _return = "";
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
