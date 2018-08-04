package com.saurabh.journaldev.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext cntx = new AnnotationConfigApplicationContext(MyBean.class);
		MyApplication emServ = cntx.getBean(MyApplication.class);
		emServ.processMessage("GauraV", "Enjoying Spring Season");
	}
}
