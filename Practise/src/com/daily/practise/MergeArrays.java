package com.daily.practise;

public class MergeArrays {

	int[] array1 = new int[10];
	int[] array2 = new int[10];

	public MergeArrays(int array1[], int array2[]) {
		this.array1 = array1;
		this.array2 = array2;
	}

	public int[] mergeArrays() {
		int i = 0;
		int j = 0;
		int k = 0;
		int[] mergeArray = new int[array1.length + array2.length];
		// if(array1.length < array2.length) {
		while ((i < array1.length) && (j < array2.length)) {
			if (array1[i] < array2[j]) {
				mergeArray[k] = array1[i];
				i++;
			} else if (array1[i] > array2[j]) {
				mergeArray[k] = array2[j];
				j++;
				//
			}
			k++;
		}
		while (i < array1.length) {

			mergeArray[k] = array1[i];
			i++;
			k++;
		}
		while (j < array2.length) {

			mergeArray[k] = array2[j];
			j++;
			k++;
		}

		// }
		return mergeArray;
	}

	public static void main(String args[]) {

		int a1[] = { 10,20,30,40,50 };//32, 33, 34, 35, 36, 137
		int a2[] = { 2,3,4,5,6,110 };//22, 23, 24, 25, 26, 127
		MergeArrays obj1 = new MergeArrays(a1, a2);
		int a3[] = obj1.mergeArrays();
		for (Integer y1 : a3) {
			System.out.println("Merged array" + " " + y1);
		}

	}

}
