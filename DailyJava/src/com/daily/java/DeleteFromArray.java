package com.daily.java;

public class DeleteFromArray {

	private int array[] = new int[10];
	int searchElement = 15;
	int indexFound = 0;

	public void arrayInt() {
		for (int x = 0; x <= array.length - 1; x++) {
			array[x] = 5 + x * 5;
		}
		for (int y = 0; y <= array.length - 1; y++) {
			System.out.println("Array created with elements" + " " + array[y]);
		}
	}

	/*
	 * [0][1][2][3][4][5][6][7][8][9] Note the index where element is found Let
	 * it be k. and then copy entire array into new one skipping that index
	 * alone. Copy all index ith position to i but when =k then copy K+1 from
	 * that point onwards skipping kth index alone
	 * 
	 */
	public int findElementAndDelete() {
		for (int c = 0; c <= array.length - 1; c++) {
			if (array[c] == searchElement) {
				System.out.println("Element is found at index" + " " + c);
				indexFound = c;
				break;
			}
		}
		int temp[] = new int[array.length - 1];
		int arraySize = temp.length - 1;
		for (int i = 0; i <= arraySize; i++) {
			if (i >= indexFound) {// Skip index of element where it is found
				temp[i] = array[i + 1]; // by incrementing the index
			} else {// Else logic will copy all preceding elements to the index
					// that is being deleted / skipped

				temp[i] = array[i];
			}

		}
		array = temp;
		for (int j = 0; j <= array.length - 1; j++) {
			System.out.println("Array after item is deleted" + "" + array[j]);
		}

		return indexFound;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[5];

		for (int i = 0; i < 5; i++) {
			a[i] = i;
		}
		for (int i : a) {
			System.out.println("Content of array after creation are :" + " " + a[i]);
		}

		int b[] = new int[5];
		int c[] = new int[5];
		for (int i = 0; i <= a.length - 1; i++) {
			if (i != (a.length - 1) / 2) {
				b[i] = a[i];
			}
		}
		/*
		 * Deleting middle element from array Object obj = new Object();
		 * System.arraycopy((a) obj, 0, (b) obj, a.length - 1, b.length - 1);
		 */
		for (int i : b) {
			System.out.println("Content of array after modification are :" + " " + b[i]);
		}
		for (int i : c) {
			System.out.println("Content of blank array:" + " " + c[i]);
		}
		DeleteFromArray obj1 = new DeleteFromArray();
		obj1.arrayInt();
		obj1.findElementAndDelete();

	}
}
