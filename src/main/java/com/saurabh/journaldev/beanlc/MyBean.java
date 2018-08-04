package com.saurabh.journaldev.beanlc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.saurabh.journaldev.beanlc")
public class MyBean {

	/*@Bean
	EmployeeService empSerBean(){
		return new EmployeeService();
	}*/
	
	@Bean
	MyService mySerBean(){
		return new MyService();
	}
}
