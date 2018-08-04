package com.saurabh.mykong.bean;

public class RequestProcessor {
	private RequestValidator validator;
	public void handleRequest(String requestId){
		RequestValidator validator = validator();
        validator.validate(requestId);
        // Process the request and update
    }
 
    public RequestValidator getValidator() {
        return validator;
    }
 
    public void setValidator(RequestValidator validator) {
        this.validator= validator;
    }
    
    public RequestValidator validator() {
    	  return null;
    	 }
    
    
}
