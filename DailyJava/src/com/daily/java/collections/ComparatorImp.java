package com.daily.java.collections;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorImp implements Comparator<ComparatorImp> {

	int itemPrice;
	String itemName;
	int grade;
	
	public ComparatorImp(int itemPrice,	String itemName,int grade) {
		this.itemPrice = itemPrice;
		this.itemName = itemName;
		this.grade = grade;
	}
	
	public ComparatorImp() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(ComparatorImp oobj1, ComparatorImp oobj2) {
		// TODO Auto-generated method stub
		if((oobj1.itemName.compareToIgnoreCase(oobj2.itemName)>0) ) {//&&(oobj1.itemPrice>oobj2.itemPrice)
		return 1;
	}else if((oobj1.itemName.compareToIgnoreCase(oobj2.itemName)==0))  {//&&(oobj1.itemPrice==oobj2.itemPrice)
		return 0;
	}else {
		return -1;
	} 
	}
	
	
	
	
	public int getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public static void main(String args[]) {
		List<ComparatorImp> list1 = new ArrayList<ComparatorImp>(); 
		ComparatorImp obj1 = new ComparatorImp(10, "Lemon", 1);
		ComparatorImp obj2 = new ComparatorImp(20, "Orange", 2);
		ComparatorImp obj3 = new ComparatorImp(30, "Lime", 1);
		list1.add(obj1);list1.add(obj2);list1.add(obj3);
		ComparatorImp obj = new ComparatorImp();
		Collections.sort(list1, obj);
		for(ComparatorImp values: list1){
			System.out.println("Sorted by item price"+" "+values.getItemName());
		}
		
		List<String> list2 = new ArrayList<String>();
		list2.add("Lemon");
		list2.add("Orange");
		list2.add("Lime");
		Collections.sort(list2);//using String obj comparison 
		for(String values: list2){
			System.out.println("Sorted by String name"+" "+values);
		}
		
	}
		
}
