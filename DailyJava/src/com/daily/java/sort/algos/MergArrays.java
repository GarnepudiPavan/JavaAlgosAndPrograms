package com.daily.java.sort.algos;

public class MergArrays {

	int a[] = { 3, 5, 11, 2, 91 };
	int b[] = { 101, 20, 9, 1, 0 };
	// int c[] = new int[(a.length - 1 + b.length - 1)];

	public int[] bubbleSort(int a[]) {
		int temp;
		int array[] = a;

		if (array.length - 1 <= 0) {
			return null;
		} else if (array.length - 1 > 0) {
			for (int i = 0; i < array.length-1; i++) {
				for (int j = 0; j < array.length-1; j++) {
					if (array[j] > array[j + 1]) {
						temp = array[j + 1];
						array[j + 1] = array[j];
						array[j] = temp;
					}
				}
			}

		}
		System.out.println("Array after sorting is");
		for (int i = 0; i <= a.length - 1; i++) {
			System.out.println("Elements after sort" + " " + array[i]);
		}

		return array;

	}

	public int[] mergeSort() {
		int leftArray[] = a;

		int rightArray[] = b;

		int fullArray[] = new int[(a.length + b.length)*2];
		leftArray = bubbleSort(leftArray);
		rightArray = bubbleSort(rightArray);
		int kN = fullArray.length-1;
		for (int k = 0; k < kN; ) {
			for (int i = 0; i < a.length-1;) {
				for (int j = 0; j < b.length-1; ) {
					if (leftArray[i] <= rightArray[j]) {
							fullArray[k] = leftArray[i];
						k++;
						i++;
					} else {
						fullArray[k] = rightArray[j];
						k++;
						j++;
					}
				}
			}
		}

		return fullArray;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergArrays obj1 = new MergArrays();
		int[] c = obj1.mergeSort();
		for (int i = 0; i < c.length - 1; i++) {
			System.out.println("Merged array" + " " + c[i]);
		}
	}

}
