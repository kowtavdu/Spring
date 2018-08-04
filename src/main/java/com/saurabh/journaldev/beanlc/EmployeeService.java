package com.saurabh.journaldev.beanlc;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class EmployeeService implements InitializingBean, DisposableBean{

	private Employee emp;

	public EmployeeService(){
		System.out.println("Called in EmployeeService Constructor");
	}
	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Employee closing resource");
	}
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Employee Initializing to Dummy Value");
		if(emp.getName() == null){
			emp.setName("Saurabh");
		}
	}
	
	
}
