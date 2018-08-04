package com.saurabh.saurabh.tp;

import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor {

	//@Autowired
	private SpellChecker spChecker;

	public SpellChecker getSpChecker() {
		return spChecker;
	}

	@Autowired
	public TextEditor(SpellChecker spChecker){
		System.out.println("Inside TextEditor Constructor");
		this.spChecker = spChecker;
	}
	/*public void setSpChecker(SpellChecker spChecker) {
		this.spChecker = spChecker;
	}*/
	
	public void spellCheck(){
		spChecker.checkSpelling();	
	}
}
