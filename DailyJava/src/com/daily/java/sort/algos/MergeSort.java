package com.daily.java.sort.algos;

import java.util.Collections;

public class MergeSort {

	/*
	 * Best Case , Average and Worst case - O(nlog(n))
	 * 
	 * Another approach using comparable - https://www.cs.cmu.edu/~adamchik/15-121/lectures/Sorting%20Algorithms/code/MergeSort.java
	 * 
	 */

	int[] inputArray = { 10, 22, 33, 44, 55, -7, 8, 3, 2, 5 };
	int[] tempArry = new int[inputArray.length];

	public static void main(String[] args) {

		MergeSort obj = new MergeSort();

		obj.doMergeSort(0, obj.inputArray.length - 1);

		for (int i = 0; i < obj.inputArray.length; i++) {
			System.out.println(obj.inputArray[i]);
		}

	}

	void doMergeSort(int lowerIndex, int higherIndex) {
		int middle = 0;
		if (lowerIndex < higherIndex) {

			middle = lowerIndex + (higherIndex - lowerIndex) / 2;

			// below steps sort the left array
			doMergeSort(lowerIndex, middle);

			// below step sort the right ride array
			doMergeSort(middle + 1, higherIndex);

			// below step merge the both arrays
			doMergeArrays(lowerIndex, middle, higherIndex);

		}

	}

	void doMergeArrays(int lowerIndex, int middle, int higherIndex) {

		// copy actual array elements to temp array
		for (int i = 0; i < inputArray.length; i++) {
			tempArry[i] = inputArray[i];
		}
		 
		int i = lowerIndex;
		int j = middle + 1;
		int k = lowerIndex;

		while (i <= middle && j <= higherIndex) {

			if (tempArry[i] < tempArry[j]) {
				inputArray[k] = tempArry[i];
				i++;
			} else {
				inputArray[k] = tempArry[j];
				j++;
			}

			k++;

		}
		 // Copy the rest of the left side of the array into the target array
		while (i <= middle) {
			inputArray[k] = tempArry[i];
			i++;
			k++;

		}
	}
}
