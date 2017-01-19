package com.daily.java.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

import java.util.List;

public class RemoveDuplicatesWithSet {

	Integer Array[] = { new Integer(10), new Integer(11), new Integer(10), new Integer(12), new Integer(13),
			new Integer(11), new Integer(14), new Integer(15), new Integer(16) };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveDuplicatesWithSet obj1 = new RemoveDuplicatesWithSet();
		int dupValue = 0;
		//UseLinkedHashSet if elements need to be sorted else use HashSet.
		Set<Integer> checkDup = new LinkedHashSet<Integer>();
		List<Integer> intValue = (List<Integer>) Arrays.asList(obj1.Array);

		ArrayList<Integer> dupOnly = new ArrayList<Integer>();
		Arrays.sort(obj1.Array);
		for (Integer i : intValue) {
			if (checkDup.add(i)) {
				System.out.println("value" + " " + i + " " + "Is not duplicate");
			} else {
				System.out.println("Dulicate value found is" + " " + i);
				dupOnly.add(i);
				dupValue++;

			}
		}
		System.out.println("Total number of duplicates found are" + " " + dupValue);
		System.out.println("duplicates found are" + " " + dupOnly);
		// Collections.sort(checkDup, null);
		Iterator<Integer> i1 = checkDup.iterator();
		while (i1.hasNext()) {
			System.out.println("Integer values after removing duplicates are" + " " + i1.next());
		}

	}

}
