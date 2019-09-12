package com.daily.java;

public class QueuePractise {

	int front;
	int rear;
	int queueArray[];
	int count;
	int max_size;

	public QueuePractise(int size) {
		max_size = size;
		queueArray = new int[max_size];
		rear = -1;
		front = 0;
		count = 0;
	}

	public boolean isFull() {
		return count == rear;
	}

	public boolean isEmpty() {
		return count == 0;
	}

	public int peek() {
		return queueArray[front];
	}
//push / offer

	public void push(int newElement) {
		if (!isFull()) {
			queueArray[++rear] = newElement;
			count++;
		} else {
			System.out.println("Stack is full cannot insert");
		}
	}

	public int pop() {
		if (!isEmpty()) {
			count--;
			return queueArray[front++];
		} else {
			System.out.println("Stack is empty");
			return -1;
		}

	}

	public void display(int index) {
		System.out.println("Item in stack" + " " + queueArray[index]);
	}

	public static void main(String args[]) {
		QueuePractise obj1 = new QueuePractise(10);
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
