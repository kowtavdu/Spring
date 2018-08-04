package com.saurabh.saurabh.tp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String args[]){
		
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
		Address add =  (Address)ctx.getBean("address");
		add.setAddressLine("Gola Ka Mandir");
		add.setPinCode("474006");
		
		Student std =  (Student)ctx.getBean("student");
		std.setName("saurabh");
		std.setRollNo("38967");
		
		System.out.println("Hello i am Here.."+std);
		
		
	}
}
