package com.saurabh.tp.innerbean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@ComponentScan
@Configuration("com.saurabh.tp.innerbean")
public class MyBean {

	@Bean
	@Lazy
	public TextEditor textBean(){
		return new TextEditor(spellBean());
	}
	
	@Bean
	public SpellChecker spellBean(){
		return new SpellChecker();
	}
	
}
