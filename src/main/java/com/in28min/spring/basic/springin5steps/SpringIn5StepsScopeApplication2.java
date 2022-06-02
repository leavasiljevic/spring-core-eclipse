 package com.in28min.spring.basic.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.in28min.spring.basic.springin5steps.basic.BinarySearchImpl;
import com.in28min.spring.basic.springin5steps.scope.PersonDAO;

//@SpringBootApplication


@Configuration
@ComponentScan
public class SpringIn5StepsScopeApplication2 {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsScopeApplication2.class);
			
	public static void main(String[] args) {

		
		//Application context
		//ApplicationContext applicationContex  = SpringApplication.run(SpringIn5StepsScopeApplication2.class, args);
		
		try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				SpringIn5StepsComponentScanApplication.class)) {
			
			PersonDAO personDAO = applicationContext.getBean(PersonDAO.class);
			
			PersonDAO personDAO2 = applicationContext.getBean(PersonDAO.class);
			
			LOGGER.info("{}", personDAO);
			LOGGER.info("{}", personDAO.getJdbcConnection());		
			LOGGER.info("{}", personDAO.getJdbcConnection());		
			
			LOGGER.info("{}", personDAO2);
			LOGGER.info("{}", personDAO2.getJdbcConnection());	
		}
	}
}
