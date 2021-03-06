
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.cjl6;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * This class was generated by Apache CXF 3.3.1
 * 2019-05-30T08:10:52.515+08:00
 * Generated source version: 3.3.1
 *
 */

@javax.jws.WebService(
                      serviceName = "MyServiceImplService",
                      portName = "MyServiceImplPort",
                      targetNamespace = "http://cjl.com/",
                      wsdlLocation = "file:src/com/cjl6/myservice.wsdl",
                      endpointInterface = "com.cjl6.MyServicePortType")

public class MyServiceImplPortImpl implements MyServicePortType {

    private static final Logger LOG = Logger.getLogger(MyServiceImplPortImpl.class.getName());

    /* (non-Javadoc)
     * @see com.cjl.MyServicePortType#getPersonById(com.cjl.IdType parameters)*
     */
    public com.cjl6.PersonType getPersonById(IdType parameters) {

        PersonType personType = new PersonType();
        personType.setAddress("shanghai");
        personType.setName("cjl");
        personType.setDate(this.data2XMLGregorianCalendar(new Date()));
        return personType;
    }

    private XMLGregorianCalendar data2XMLGregorianCalendar(Date date){
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        XMLGregorianCalendar xmlGregorianCalendar = null;
        try {
            xmlGregorianCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(calendar);
        }catch (Exception e){
            e.printStackTrace();
        }
        return xmlGregorianCalendar;
    }

}
