package com.saurabh.tp.innerbean;


public class TextEditor {

	private SpellChecker spellChecker;
	
	public TextEditor(SpellChecker spellChecker){
		System.out.println("Inside TextEditor constructor");
		this.spellChecker = spellChecker;
	}
	
	public void spellCheck(){
		this.spellChecker.checkingSpell();
	}
}
