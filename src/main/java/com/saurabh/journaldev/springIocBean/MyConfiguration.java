package com.saurabh.journaldev.springIocBean;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("com.saurabh.journaldev.springIocBean")
public class MyConfiguration {

	@Bean
	MyService getService(){
		return new MyService();
	}
	
	@Bean
	@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	MyAnnotaedBean getAnnotationService(){
		return new MyAnnotaedBean();
	}
	
}
