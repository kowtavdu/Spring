package com.saurabh.mykong;

import java.util.Arrays;
/*
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

@Aspect
public class LoggingAspect {

	@Before("execution(* com.saurabh.mykong.CustomerBo.addCustomer(..))")
	public void logBefor(JoinPoint jointPoint){
		System.out.println("Log before is running");
		System.out.println("hiJacked "+jointPoint.getSignature().getName());
		System.out.println("*****");
	}
	
	@After("execution(* com.saurabh.mykong.CustomerBo.addCustomer(..))")
	public void logAfter(JoinPoint jointPoint){
		System.out.println("Log After is running");
		System.out.println("hijacked "+ jointPoint.getSignature().getName());
		System.out.println("*********");
	}
	
	@AfterReturning(pointcut="execution(* com.saurabh.mykong.CustomerBo.addCustomerReturnValue(..))", returning="result")
	public void logAfterReturning(JoinPoint jointPoint, Object result){
		System.out.println("Log for After returning value");
		System.out.println("hijacked "+ jointPoint.getSignature().getName() + "Value "+result);
		System.out.println("*********");
	}
	
	@AfterThrowing(pointcut="execution(* com.saurabh.mykong.CustomerBo.addCustomerThrowException(..))",throwing="error")
	public void logAfterThrowing(JoinPoint jointPoint, Throwable error){
		System.out.println("LogAfterThrowing is running!");
		System.out.println("hijacked : "+ jointPoint.getSignature().getName());
		System.out.println("Execption : "+error);
		System.out.println("*******");
	}
	
	@Around("execution(* com.saurabh.mykong.CustomerBo.addCustomerAround(..))")
	public void logAround(ProceedingJoinPoint jointpoint) throws Throwable {
		System.out.println("logAround is running");
		System.out.println("hijacked method "+jointpoint.getSignature().getName());
		System.out.println("hijacked arguments "+Arrays.toString(jointpoint.getArgs()));
		System.out.println("Around before is running");
		jointpoint.proceed();
		System.out.println("Around after is running");
		System.out.println("*********");
	}
}
*/