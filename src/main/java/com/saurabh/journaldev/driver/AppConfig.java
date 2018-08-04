package com.saurabh.journaldev.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@ComponentScan("com.saurabh.journaldev")
@PropertySource("classpath:oracledatabase.properties")
public class AppConfig {
	
	@Autowired
	Environment environment;

	@Bean
	DatabaseDriver oracleDriver(){
		OracleDriver orDriver = new OracleDriver();
		orDriver.setDriver(environment.getProperty("db.driver"));
		orDriver.setPassword(environment.getProperty("db.password"));
		orDriver.setPort(Integer.parseInt(environment.getProperty("db.port")));
		orDriver.setUrl(environment.getProperty("db.url"));
		orDriver.setUsername(environment.getProperty("db.username"));
		return orDriver;
	}
	
	@Bean
	DatabaseDriver mysqlDriver(){
		return new MySqlDriver();
	}
}
