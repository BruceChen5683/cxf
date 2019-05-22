package com.jaxb;

import com.sun.jmx.remote.internal.Unmarshal;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;

public class JaxbTest {
    public static void main(String[] args) {
        try {
            JAXBContext context = JAXBContext.newInstance(People.class);

            Marshaller marshaller = context.createMarshaller();

            People people = new People();
            people.setId(11);
            people.setUsername("none");
            people.setPassword("wd");


            Restaurant restaurant = new Restaurant();
            restaurant.setRestaurantName("huandao restaurant");
            restaurant.setRestaurantAddress("shangdi huandao");

            School school = new School();
            school.setSchoolName("tsinghua university");
            school.setRestaurant(restaurant);
            school.setSchoolAddress("beijing");

            people.setSchool(school);

            marshaller.marshal(people,System.out);



            Unmarshaller unmarshaller = context.createUnmarshaller();


            String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><ns2:myroot xmlns:ns2=\"com.jaxb\"><id>11</id><password>wd</password><hahaha>none22</hahaha></ns2:myroot>\n";

            People people1 = (People) unmarshaller.unmarshal(new StringReader(xml));
            System.out.println(people1);



        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
