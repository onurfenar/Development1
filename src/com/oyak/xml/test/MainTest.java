package com.oyak.xml.test;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import com.oyak.xml.GolfCountryClub;

public class MainTest {

	public static void main(String[] args) {
		
		try {
			File file = new File("/Users/onur/primefaces/XmlProcessorV1/src/com/oyak/xml/GolfCountryClub.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(GolfCountryClub.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			GolfCountryClub element = (GolfCountryClub) jaxbUnmarshaller.unmarshal(file);
			System.out.println("----myOutput----");
					
			System.out.println(element.getEmployee().get(0).getFirstName());
			System.out.println(element.getEmployee().get(1).getFirstName());
			
			System.out.println(element.getGolfCourse().get(0).getYardage());
			System.out.println(element.getGolfCourse().get(1).getYardage());
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
