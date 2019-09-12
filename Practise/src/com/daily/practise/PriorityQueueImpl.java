package com.daily.practise;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueImpl {

	// Cars carsList[];
	int max_Size;
	PriorityQueue<Cars> pQueue;

	public PriorityQueueImpl(int size) {
		max_Size = size;
		// carsList = new Cars[max_Size];
		pQueue = new PriorityQueue<Cars>(new Cars(null,null,0,0));
	}

	public class Cars implements Comparator<Cars> {
		int mileage;
		int price;
		String Make;
		String Model;

		public Cars(String Make, String Model, int price, int mileage) {
			this.Make = Make;
			this.Model = Model;
			this.price = price;
			this.mileage = mileage;
		}

		public int compare(Cars obj1, Cars obj2) {
			int value = 100;
			if ((obj1.price == obj2.price) ) {
				value = 0;
			} else if ((obj1.price > obj2.price) ) {
				value = -1;
			} else if ((obj1.price < obj2.price) ) {
				value = 1;
			}
			return value;
		}

		public String toString() {
			return "Make is" + " " + this.Make + " " + "Model is" + " " + this.Model + " " + "Price is" + " "
					+ this.price + " " + "Mileage is" + " " + this.mileage + " ";
		}

	}

	public void sortQueue() {
				
		while (!pQueue.isEmpty()) {
			
			System.out.println("Element from PQ is" + " " + pQueue.poll());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueueImpl obj = new PriorityQueueImpl(5);
		Cars car1 = obj.new Cars("Tata", "Nexon", 12000, 15);
		Cars car2 = obj.new Cars("Tata", "Hexa", 17000, 12);
		Cars car3 = obj.new Cars("Mahindra", "TUV300", 15000, 15);
		Cars car4 = obj.new Cars("Mahindra", "XUV300", 11000, 14);
		Cars car5 = obj.new Cars("Maruti", "Jigny", 12000, 16);
		obj.pQueue.offer(car1);
		obj.pQueue.offer(car2);
		obj.pQueue.offer(car3);
		obj.pQueue.offer(car4);
		obj.pQueue.offer(car5);
		System.out.println("Sorted Elements of Cars are");
		// obj.sortQueue(cars1);
		obj.sortQueue();
		
	}

}
