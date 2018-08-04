package com.saurabh.saurabh.tp;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {

	@Autowired
	public Student(Address add){
		System.out.println("Called inside Constructor");
		this.add = add;
	}
	private Address add;
	public Address getAdd() {
		return add;
	}
	@Autowired
	public void setAdd(Address add) {
		System.out.println("Called inside Setter");
		this.add = add;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRollNo() {
		return rollNo;
	}
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	private String name;
	private String rollNo;
	
	public String toString(){
		return "[name "+this.name+" rollno "+this.rollNo+" Address "+this.add+"]";
	}
}
