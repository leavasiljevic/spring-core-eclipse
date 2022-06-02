 package com.in28min.spring.basic.springin5steps;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.in28min.spring.basic.springin5steps.basic.BinarySearchImpl;

//@SpringBootApplication
@Configuration
@ComponentScan("com.in28min.spring.basic.springin5steps")
public class SpringIn5StepsBasicApplication {
	
	// Where are the beans?
	// Where are the dependences of beans?
	// Where to search for beans? => NO need

	public static void main(String[] args) {
		
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new  QuickSortAlgorithm());
		
		//Application context
//		ApplicationContext applicationContex  = 
//				new AnnotationConfigApplicationContext(SpringIn5StepsBasicApplication.class);
		
		
		try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				SpringIn5StepsComponentScanApplication.class)) {
		
			BinarySearchImpl binarySearch = 
					applicationContext.getBean(BinarySearchImpl.class);
			
			BinarySearchImpl binarySearch2 = 
					applicationContext.getBean(BinarySearchImpl.class);
			
			System.out.println(binarySearch);
			System.out.println(binarySearch2);
			
			int result = binarySearch.binarySearch(new int [] { 12, 4, 6}, 3);
			System.out.println(result);
		}
	}
}
