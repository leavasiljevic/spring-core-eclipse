 package com.in28min.spring.basic.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.in28min.spring.basic.springin5steps.xml.XmlPersonDAO;


public class SpringIn5StepsXMLContextApplication {
	
	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsComponentScanApplication.class);
	
	public static void main(String[] args) {
		
		
		try (ClassPathXmlApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("applicationContext.xml")) {
			
			LOGGER.info("Beans Loadder -> {}",
					(Object)applicationContext.getBeanDefinitionNames());
//			[xmlJdbcConnection, xmlPersonDAO]
		
			XmlPersonDAO personDAO= 
					applicationContext.getBean(XmlPersonDAO.class);
			
			LOGGER.info("{} {}", personDAO, personDAO.getXmlJdbcConnection());		
		}
	}
}
