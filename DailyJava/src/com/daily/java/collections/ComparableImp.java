package com.daily.java.collections;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.lang.Comparable;//Java.lang available by default no need to explicitly import

public class ComparableImp implements Comparable<ComparableImp> {

	int itemPrice;
	String itemName;
	int grade;
	
	public ComparableImp(int itemPrice,	String itemName,int grade) {
		this.itemPrice = itemPrice;
		this.itemName = itemName;
		this.grade = grade;
	}
	
	@Override
	public int compareTo(ComparableImp o) {
		// TODO Auto-generated method stub
		if((this.itemName.equalsIgnoreCase(o.itemName)) &&(this.itemPrice>o.itemPrice)) {
		return 1;
	}else if((this.itemName.equalsIgnoreCase(o.itemName)) &&(this.itemPrice==o.itemPrice)) {
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
		List<ComparableImp> list1 = new ArrayList<ComparableImp>(); 
		ComparableImp obj1 = new ComparableImp(10, "Lemon", 1);
		ComparableImp obj2 = new ComparableImp(20, "Orange", 2);
		ComparableImp obj3 = new ComparableImp(30, "Lime", 1);
		list1.add(obj1);list1.add(obj2);list1.add(obj3);
		Collections.sort(list1);
		for(ComparableImp values: list1){
			System.out.println("Sorted by item price"+" "+values.getItemPrice());
		}
	}
		
}
