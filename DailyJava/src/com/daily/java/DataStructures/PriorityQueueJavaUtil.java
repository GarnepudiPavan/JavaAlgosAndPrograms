package com.daily.java.DataStructures;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueJavaUtil {
	PriorityQueue<cars> priorityQueue;
	cars[] carsList;

	public PriorityQueueJavaUtil(int size) {
		carsList  = new cars[size];
		// We need to pass class that has Comparator implementattion to PriorityQueue
		// initialization
		priorityQueue = new PriorityQueue<cars>(new cars(0, 0, "null", "null"));

	}

	public class cars implements Comparator<cars> {
		int carMileage;
		int carPrice;
		String carMake;
		String carModel;

		public cars(int carMileage, int carPrice, String carMake, String carModel) {
			this.carMileage = carMileage;
			this.carPrice = carPrice;
			this.carMake = carMake;
			this.carModel = carModel;
		}

		public String toString() {
			return "Make is" + " " + this.carMake + " " + "and Model is" + " " + this.carModel + " " + " Mileage is"
					+ " " + this.carMileage;
		}

		public int compare(cars obj1, cars obj2) {
			if (obj1.carMileage == obj2.carMileage) {
				return 0;
			} else if (obj1.carMileage > obj2.carMileage) {
				return -1;
			} else {
				return 1;
			}

		}
	}

	public static void main(String args[]) {

		PriorityQueueJavaUtil obj1 = new PriorityQueueJavaUtil(4);
		cars carobj1 = obj1.new cars(13, 700000, "Maruti", "Baleno");
		cars carobj2 = obj1.new cars(11, 900000, "Maruti", "Ciaz");
		cars carobj3 = obj1.new cars(14, 900000, "Mahindra", "XUV300");
		cars carobj4 = obj1.new cars(19, 1200000, "Mahindra", "TUV300");

		obj1.carsList[0] = carobj1;
		obj1.carsList[1] = carobj2;
		obj1.carsList[2] = carobj3;
		obj1.carsList[3] = carobj4;

		for (cars obj : obj1.carsList) {
			obj1.priorityQueue.offer(obj);
		}

		for (cars list : obj1.carsList) {
			System.out.println("Unsorted order of cars" + " " + list.toString());
		}

		System.out.println("+++++++++++++++++++++++++++++");

		while (!obj1.priorityQueue.isEmpty()) {
			System.out.println("Sorted order of cars" + " " + obj1.priorityQueue.poll());
		}
		System.out.println("+++++++++++++++++++++++++++++");
	}
}
