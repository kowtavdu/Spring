package com.saurabh.spring.spring_practice_project;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value={"com.saurabh.spring.spring_practice_project"})
public class DIConfiguration {

	@Bean
	public MyService getMessageService(){
		return new EmailService();
	}
}
