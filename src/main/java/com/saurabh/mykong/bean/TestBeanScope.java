package com.saurabh.mykong.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBeanScope {

	public static void main(String args[]){
		//System.out.println("Hello in am here ");
	  /*ApplicationContext ctx = new ClassPathXmlApplicationContext("bean-scope.xml");
	  CustomerService cs = (CustomerService)ctx.getBean("customerService");
	  cs.setMessage("Message by customer A");
	  System.out.println("Message : "+cs.getMessage());
	  
	  
	  CustomerService cs1 = (CustomerService)ctx.getBean("customerService");
	  System.out.println("Message : "+cs1.getMessage());*/
	  
	  //validator
	  ApplicationContext ctx2 = new ClassPathXmlApplicationContext("bean-injection.xml");
	  
	  RequestProcessor rProcess = (RequestProcessor)ctx2.getBean("requestProcessor");
	  
	  rProcess.handleRequest("1");
	  
	  rProcess.handleRequest("2");
	  
	  rProcess.handleRequest("3");
	  
	  
	}
}
