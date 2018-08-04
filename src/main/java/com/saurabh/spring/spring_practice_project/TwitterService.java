package com.saurabh.spring.spring_practice_project;

public class TwitterService implements MyService {

	public boolean sendMessage(String msg, String rec) {
		// TODO Auto-generated method stub
		System.out.println("twitted message sent to "+rec+" with message "+msg);
		return true;
	}

}
