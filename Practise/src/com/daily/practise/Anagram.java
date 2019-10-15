package com.daily.practise;

import java.time.Instant;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*Examples of Anagram Listen and Silent
 * Binary and Brainy, Aradhya and hradaya
 * 
 * 
 */
public class Anagram {

	String string1;
	String string2;
	long startTime;
	long endTime;

	public Anagram(String string1, String string2) {
		this.string1 = string1.toLowerCase().replace(" ","");
		this.string2 = string2.toLowerCase().replace(" ","");;
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
		Map<String, Integer> map1 = new  HashMap<String, Integer>();
		Map<String, Integer> map2 = new  HashMap<String, Integer>();
		int counter=0;
		for (int i = 0; i < string1.length(); i++) {
			String temp = String.valueOf(string1.charAt(i));
			if(map1.containsKey(temp)) {
			map1.put(temp, map1.get(temp)+1);
			}else {
				map1.put(temp, counter);
			}
		}
		for (int i = 0; i < string2.length(); i++) {
			String temp1 = String.valueOf(string2.charAt(i));
			if(map2.containsKey(temp1)) {
			map2.put(temp1, map2.get(temp1)+1);
			}else {
				map2.put(temp1, counter);
			}
		}
		for (Map.Entry<String, Integer> values : map1.entrySet()) {
			System.out.println("Char from map1" + " " + values.getKey());
			System.out.println("Values from map1" + " " + values.getValue());
		}
		for (Map.Entry<String, Integer> values1 : map2.entrySet()) {
			System.out.println("Char from map2" + " " + values1.getKey());
			System.out.println("Values from map2" + " " + values1.getValue());
		}
		if(map1.equals(map2)) {
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
		object1.checkAnagramusingSort();
		System.out.println("Time taken is" + " " + (object1.endTime - object1.startTime) + "ms");
		object1.anaCheckWithMapAndNoSort();
	}

}
