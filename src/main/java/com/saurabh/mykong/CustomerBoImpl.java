package com.saurabh.mykong;

/**
 * @author saurabh
 *
 */
public class CustomerBoImpl implements CustomerBo{

	public void addCustomer(){
		System.out.println("Add customer is running");
	}

	public String addCustomerReturnValue() {
		// TODO Auto-generated method stub
		System.out.println(" addCustomerReturnValue is running	");
		return "abc";
	}

	public void addCustomerThrowException() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("addCustomerThrowException is running");
		throw new Exception("Generic Error");
	}

	public void addCustomerAround(String name) {
		// TODO Auto-generated method stub
		System.out.println("addCustomerAround is running, args "+name);
	}
	
	
}
