package com.daily.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImpComparableIntf implements Comparable<ImpComparableIntf> {

	String author;
	String publisher;
	String bookTitle;

	public ImpComparableIntf(String ename, String publisher, String bookTitle) {
		this.author = ename;
		this.publisher = publisher;
		this.bookTitle = bookTitle;
	}

	@Override
	public int compareTo(ImpComparableIntf obj) {
		// TODO Auto-generated method stub
		return author.compareToIgnoreCase(obj.author);//default method is return author.compareTo(obj.author)
 
	}

	public String getAuthor() {
		return this.author;
	}

	public String getPublisher() {
		return this.publisher;
	}

	public String getBookTitle() {
		return this.bookTitle;
	}

	public static void main(String args[]) {

		ImpComparableIntf obj1 = new ImpComparableIntf("Anka", "Anka's Publisher", "Anka's Book");
		ImpComparableIntf obj2 = new ImpComparableIntf("Banka", "Banka's Publisher", "Banka's Book");
		ImpComparableIntf obj3 = new ImpComparableIntf("Cunka", "Cunka's Publisher", "Cunka's Book");
		ImpComparableIntf obj4 = new ImpComparableIntf("Donka", "Donka's Publisher", "Donka's Book");
		List<ImpComparableIntf> list1 = new ArrayList<ImpComparableIntf>();
		list1.add(obj4);
		list1.add(obj2);
		list1.add(obj3);
		list1.add(obj1);
		for (ImpComparableIntf e : list1) {
			System.out.println("List with Custom Object before sort" + " " + e.getAuthor());
		}

		Collections.sort(list1);

		for (ImpComparableIntf e : list1) {
			System.out.println("List with Custom Object after sort" + " " + e.getAuthor());
		}
	}

}