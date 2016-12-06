package com.daily.java.sort.algos;

/*
 * Linear Search algorithm is for searching an element in an array. For this algo array need not be sorted.
 * At best element is found in single search i.e if first element itself is the number being searched.
 * At worst element is not present in array at all and we need to search entire array to determine that.
 * Linear search algo has running time of O(n)
 */
public class LinearSearch {

	int a[] = { 1, 9, 0, 2, 7, 8, 6,11 };

	public void searchElement(int x) {
		boolean b = false;
		int index = 0;
		for (int i = 0; i <= a.length - 1; i++) {
			if (x == a[i]) {
				b = true;
				index = i;
				break;
			} else {
				b = false;
			}
		}
		if (b) {
			System.out.print("Given number" + " " + x + " " + "is present in array");
			System.out.println(" " + "at index" + " " + index);
		} else {
			System.out.println("Given number" + " " + x + " " + " doesn't exist in array");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinearSearch obj1 = new LinearSearch();
		obj1.searchElement(600-598);
	}

}
