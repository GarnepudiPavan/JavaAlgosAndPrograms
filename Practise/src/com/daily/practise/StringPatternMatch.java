package com.daily.practise;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringPatternMatch {
	String givenString = "";
	String patternString = "";

	public StringPatternMatch(String givenString, String patternString) {
		this.givenString = givenString;
		this.patternString = patternString;
		
	}
	
	public boolean patternMatcher() {
		return givenString.toLowerCase().contains(patternString.toLowerCase());
	}

	public void returnIndex() {

		for (int i = 0; i < givenString.length(); i++) {
			if (i + patternString.length() > givenString.length()) {
				System.out.println("Index i value is.."+" "+i+" "+"Given String length is"+" "+givenString.length());
				System.out.println("Pattern string length.."+" "+patternString.length());
				System.out.println("Reached end of string for comparison..");
				break;
			}
			if (patternString.equalsIgnoreCase(givenString.substring(i, i + patternString.length()))) {
				System.out.println("Pattern is present at index" + " " + i);

			}
		}
	}

	public static void main(String args[]) {

		StringPatternMatch obj1 = new StringPatternMatch("Brainy", "Binary");
		long before, after;
		before = Instant.now().toEpochMilli();
		System.out.println("String length" + " " + obj1.givenString.length());
		System.out.println("Before starting the method" + " " + before);
		System.out.println("Pattern exists and is found is" + " " + obj1.patternMatcher());
		if (obj1.patternMatcher()) {
			obj1.returnIndex();
			after = Instant.now().toEpochMilli();
			System.out.println("After starting the method" + " " + after + " " + "Diff is " + " " + (after - before));
		} else {
			System.out.println("String does not have any matching pattern");
		}

	}

}
