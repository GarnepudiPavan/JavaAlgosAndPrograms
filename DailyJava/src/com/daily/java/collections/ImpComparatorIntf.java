package com.daily.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/**
 * Refer to Quick example of comparator imp
 * 
 * @author Pavan
 *
 */

public class ImpComparatorIntf implements Comparator<ImpComparatorIntf> {

	String publisherName;

	ImpComparatorIntf(String publisherName) {
		super();
		this.publisherName = publisherName;
	}

	public int compare(ImpComparatorIntf obj1, ImpComparatorIntf obj2) {
		return obj1.publisherName.compareTo(obj2.publisherName);
	}

	public String getPub() {
		return this.publisherName;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImpComparatorIntf obj1 = new ImpComparatorIntf("KaranJohar");
		ImpComparatorIntf obj2 = new ImpComparatorIntf("TarekFateh");
		ImpComparatorIntf obj3 = new ImpComparatorIntf("TokkaTolu");
		ImpComparatorIntf obj4 = new ImpComparatorIntf("AMARAKBAR");

		List<ImpComparatorIntf> bookObj = new ArrayList<ImpComparatorIntf>();
		bookObj.add(obj1);
		bookObj.add(obj2);
		bookObj.add(obj3);
		bookObj.add(obj4);

		for (ImpComparatorIntf e : bookObj) {
			System.out.println("Before sorting using Comparator" + " " + e.getPub());
		}
		System.out.println("------------------- ");
		Collections.sort(bookObj, obj1);

		for (ImpComparatorIntf e : bookObj) {
			System.out.println("After sorting using Comparator" + " " + e.getPub());
		}

	}

}
