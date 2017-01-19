package com.daily.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/**
 * Refer to Quick example of comparator imp. Comparator interface as seen Below can be used to sort Collection containing objects of user defined class 
 * without making changes to user defined class but from outside the class. 
 * Where as Comparable interface must be implemented by user defined class and define it's method CompareTo()
 * 
 * @author Pavan
 *
 */

public class ImpComparatorIntf implements Comparator<ImpComparableIntf> {

	/*
	 * String publisherName;
	 * 
	 * ImpComparatorIntf(String publisherName) { super(); this.publisherName =
	 * publisherName; }
	 */

	public int compare(ImpComparableIntf obj1, ImpComparableIntf obj2) {
		return obj1.publisher.compareTo(obj2.publisher);
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImpComparableIntf obj1 = new ImpComparableIntf("Anka", "Anka's Publisher", "Anka's Book");
		ImpComparableIntf obj2 = new ImpComparableIntf("Banka", "Banka's Publisher", "Banka's Book");
		ImpComparableIntf obj3 = new ImpComparableIntf("Cunka", "Cunka's Publisher", "Cunka's Book");
		ImpComparableIntf obj4 = new ImpComparableIntf("Donka", "Donka's Publisher", "Donka's Book");
		List<ImpComparableIntf> list1 = new ArrayList<ImpComparableIntf>();
		list1.add(obj4);
		list1.add(obj2);
		list1.add(obj3);
		list1.add(obj1);

		ImpComparatorIntf objComp = new ImpComparatorIntf();

		for (ImpComparableIntf e : list1) {
			System.out.println("Before sorting using Comparator" + " " + e.getPublisher());
		}
		System.out.println("------------------- ");
		Collections.sort(list1, objComp);

		for (ImpComparableIntf e : list1) {
			System.out.println("After sorting using Comparator" + " " + e.getPublisher());
		}

	}

}
