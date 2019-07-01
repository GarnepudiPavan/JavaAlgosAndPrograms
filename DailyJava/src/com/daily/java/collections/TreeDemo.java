package com.daily.java.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> treeSetObj = new TreeSet<String>();
		Map<Integer, String> mapObj1 = new TreeMap<Integer, String>();
		Set<String> hashSetObj = new HashSet<String>();
		Set<String> linkedhashSetObj = new LinkedHashSet<String>();
		// Adding Entries into TreeSet
		for (int i = 0; i < 10; i++) {
			treeSetObj.add("TreeSetElement" + i);
		}

		// adding Entries to TreeMap
		Integer int1 = new Integer(10);
		for (int i = 0; i < 10; i++) {
			mapObj1.put(int1 + i, "TreeMap Value" + i);
		}

		// Extracting values from TreeSet

		for (String s : treeSetObj) {
			System.out.println("Values from TreeSet" + " " + s);
		}

		// Extracting values from TreeMap based on keySet Method
		
		for (Integer s : mapObj1.keySet()) {
			System.out.println("Values in TreeMap extracted using keySet() and then get(key)" + " " + mapObj1.get(s));
		}
		for (Map.Entry<Integer, String> s : mapObj1.entrySet()) {
			System.out.println("TreeMap key and values extracted using entrySet()" + " " + "Key Value is" + " : "
					+ s.getKey() + " " + "Value from TreeMap is" + " : " + s.getValue());
		}

		// HashSet
		// adding objects to HashSet

		hashSetObj.add("hashset1");
		hashSetObj.add("hashset2");
		hashSetObj.add("hashset3");
		hashSetObj.add("hashset4");
		hashSetObj.remove("hashset4");
		System.out.println("Hashset implements Set Iterface and order of Objects is in increasing order");
		for (String s : hashSetObj) {
			System.out.println("Values from hashset" + " " + s);
		}

		
		

		//LinkedHashSet is impl class of Set Interface that preserves insertion order adding objects to HashSet
			
			linkedhashSetObj.add("linkedhashSetObj1");
			linkedhashSetObj.add("linkedhashSetObj2");
			linkedhashSetObj.add("linkedhashSetObj3");
			linkedhashSetObj.add("linkedhashSetObj4");
			linkedhashSetObj.remove("linkedhashSetObj4"); 
			System.out.println("LinkedHashset implements Set Interface and extends HashSet class. Preserves order of insertion.");
			for(String s: linkedhashSetObj){
				System.out.println("Values from LinkedHashSet" +" "+ s);
			}
			
		
		
		
	}
}
