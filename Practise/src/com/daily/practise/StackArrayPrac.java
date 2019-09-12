package com.daily.practise;

public class StackArrayPrac {
	int top;
	int length;
	int stackArray[];

	public StackArrayPrac(int size) {
		top = -1;
		length = 0;
		stackArray = new int[size];
	}

	public boolean isFull() {
		return stackArray.length  == length;
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public int peek() {
		return stackArray[top];
	}

	public int pop() {
		if (!isEmpty()) {
			length--;
			return stackArray[top--];
		} else {
			System.out.println("Stack is empty");
			return -1;
		}
	}

	public void push(int element) {
		if (!isFull()) {
			length++;
			stackArray[++top] = element;
		} else {
			System.out.println("Cannot insert element"+" "+element+" "+"As stack is full. Stack size is" + " " + stackArray.length);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackArrayPrac obj = new StackArrayPrac(10);
		obj.push(0);
		obj.push(1);
		obj.push(2);
		obj.push(3);
		obj.push(4);
		obj.push(5);
		obj.push(6);
		obj.push(7);
		obj.push(8);
		obj.push(9);
		obj.push(10);
		while (!obj.isEmpty()) {
			System.out.println("Values of stack" + " " + obj.pop());
		}

	}

}
