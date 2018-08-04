package com.saurabh.tp.innerbean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyAppTest {

	public static void main(String args[]){
		System.out.println("Hello Inside inner bean class");
		
	 AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MyBean.class);
	 TextEditor text = (TextEditor) ctx.getBean("textBean");
	 //SpellChecker text = (SpellChecker) ctx.getBean("spellBean");
	 text.spellCheck();
	 
	}
}
