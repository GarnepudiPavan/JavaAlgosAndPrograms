package com.daily.java.problemsolving;

import java.util.ArrayList;
import java.util.List;

public class StringMatchExists {
	private String givenString;
	private String patternString;
	
	public StringMatchExists(String string1, String string2) {
		this.givenString = string1;
		this.patternString = string2;
	}

	public boolean checkPatternMatches() {
		return givenString.toLowerCase().contains(patternString.toLowerCase());
	}
	
	public List<Integer> indexFinder() {
	
	List<Integer> indexList = new ArrayList<Integer>();
		int givenLen = givenString.length();
		int patternLen = patternString.length();
		
		for(int i=0; i<givenLen; i++) {
			if((i+patternLen)>givenLen) {
				System.out.println("Given String length is"+" "+givenLen+" "+"PatternMatch string lenghth is"+" "+patternLen);
				System.out.println("Reached end of Given String.");
				
				break;
			}
			
			else if(patternString.equalsIgnoreCase(givenString.substring(i, i+patternLen))) {
				indexList.add(i);
			}
		}
		return indexList;
	}
	
	public static void main(String args[]) {
		StringMatchExists object = new StringMatchExists("CowMilkisGoodforhealth.DrinkMilkofDesicow","cow");
		if(object.checkPatternMatches()) {
			for(Integer values : object.indexFinder()) {
			System.out.println("Givern pattern is found at index"+" "+values);
			}
		}
			}
	}
	

