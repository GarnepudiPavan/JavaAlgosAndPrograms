package com.daily.practise;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

/**
 * Pangram is a sentence that contains all 26 chars of english language.
 * Example: THE QUICK BROWN FOX JUMPS OVER LAZY DOG Just extact all chars and
 * put them in a SET. Check if size of set is 26. If given string has got all 26
 * alpabets then it is a Panagram if any charc are repeated and still length of
 * string is 26. Set will eliminate repeated chars and hence it's length will be
 * less than 26.
 * 
 * @author gv
 *
 */
public class Pangram {
	String string1;
	Map<String, Integer> panVal = new HashMap<>();

	public Pangram(String string1) {
		this.string1 = string1.toLowerCase().replace(" ", "");
		/*
		 * panVal.put("A", 0);panVal.put("B", 0);panVal.put("C", 0); panVal.put("D",
		 * 0);panVal.put("E", 0);panVal.put("F", 0); panVal.put("G", 0);panVal.put("H",
		 * 0);panVal.put("I", 0); panVal.put("J", 0);panVal.put("K", 0);panVal.put("L",
		 * 0); panVal.put("M", 0);panVal.put("N", 0);panVal.put("O", 0); panVal.put("P",
		 * 0);panVal.put("Q", 0);panVal.put("R", 0); panVal.put("S", 0);panVal.put("T",
		 * 0);panVal.put("U", 0); panVal.put("V", 0);panVal.put("W", 0);panVal.put("X",
		 * 0); panVal.put("Y", 0);panVal.put("Z", 0);
		 */
	}

	public void pangramCheck() {
		char[] charVal = string1.toCharArray();
		Set<String> panStringVal = new HashSet<>();

		if (string1.length() >= 26) {
			for (int i = 0; i < charVal.length; i++) {
				panStringVal.add(String.valueOf(charVal[i]));

			}
			System.out.println("Length of Set with extracted chars from string" + " " + panStringVal.size());
			if (panStringVal.size() == 26) {

				System.out.println("Given string" + " " + string1 + " " + "is a panagram");
			} else {
				System.out.println("Given string" + " " + string1 + " " + "is NOT a panagram");
			}
		} else {
			System.out.println("NOT a Panagram." + " " + "Please, try with a new string..");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pangram object1 = new Pangram("THE QUICK BROWN FOX JUMPS OVER LAZY DOG");
		System.out.println("Given string is " + " " + object1.string1);
		object1.pangramCheck();
	}

}
