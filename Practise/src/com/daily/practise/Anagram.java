package com.daily.practise;

import java.time.Instant;
import java.util.Arrays;
import java.util.List;

public class Anagram {

	String string1;
	String string2;
	long startTime;
	long endTime;

	public Anagram(String string1, String string2) {
		this.string1 = string1.toLowerCase().replace(" ","");
		this.string2 = string2.toLowerCase().replace(" ","");;
	}

	public void checkAnagram() {
		startTime = Instant.now().toEpochMilli();
		if (string1.length() == string2.length()) {
			System.out.println("Given Strings are of same length hence checking if they are anagram");
			char[] charArray = string1.toCharArray();
			// List<String> listString = Arrays.asList(string2.toCharArray().toString());
			int counter = 0;
			for (int i = 0; i < charArray.length; i++) {
				if (string2.contains(String.valueOf(charArray[i]))) {
					counter++;
				}
			}
			System.out.println("Counter value is.." + " " + counter);
			System.out.println("CharArray and String1 length value is.." + " " + charArray.length + " "
					+ string1.length() + "resp");
			if (counter == charArray.length) {
				System.out.println("Given Strings are anagram");
			} else {
				System.out.println("Given Strings are Not anagram");
			}
			endTime = Instant.now().toEpochMilli();
		} else {
			System.out.println("Not An anagram");
		}
	}

	public void checkAnagramusingSort() {
		char[] array1 = string1.toCharArray();
		Arrays.sort(array1);
		char[] array2 = string2.toCharArray();
		Arrays.sort(array2);
		
		if (Arrays.equals(array1, array2)) {
			System.out.println("Given Strings are anagram check done with sort");
		} else {
			System.out.println("Given Strings are Not anagram check done with sort");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Anagram object1 = new Anagram("Is he Aradhya", "he is hradaya");
		object1.checkAnagram();
		object1.checkAnagramusingSort();
		System.out.println("Time taken is" + " " + (object1.endTime - object1.startTime) + "ms");
	}

}
