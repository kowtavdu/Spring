package com.saurabh.journaldev.di;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("com.saurabh.journaldev.di")
@Configuration
public class MyBean {

	@Bean
	SendMessageService emailSrv(){
		return new EmailService();
	}
	
	@Bean
	SendMessageService twitterSrv(){
		return new TwitterService();
	}
}
