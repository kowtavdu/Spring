package com.saurabh.journaldev.di;

public class EmailService implements SendMessageService{

	public void sendMessage(String recevier, String msg) {
		// TODO Auto-generated method stub
		System.out.println("send Message through Email Messgae: "+msg+", receiver "+recevier);
	}

}
