package com.daily.java;

/**
 * Params top is needed to keep track of inserting elements into stack.
 * To keep track of number of elements in Stack we need a length or counter
 * variable. Using this counter variable we can also check if stack is full or empty
 * @author gv
 *
 */

public class StackPractise {

	int top;
	int stackArray[];
	int count;
	int max_size;

	public StackPractise(int size) {
		max_size = size;
		stackArray = new int[max_size];
		top = -1;
		count = 0;
	}

	public boolean isFull() {
		return count == top;
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public int peek() {
		return stackArray[top];
	}
//push / offer

	public void push(int newElement) {
		if (!isFull()) {
			stackArray[++top] = newElement;
			count++;
		} else {
			System.out.println("Stack is full cannot insert");
		}
	}

	public int pop() {
		if (!isEmpty()) {
			count--;
			return stackArray[top--];
		} else {
			System.out.println("Stack is empty");
			return -1;
		}

	}

	public void display(int index) {
		System.out.println("Item in stack" + " " + stackArray[index]);
	}

	public static void main(String args[]) {
		StackPractise obj1 = new StackPractise(10);
		obj1.push(10);
		obj1.push(20);
		obj1.push(30);
		obj1.push(40);
		obj1.push(50);

		while (!obj1.isEmpty()) {
			System.out.println("Values in stack"+" "+obj1.peek());
			obj1.pop();
		}
	}

}
