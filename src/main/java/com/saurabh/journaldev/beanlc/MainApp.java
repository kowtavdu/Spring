package com.saurabh.journaldev.beanlc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MyBean.class);
		MyService srv = (MyService) ctx.getBean("mySerBean");
		ctx.close();
	}
}
