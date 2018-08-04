package com.saurabh.journaldev.springIocBean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyMainClass {

	public static void main(String args[]){
		System.out.println("Hello i am here");
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MyConfiguration.class);
		MyService srv = ctx.getBean(MyService.class);
		srv.log("Hello Service");
		System.out.println("@@@@@@@@@@srv "+srv.hashCode());
		MyService srv1 = ctx.getBean(MyService.class);
		System.out.println("@@@@@@@@@@srv1 "+srv1.hashCode());
		
		
		MyAnnotaedBean annsrv = ctx.getBean(MyAnnotaedBean.class);
		System.out.println("@@@@@@@@@@annsrv "+annsrv.hashCode());
		
		MyAnnotaedBean annsrv1 = ctx.getBean(MyAnnotaedBean.class);
		System.out.println("@@@@@@@@@@annsrv1 "+annsrv1.hashCode());
	}
}
