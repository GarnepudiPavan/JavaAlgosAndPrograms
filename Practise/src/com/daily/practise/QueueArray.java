package com.daily.practise;

public class QueueArray {
	int max_Size;
	int front;
	int rear;
	int queueArray[];
	int counter;

	public QueueArray(int size) {
		max_Size = size;
		counter = 0;
		front = 0;
		rear = -1;
		queueArray = new int[max_Size];

	}

	public boolean isEmpty() {
		return counter == 0;
	}

	public boolean isFull() {
		return rear == max_Size-1;
	}

	public int peek() {
		return queueArray[front];
	}

	public int deQueue() {
		if (!isEmpty()) {
			counter--;
			return queueArray[front++];
		} else {
			System.out.println("Queue is empty");
			return -1;
		}

	}

	public void enQueue(int element) {
		if (!isFull()) {
			
			queueArray[++rear] = element;
			counter++;
		} else {
			System.out.println("Queue is full");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueArray obj1 = new QueueArray(10);
		obj1.enQueue(0);
		obj1.enQueue(1);
		obj1.enQueue(2);
		obj1.enQueue(3);
		obj1.enQueue(4);
		obj1.enQueue(5);
		obj1.enQueue(6);
		obj1.enQueue(7);
		obj1.enQueue(8);
		obj1.enQueue(9);
		obj1.enQueue(10);
		while (!obj1.isEmpty()) {
			System.out.println("Element from Queue is" + " " + obj1.deQueue());
		}
	}

}
