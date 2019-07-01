package com.daily.java.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapInJavaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map1 = new HashMap<String, Integer>();
		Integer i1 = new Integer(11);
		//HashMap allows one null entry in Key
		map1.put(null, 00);
		map1.put("AAA", 00);
		// Adding element to above map
		for (int i = 0; i < 10; i++) {
			map1.put("Member" + i, i1 + i);
		}

		// Extracting Key from Map and then obtaining corresponding values
		Set<String> set1 = map1.keySet();
		Iterator<String> it1 = set1.iterator();
		while (it1.hasNext()) {
			System.out.println("Extracting from MAP using KeySet()" + " " + map1.get(it1.next()));
			
		}
		// Without using Iterator

		for (String s : map1.keySet()) {
			System.out.println("MAP values extracted using For Each" + " " + map1.get(s));
		}

		// Extracting entries of MAP using EntrySet()
		Set<Map.Entry<String, Integer>> set2 = map1.entrySet();
		Iterator<Map.Entry<String, Integer>> iterator2 = set2.iterator();
		while (iterator2.hasNext()) {
			System.out.println("Retrieving MAP content using EntrySet" + " " + iterator2.next());
		}

		// Using For each instead of iterator

		for (Map.Entry<String, Integer> s : map1.entrySet()) {
			System.out.println("Map values extracted using ENtrySet and For Each" + " " + "Key is" + " : " + s.getKey()
					+ " " + "Value is" + " : " + s.getValue());

		}
	}

}
