package com.daily.java.collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListJavaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> linkedList1 = new LinkedList<String>();
		ArrayList<String> arrayList = new ArrayList<String>();

		arrayList.add("ArrayList Element 0");
		arrayList.add("ArrayList Element 1");
		arrayList.add("ArrayList Element 2");
		arrayList.add("ArrayList Element 3");
		arrayList.add("ArrayList Element 4");
		arrayList.add("ArrayList Element 5");
		LinkedList<String> linkedList2 = new LinkedList<String>(arrayList);

		
		
		linkedList1.addAll(arrayList);
		System.out.println("Linked List created with explicit addition of ArrayList addition is" + "" + linkedList1);
		linkedList1.addFirst("LinkedList First Object");
		String val = (String) linkedList1.get(0);
		linkedList1.set(0, arrayList.get(0) + " " + val);
		
		linkedList1.set(1, arrayList.get(1) + " " + val);
		linkedList1.set(2, arrayList.get(2) + " " + val);
		linkedList1.set(3, arrayList.get(3) + " " + val);
		linkedList1.set(4, arrayList.get(4) + " " + val);
		linkedList1.set(5, arrayList.get(5) + " " + val);
		linkedList1.addLast("LinkedListx last Object");
		//String s = linkedList1.set(6, val.replaceFirst("First", "replaced"));
		System.out.println("Linked List replaced with explicit objects is" + "" + linkedList1);
	//	System.out.println("Replaced element in Linked List is" + "" + s.toString());
		System.out.println("Linked List created with ArrayList objects is" + "" + linkedList2);

	}

}
