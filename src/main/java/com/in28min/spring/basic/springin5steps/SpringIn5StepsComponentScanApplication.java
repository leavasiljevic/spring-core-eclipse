 package com.in28min.spring.basic.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.in28min.spring.basic.componentscan.ComponentDAO;
import com.in28min.spring.basic.springin5steps.basic.BinarySearchImpl;
import com.in28min.spring.basic.springin5steps.scope.PersonDAO;

//@SpringBootApplication

@Configuration
@ComponentScan(" com.in28min.spring.basic.componentscan")
public class SpringIn5StepsComponentScanApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsComponentScanApplication.class);
			
	public static void main(String[] args) {

		
		//Application context
		//ApplicationContext applicationContex  = SpringApplication.run(SpringIn5StepsComponentScanApplication.class, args);
		
		try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				SpringIn5StepsComponentScanApplication.class)) {
		
			ComponentDAO componentDAO = applicationContext.getBean(ComponentDAO.class);
		
			LOGGER.info("{}", componentDAO);
		}

	}
}
