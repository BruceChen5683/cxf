
package com.cjl6;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.cjl package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetPersonById_QNAME = new QName("http://cjl.com/", "getPersonById");
    private final static QName _GetPersonByIdResponse_QNAME = new QName("http://cjl.com/", "getPersonByIdResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.cjl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link IdType }
     * 
     */
    public IdType createIdType() {
        return new IdType();
    }

    /**
     * Create an instance of {@link PersonType }
     * 
     */
    public PersonType createPersonType() {
        return new PersonType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IdType }{@code >}
     */
    @XmlElementDecl(namespace = "http://cjl.com/", name = "getPersonById")
    public JAXBElement<IdType> createGetPersonById(IdType value) {
        return new JAXBElement<IdType>(_GetPersonById_QNAME, IdType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PersonType }{@code >}
     */
    @XmlElementDecl(namespace = "http://cjl.com/", name = "getPersonByIdResponse")
    public JAXBElement<PersonType> createGetPersonByIdResponse(PersonType value) {
        return new JAXBElement<PersonType>(_GetPersonByIdResponse_QNAME, PersonType.class, null, value);
    }

}
