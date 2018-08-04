package com.saurabh.journaldev.di;

public class TwitterService implements SendMessageService {

	public void sendMessage(String recevier, String msg) {	
	 System.out.println("send Message through twitter Messgae: "+msg+", receiver "+recevier);
	}

}
