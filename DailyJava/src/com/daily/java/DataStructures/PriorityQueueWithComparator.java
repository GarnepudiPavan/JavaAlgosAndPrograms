package com.daily.java.DataStructures;

import java.util.Comparator;

public class PriorityQueueWithComparator {

	int front_Index;
	int rear_Index;
	int count;
	int max_Size;
	String queueArray[];
	Laptops queueObjectArray[];
	int counterObject;
	int frontIndex;
	int rearIndex;

	public PriorityQueueWithComparator(int size) {
		max_Size = size;
		front_Index = 0;
		rear_Index = -1;
		count = 0;
		queueArray = new String[max_Size];
		queueObjectArray = new Laptops[max_Size];
		frontIndex = 0;
		rearIndex = -1;
		counterObject = 0;

	}

	public boolean isEmpty() {
		return count == 0;
	}

	public boolean isFull() {
		return count == (max_Size - 1);
	}
	
	public boolean isEmptyObject() {
		return counterObject == 0;
	}

	public boolean isFullObject() {
		return counterObject == (max_Size - 1);
	}

	public void enqueue(String element) {

		if (isEmpty()) {
			queueArray[++rear_Index] = element;
			count++;
		} else if (!isFull()) {
			int j;
			for (j = count - 1; j >= 0; j--) {
				if ((queueArray[j].compareTo(element)) < 0) {
					queueArray[j + 1] = queueArray[j];
				} else {
					break;
				}
			}
			queueArray[j + 1] = element;
			count++;

		}

	}

	

	public class Laptops implements Comparator<Laptops> {

		int price;
		String brand_Name;
		int ram_Size;

		Laptops(int price, String brand_Name, int ram) {
			this.price = price;
			this.brand_Name = brand_Name;
			this.ram_Size = ram;

		}

		public int compare(Laptops obj1, Laptops obj2) {
			if ((obj1.price == obj2.price)) {
				return 0;
			} else if ((obj1.price < obj2.price)) {
				return -1;
			} else {
				return 1;
			}

		}
		public void display(){
			System.out.println("Laptop price"+" "+this.price+" "+"Brand Name is"+" "+this.brand_Name+" "+"Ram size is"+" "+this.ram_Size);
		}

	}

	public String dequeue() {
		if (!isEmpty()) {
			count--;
			return queueArray[front_Index++];
		} else {
			System.out.println("Queue is empty");
			return null;
		}

	}
	
	public void enqueueObject(Laptops element) {

		if (isEmptyObject()) {
			queueObjectArray[++rearIndex] = element;
			counterObject++;
		} else if (!isFullObject()) {
			int j;
			for (j = counterObject - 1; j >= 0; j--) {
				if ((element.compare(queueObjectArray[j], element)) < 0) {
					queueObjectArray[j + 1] = queueObjectArray[j];
				} else {
					break;
				}
			}
			queueObjectArray[j + 1] = element;
			counterObject++;

		}

	}

	
	public Laptops dequeueObject(){
		if(!isEmptyObject()){
			counterObject--;
			return queueObjectArray[frontIndex++];
		}else{
			System.out.println("Queue is empty");
			return null;
		}
	}
	
	public static void main(String args[]) {

		PriorityQueueWithComparator obj1 = new PriorityQueueWithComparator(15);
		obj1.enqueue("Z");
		obj1.enqueue("A");
		obj1.enqueue("B");
		obj1.enqueue("C");
		obj1.enqueue("Y");
		obj1.enqueue("D");
		while (!obj1.isEmpty()) {
			System.out.println("Dequeue from Priority queue" + " " + obj1.dequeue());
		}
		
		Laptops obj4 = obj1.new Laptops(1500,"Dell",16);
		Laptops obj2 = obj1.new Laptops(3000,"Apple",12);
		Laptops obj3 = obj1.new Laptops(1000,"Lenovo",18);
		Laptops obj5 = obj1.new Laptops(4000,"Wipro",18);
		
		obj1.enqueueObject(obj4);
		obj1.enqueueObject(obj2);
		obj1.enqueueObject(obj3);
		obj1.enqueueObject(obj5);
		while (!obj1.isEmptyObject()) {
			obj1.dequeueObject().display();
		}

	}

}
