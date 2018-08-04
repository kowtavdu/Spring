package com.saurabh.saurabh.tp;

public class Address {

	private String AddressLine;
	public String getAddressLine() {
		return AddressLine;
	}
	
	public Address(){
		System.out.println("inside Address Constructor");
	}
	public void setAddressLine(String addressLine) {
		AddressLine = addressLine;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	private String pinCode;
	
	public String toString(){
		return "[AddressLine "+this.AddressLine+" pinCode "+this.pinCode+"]";
	}
}
