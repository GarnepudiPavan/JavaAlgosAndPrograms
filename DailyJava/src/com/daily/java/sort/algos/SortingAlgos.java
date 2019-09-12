package com.daily.java.sort.algos;

import java.util.LinkedList;
import java.util.Queue;

/*
 * Selection sort:- https://youtu.be/GUDLRan2DWM?list=PL2_aWCzGMAwKedT2KfDMB9YA5DgASZb3U 
 * Selection sort algorithm works by comparing min value in an array with rest of the numbers
 * and swapping them. This algo has performance of  O(n2) in avg case.
 * 
 * Bubble Sort:- https://youtu.be/Jdtq5uKz-w4?list=PL2_aWCzGMAwKedT2KfDMB9YA5DgASZb3U 
 * Bubble sort also has O(n2) complexity in avg case. In Bubble Sort every single element is compare with it's next element and swapped. 
 * At the end of first iteration biggest element is pushed to right most index of array.
 * 
 *  
 */
public class SortingAlgos {

	int a[] = { 3, 5, 11, 2, 1 };//{0,1, 8, 2, 4, 5, 9, 1, 6 };
	int temp;

	public void bubbleSort() {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1 ; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j + 1];
					a[j + 1] = a[j];
					a[j] = temp;
				}
			}
		}

		System.out.println("Array after sorting is");
		for (int i = 0; i <= a.length - 1; i++) {
			System.out.println("Elements after sort" + " " + a[i]);
		}
		
		
		
		
	}

	public void selectionSort() {
		int min = 0;

		for (int i = 0; i < a.length - 1; i++) {
			min = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[min]) {
					min = j;
				}
			}
			temp = a[i];
			a[i] = a[min];
			a[min] = temp;
		}
		for (int i = 0; i <=  a.length - 1; i++)
			System.out.println("** Array Sorted after algo us" + " " + a[i]);
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortingAlgos obj1 = new SortingAlgos();
		obj1.bubbleSort();
		obj1.selectionSort();
	}

}
