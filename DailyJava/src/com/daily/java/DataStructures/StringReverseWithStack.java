package com.daily.java.DataStructures;

public class StringReverseWithStack {

	String pop;
	String push;
	String array[] = new String[2];
	int top = -1;

	public void push(String e) {
		if (!isFull()) {
			++top;
			array[top] = e;
		}
	}

	public String pop() {
		if (!isEmpty()) {
			return array[top--];
		} else {
			return null;
		}
	}

	public String peep() {
		if (!isEmpty()) {
			return array[top];
		} else {
			return null;
		}
	}

	public boolean isEmpty() {

		if (top==-1) {
			return true;
		} else {
			return false;
		}

	}

	public boolean isFull() {

		if (array.length == top) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String args[]) {

		StringReverseWithStack obj1 = new StringReverseWithStack();
		String s = "Spire Technologies";
		String temp[] = s.split(" ");
		String reverse = "";
		/*
		 * obj1.push(11); obj1.push(12); obj1.push(13);
		 */
		obj1.push(temp[0]);
		obj1.push(temp[1]);
		reverse = obj1.pop();
		reverse = reverse + " " + obj1.pop();
		System.out.println("Last element in Stack is" + " " + obj1.peep());
		System.out.println("String reverse using Stacks" + " " + reverse);

	}

}
