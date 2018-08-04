package com.saurabh.mykong;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAop {

	public static void main(String args[]) throws Exception{
		//System.out.println("Hello I am here....");
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Spring-Customer.xml");
		
		CustomerBo cust = (CustomerBo) ctx.getBean("customerBo");
		//cust.addCustomer();
		//cust.addCustomerReturnValue();
		cust.addCustomerAround("saurabh");;
		
	}
}
