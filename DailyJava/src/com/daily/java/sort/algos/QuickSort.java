package com.daily.java.sort.algos;

public class QuickSort {

	private int array[];
	private int length;

	public void sort(int[] inputArr) {

		if (inputArr == null || inputArr.length == 0) {
			return;
		}
		this.array = inputArr;
		length = inputArr.length;
		quickSort(0, length - 1);
	}

	
	/*
	 * The complexity of quick sort in the average case is Θ(n log(n)) and in the worst case is Θ(n2). - 
	See more at: http://www.java2novice.com/java-sorting-algorithms/quick-sort/#sthash.C6iWydwG.9wDtSon1.dpuf
	*
	*/
	private void quickSort(int lowerIndex, int higherIndex) {

		int i = lowerIndex;
		int j = higherIndex;
		// calculate pivot number, I am taking pivot as middle index number.
		// lowerIndex +
		int pivot = array[(higherIndex + lowerIndex) / 2];
		// Divide into two arrays
		while (i <= j) {
			/**
			 * In each iteration, we will identify a number from left side which
			 * is greater then the pivot value, and also we will identify a
			 * number from right side which is less then the pivot value. Once
			 * the search is done, then we exchange both numbers.
			 */
			System.out.println("LowerIndex value is" + " " + lowerIndex);
			System.out.println("higherIndex value is" + " " + higherIndex);
			while (array[i] < pivot) {
				i++;
			}
			while (array[j] > pivot) {
				j--;
			}
			if (i <= j) {
				exchangeNumbers(i, j); // move index to next position on both
										// sides
				i++;
				j--;
			}

		}
		// call quickSort() method recursively
		if (lowerIndex < j){
			System.out.println("Vaue of lowerIndex" + " " + lowerIndex + " " + "Value of J " + " " + j);
		quickSort(lowerIndex, j);}
		else	if (i < higherIndex){
			System.out.println("Vaue of I" + " " + i + " " + "Value of higherIndex " + " " + higherIndex);
		quickSort(i, higherIndex);
	}
	}

	private void exchangeNumbers(int i, int j) {
		System.out.println("Values of I and J being swapped are" + " " + i + " " + j);
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	public static void main(String a[]) {

		QuickSort sorter = new QuickSort();
		int[] input = { 4, 9, 1, 11, 2 }; // { 10, 9, 14, 23, 1 };
		sorter.sort(input);
		for (int i : input) {
			System.out.print(i);
			System.out.print(" ");
		}
	}
	// See more at:
	// http://www.java2novice.com/java-sorting-algorithms/quick-sort/#sthash.C6iWydwG.dpuf
}
