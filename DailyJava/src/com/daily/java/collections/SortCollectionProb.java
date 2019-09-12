package com.daily.java.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Problem- Given an Array of Strings with duplicates, find duplicate strings and count of duplicates present/ number of times string is repeated in array. 
 * Arrange the Strings as well.
 * 
 * Solution:- Convert Array of String to Array List and add all elements to a Set. While adding to set add them to a Map as well. If Add element to set is successful (true) then
 * add String object as Key and integer 1 as value. If String object is duplicate then add to Set will fail. In Else logic include replace Map method to update count value for that Key alone.
 * 
 * Implementation:- This can be achieved without using Comparator Method by using simple Collections.
 *  
 * Step1:- Convert Array to a List and copy it to ArrayList.
 * Step2:- Copy the contents to a Set implementation class LinkedHashSet (That preserves insertion order) / any Set imp as Final map will not retain sort order.
 * Add method of Set implementation class returns boolean- False if object being added is already present in Set. Here add values to Map.
 * Step3:- This has main logic. We need to use TreeMap implementation class of Map as it stores Keys in increasing order. And in Step2 add non duplicate values as shown below and 
 * if String object as already present in Set only update Value in Map using mapObject.replace method by replacing Value with duplicate count for Key which is repeated in Array. 
 * @author Pavan
 *
 */

public class SortCollectionProb {
	public static void main(String args[]) {
		String array1[] = { "RAMU", "SHAMU", "GANGA", "RAMU", "BHAKT", "KRISHNA", "BHAKT" };
		Arrays.sort(array1);
		for (String s : array1) {
			System.out.println("Sorted array is" + " " + s);
		}
		int dupCount = 0;
		List<String> temp = (List<String>) Arrays.asList(array1);
		ArrayList<String> temp1 = new ArrayList<String>(temp);
		for (String s : temp1) {
			System.out.println("Sorted ArrayList is" + " " + s);
		}
		Collections.sort(temp1);

		Set<String> sortedList = new LinkedHashSet<String>();
		
		Map<String, Integer> finalValues = new TreeMap<String, Integer>();

		for (String s : temp1) {
			if (sortedList.add(s)) {
				// count = count + 1;
				finalValues.put(s, 1);
				// count = 0;
			} else {
				dupCount = finalValues.get(s) + 1;
				finalValues.replace(s, finalValues.get(s), dupCount);
				// dupCount = 0;
			}

		}

		for (String s : sortedList) {
			System.out.println("Sorted LinkedHashSet is" + " " + s);
		}
		
		for (

		Map.Entry<String, Integer> display : finalValues.entrySet()) {
			System.out.print("Final Map Keys are" + " " + display.getKey());
			System.out.print(" " + "Final dup count is" + " " + display.getValue());
			System.out.println(" ");
		}

	}
}