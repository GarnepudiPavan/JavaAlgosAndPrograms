package com.daily.practise;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

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
			System.out.println("charArray length is" + " " + charArray.length);
			System.out.println("String2 length is.." + " " + string2.length());
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

	public boolean anaCheckWithMapAndNoSort() {
		boolean isAnagram;
		if(string1.length()==string2.length()) {
		Map<String, Integer> list1 = new LinkedHashMap<String, Integer>();
		Map<String, Integer> list2 = new LinkedHashMap<String, Integer>();
		int counter=0;
		for (int i = 0; i < string1.length(); i++) {
			if(list1.containsKey(string1.charAt(i))) {
			list1.put(String.valueOf(string1.charAt(i)), counter+1);
			}else {
				list1.put(String.valueOf(string1.charAt(i)), counter);
			}
		}
		for (int i = 0; i < string2.length(); i++) {
			if(list2.containsKey(string2.charAt(i))) {
			list2.put(String.valueOf(string2.charAt(i)), counter+1);
			}else {
				list2.put(String.valueOf(string2.charAt(i)), counter);
			}
		}
		for (Map.Entry<String, Integer> values : list1.entrySet()) {
			System.out.println("Char from list1" + " " + values.getKey());
			System.out.println("Values from list1" + " " + values.getValue());
		}
		for (Map.Entry<String, Integer> values : list2.entrySet()) {
			System.out.println("Char from list1" + " " + values.getKey());
			System.out.println("Values from list1" + " " + values.getValue());
		}
		if(list1.equals(list2)) {
			System.out.println("Given Strings" + " " + string1+" "+string2+" "+"are Anagram");
			isAnagram = true;
		}else {
			System.out.println("Given Strings" + " " + string1+" "+string2+" "+"are NOT Anagram");
			isAnagram=false;
		}}
		else {
			System.out.println("Given Strings" + " " + string1+" "+string2+" "+"are NOT Anagram");
			isAnagram = false;
		}
		return isAnagram;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Anagram object1 = new Anagram("Aradhya", "hradaya");
		object1.checkAnagram();
		object1.checkAnagramusingSort();
		System.out.println("Time taken is" + " " + (object1.endTime - object1.startTime) + "ms");
		object1.anaCheckWithMapAndNoSort();
	}

}
