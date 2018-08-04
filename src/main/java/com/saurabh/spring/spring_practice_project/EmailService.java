package com.saurabh.spring.spring_practice_project;

public class EmailService implements MyService{

	public boolean sendMessage(String msg, String rec) {
		// TODO Auto-generated method stub
		System.out.println("Eail send to"+rec+ " with message "+msg);
		return true;
	}

	
}
