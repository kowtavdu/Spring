package com.saurabh.journaldev.beanlc;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class MyService {

	public MyService(){
		System.out.println("Called in MyService COnstructor");
	}
	@PostConstruct
	public void init(){
		System.out.println("Called in MyService Init Method");
	}
	@PreDestroy
	public void destroy(){
		System.out.println("Called in MyService destroy Method");
	}
}
