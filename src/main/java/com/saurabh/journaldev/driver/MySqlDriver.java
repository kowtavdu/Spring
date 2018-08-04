package com.saurabh.journaldev.driver;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:mysqldatabase.properties")
public class MySqlDriver implements DatabaseDriver{

	
	@Value("${databaseName}")
    private String databaseName;
    @Value("${disableStatementPooling}")
    private String disableStatementPooling;
	
	public String getInfo() {
		// TODO Auto-generated method stub
		return "[ Driver: mySql" +
        ", databaseName: " + databaseName +
        ", disableStatementPooling: " + disableStatementPooling +
        " ]";
	}
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer propertyConfigInDev() {
		return new PropertySourcesPlaceholderConfigurer();
	}

}
