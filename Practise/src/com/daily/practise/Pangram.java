package com.daily.practise;

import java.util.regex.Pattern;

/**
 * Pangram is a sentence that contains all 26 chars of english language. Example:
 * THE QUICK BROWN FOX JUMPS OVER LAZY DOG
 * @author gv
 *
 */
public class Pangram {
	String string1;
	
	public Pangram(String string1) {
		this.string1=string1.toLowerCase().replace(" ","");
	}

	public boolean pangramCheck() {
		
	return	string1.matches("[a-z]*$");
		
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pangram object1 = new Pangram(" QUICK BROWN FOX JUMPS OVER LAZY DOG");
	System.out.println("Given string is pangram"+" "+object1.pangramCheck());
	}

}
