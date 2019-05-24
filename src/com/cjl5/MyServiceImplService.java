package com.cjl5;

import com.cjl.MyService;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.3.1
 * 2019-05-24T08:19:21.237+08:00
 * Generated source version: 3.3.1
 *
 */
@WebServiceClient(name = "MyServiceImplService",
                  wsdlLocation = "file:/home/battlecall/myservice.xml",
                  targetNamespace = "http://cjl.com/")
public class MyServiceImplService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://cjl.com/", "MyServiceImplService");
    public final static QName MyServiceImplPort = new QName("http://cjl.com/", "MyServiceImplPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/home/battlecall/myservice.xml");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(MyServiceImplService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/home/battlecall/myservice.xml");
        }
        WSDL_LOCATION = url;
    }

    public MyServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public MyServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MyServiceImplService() {
        super(WSDL_LOCATION, SERVICE);
    }





    /**
     *
     * @return
     *     returns MyService
     */
    @WebEndpoint(name = "MyServiceImplPort")
    public com.cjl.MyService getMyServiceImplPort() {
        return super.getPort(MyServiceImplPort, com.cjl.MyService.class);
    }

    /**
     *
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MyService
     */
    @WebEndpoint(name = "MyServiceImplPort")
    public com.cjl.MyService getMyServiceImplPort(WebServiceFeature... features) {
        return super.getPort(MyServiceImplPort, MyService.class, features);
    }

}
