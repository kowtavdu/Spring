package com.saurabh.journaldev.driver;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class MainTest {

	public static void main(String[] args) {
		AbstractApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
		DatabaseDriver oracleDriver = (DatabaseDriver) appContext.getBean("oracleDriver", DatabaseDriver.class);
		System.out.println(oracleDriver.getInfo());
		
		DatabaseDriver mysqlDriver = (DatabaseDriver) appContext.getBean("mysqlDriver", DatabaseDriver.class);
		System.out.println(mysqlDriver.getInfo());
		
		System.out.println("UserService Information");
		UserService userService = appContext.getBean(UserService.class);
		System.out.println(userService.getDbDriver());

		appContext.close();
	}
}
