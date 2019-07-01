package com.daily.java.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List2ArrayAndBack2List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("C");
		System.out.println("Size of ArrayList"+" "+arrayList.size());
		//String[] array = new String[arrayList.size()-2];
		String [] array = arrayList.toArray(new String[0]);
		for (String s : array) {
			System.out.println("ArrayList converted to array" + " " + s);
		}

		List<String> list = (List<String>) Arrays.asList(array);
		//Cannot type cast to ArrayList as asList method returns only List obj
		ArrayList<String> a1 = new ArrayList<String>(list);
		//This is correct way of converting list to ArrayList
		for (String s : a1) {
			System.out.println("Array converted back to ArrayList" + " " + s);
		}
	}

}
