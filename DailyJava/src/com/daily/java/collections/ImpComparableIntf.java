package com.daily.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImpComparableIntf implements Comparable<ImpComparableIntf> {

	String eName;

	public ImpComparableIntf(String ename) {
		this.eName = ename;
	}

	@Override
	public int compareTo(ImpComparableIntf obj) {
		// TODO Auto-generated method stub
		return eName.compareToIgnoreCase(obj.eName);

	}

	public String getName() {
		return this.eName;
	}

	public static void main(String args[]) {

		ImpComparableIntf obj1 = new ImpComparableIntf("A");
		ImpComparableIntf obj2 = new ImpComparableIntf("B");
		ImpComparableIntf obj3 = new ImpComparableIntf("C");
		ImpComparableIntf obj4 = new ImpComparableIntf("D");
		List<ImpComparableIntf> list1 = new ArrayList<ImpComparableIntf>();
		list1.add(obj4);
		list1.add(obj2);
		list1.add(obj3);
		list1.add(obj1);
		for (ImpComparableIntf e : list1) {
			System.out.println("List with Custom Object before sort" + " " + e.getName());
		}

		Collections.sort(list1);

		for (ImpComparableIntf e : list1) {
			System.out.println("List with Custom Object after sort" + " " + e.getName());
		}
	}

}