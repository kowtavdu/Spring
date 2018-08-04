package com.saurabh.spring.spring_practice_project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class MyApplication {

	private MyService myService;

	public MyService getMyService() {
		return myService;
	}

	@Autowired
	public void setMyService(MyService myService) {
		this.myService = myService;
	}
	
    public boolean processMessage(String msg, String rec){
    	return myService.sendMessage(msg, rec);
    }	
}
