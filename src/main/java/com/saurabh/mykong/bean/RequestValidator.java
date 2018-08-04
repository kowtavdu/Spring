package com.saurabh.mykong.bean;

import java.util.ArrayList;
import java.util.List;

public class RequestValidator {

	private List<String> errorMessages = new ArrayList<String>();
	
	public RequestValidator(){
		System.out.println("validator instance is created");
	}
	
	public void validate(String requestId){
	System.out.println("called in validae method "+requestId);
	}
	public List<String> getErrorMessages(){
		return errorMessages;
	}
}
