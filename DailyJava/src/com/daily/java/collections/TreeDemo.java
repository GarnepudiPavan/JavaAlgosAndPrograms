package com.daily.java.collections;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> setObj1 = new TreeSet<String>();
		Map<Integer, String> mapObj1 = new TreeMap<Integer, String>();

		// Adding Entries into TreeSet
		for (int i = 0; i < 10; i++) {
			setObj1.add("TreeSetElement" + i);
		}

		// adding Entries to TreeMap
		Integer int1 = new Integer(10); 
		for (int i = 0; i < 10; i++) {
			mapObj1.put(int1 + i, "TreeMap Value"+ i);
		}

		// Extracting values from TreeSet

		for (String s : setObj1) {
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

	}

}
