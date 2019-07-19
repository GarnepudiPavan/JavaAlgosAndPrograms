package com.daily.java.DataStructures;

/* This program implements stack in Java using Array. A stack needs
 * an array, a top variable. 
 * Reference Page 145 of DS and Algorithms in Java
 * 
 */

public class StacksWithArray {

	private int maxSize = 10;
	private int top = -1; // -1 indicates empty stack and top == maxSize
							// indicates it is full

	private int stackArray[] = new int[maxSize];

	public long pop() {
		if (!isStackEmpty()) {
			return stackArray[top--];
		} else {
			return -1;
		}
	}

	public void push(int e) {
		if (!isStackFull()) {
			stackArray[++top] = e;
		} else {
			System.out.println("Stack is full. As it has reach max size :" + " " + top);
		}
	}

	public long peek() {
		return stackArray[top];
	}

	public boolean isStackFull() {
		return top == maxSize-1;// 0-9 size 10 hence top = 9 (maxSize-1)
	}

	public boolean isStackEmpty() {
		return top == -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StacksWithArray obj1 = new StacksWithArray();
		obj1.push(5);
		obj1.push(7);
		obj1.push(9);
		obj1.push(11);
		obj1.push(13);
		obj1.push(15);
		obj1.push(17);
		obj1.push(21);
		obj1.push(23);
		obj1.push(25);
		System.out.println("Top most element of stack is" + " " + obj1.peek());
		obj1.push(22);//element will not be inserted as stack is full
		obj1.pop();// Deleting element 25 that is inserted last and 23 will be
					// returned by peek
		System.out.println("Top most element of stack after pop is" + " " + obj1.peek());
	}

}
