package com.daily.java.DataStructures;

public class QueueWithArray {

	private int maxSize = 10;
	private int front;
	private int rear;
	private long[] queueArray = new long[maxSize];

	public boolean isFull() {
		return rear == maxSize-1;
	}

	public boolean isEmpty() {
		return rear == -1;
	}

	public long peek() {
		return queueArray[front];
	}

	public void enqueue(long e) {
		if (!isFull()) {

			queueArray[rear++] = e;
			// If the queue is not full, increment rear pointer to point the
			// next empty space.

			// Add data element to the queue location, where the rear is
			// pointing.
		} else {
			System.out.println("Queue is full. It's max size is " + " " + maxSize);
		}
	}

	public long dequeue() {
		if (!isEmpty()) {
			return queueArray[front++];// Increment front pointer to point to
										// the next available data element.
		} else {
			System.out.println("Queue is empty. Please insert some data" + " " + rear);
			return -1;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueWithArray obj1 = new QueueWithArray();
		long count = 1;
		for (int i = 0; i <=obj1.maxSize-1; i++) {
			obj1.enqueue(11 + count);
			System.out.println(i+" " + "th Element is inserted into Queue" + " ");
			count++;
			// System.out.print(i);
		}

		long temp = 0;

		for (int i = 0; i <= obj1.maxSize - 5; i++) {
			temp = obj1.dequeue();
			System.out.println(i + " " + "th Element deleted from Queue are" + " " + temp);
		}

	}

}
