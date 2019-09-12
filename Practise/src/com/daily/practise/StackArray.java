package com.daily.practise;

public class StackArray {
	int counter;
	int top;
	int max_Size;
	int stackArray[];

	public StackArray(int size) {
		counter = 0;
		top = -1;
		max_Size = size;
		stackArray = new int[max_Size];
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public boolean isFull() {
		return top == max_Size - 1;
	}

	public int peek() {
		System.out.println("Top element of StackArray" + " " + stackArray[top]);
		return stackArray[top];
	}

	public void push(int element) {
		if(!isFull()) {
		counter++;
		stackArray[++top] = element;
		}else {
			System.out.println("Stack is full");
		}
	}

	public int pop() {
		if(!isEmpty()) {
		counter--;
		return stackArray[top--];
		}else {
			System.out.println("Stack is empty");
			return -1;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackArray obj1 = new StackArray(10);
		obj1.push(0);
		obj1.push(1);
		obj1.push(2);
		obj1.push(3);
		obj1.push(4);
		obj1.push(5);
		obj1.push(6);
		obj1.push(7);
		obj1.push(8);
		obj1.push(9);
		obj1.push(10);
		while (!obj1.isEmpty()) {
			System.out.println("Elements from stack are:" + " " + obj1.pop());
		}
	}

}
