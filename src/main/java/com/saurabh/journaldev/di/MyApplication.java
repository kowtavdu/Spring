package com.saurabh.journaldev.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component
@Service
public class MyApplication {

	SendMessageService sendSrv;
	
	@Qualifier("twitterSrv")
	@Autowired
	public void setSendSrv(SendMessageService sendSrv) {
		this.sendSrv = sendSrv;
	}

	/*@Autowired
	MyApplication(SendMessageService sendSrv){
		this.sendSrv = sendSrv;
	}*/
	
	public void processMessage(String receiver, String msg){
		this.sendSrv.sendMessage(receiver, msg);
	}
}
