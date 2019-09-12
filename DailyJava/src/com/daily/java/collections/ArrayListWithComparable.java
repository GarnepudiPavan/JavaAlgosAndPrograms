package com.daily.java.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListWithComparable implements Comparable<ArrayListWithComparable> {

	String name;

	public ArrayListWithComparable(String name) {
		this.name = name;
	}

	/**
	 * Below method is method compareTo of Comparable interface that must be
	 * overwritten to sort custom objects CompareTo method returns o if both
	 * objects are equal. +ve if invoking object is > passed Object. -ve if
	 * invoking object is less than passed object.
	 * 
	 * @param e
	 * @return
	 */
	public int compareTo(ArrayListWithComparable e) {
		int value = name.compareTo(e.name);
		System.out.println("Comparison of values" + " " + name + " " + e.getName() + " " + value);
		return value;
	}

	public String getName() {
		return name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> arrayList1 = new ArrayList<String>();
		arrayList1.add("B");
		arrayList1.add("A");
		arrayList1.add("D");
		arrayList1.add("C");
		System.out.println("Before sorting" + " " + arrayList1);
		Collections.sort(arrayList1);
		System.out.println("After sorting" + " " + arrayList1);

		// ArrayList of type above class

		ArrayList<ArrayListWithComparable> arrayList2 = new ArrayList<ArrayListWithComparable>();
		arrayList2.add(new ArrayListWithComparable("Ratan"));
		arrayList2.add(new ArrayListWithComparable("Munna"));
		arrayList2.add(new ArrayListWithComparable("Akbar"));
		for (ArrayListWithComparable obj : arrayList2) // For-each lop is needed
														// for iterating through
														// ArrayList of Custom
														// Object
			System.out.println("ArrayList of Custom class type collection before sort" + " " + obj.getName());
		Collections.sort(arrayList2);// This statement works for ArrayList of
										// Custom Object only if that Object
										// class
		// implements Comparable interface and implements compareTo method.
		System.out.println(" ");
		for (ArrayListWithComparable obj : arrayList2)
			System.out.println("ArrayList of Custom class type collection after sort" + " " + obj.getName());

	}

}
