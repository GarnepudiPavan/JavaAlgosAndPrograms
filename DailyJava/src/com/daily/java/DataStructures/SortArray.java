package com.daily.java.DataStructures;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortArray { // implements Comparable<ArraySortWithComparable>{

	Integer array1[] = { 10, 0, 2, 12, 9, 7, 1 };
	int middle;

	public void mergeSortSplit(int start, int end) {
		
		if (start < end) {
			middle = (start + end) / 2;
			mergeSortSplit(start, middle);
			mergeSortSplit(middle + 1, end);
			mergeSort(start, middle, end);
		}
	}

	public void mergeSort(int start, int middle, int end) {
		Integer temp[] = new Integer[array1.length];
		int i = start;
		int j = middle + 1;
		int k = start;

		for (int in = 0; in < temp.length; in++) {
			temp[in] = array1[in];
		}

		while (i <= middle && j <= end) {
			if (temp[i] < temp[j]) {
				array1[k] = temp[i];
				i++;
			} else  {
				array1[k] = temp[j];
				j++;
			}
			k++;

		}
		while (i <= middle) {
			array1[k] = temp[i];
			i++;
			k++;
		}
		while (j <= end) {
			array1[k] = temp[j];
			j++;
			k++;
		}
	}

	public static void main(String args[]) {

		SortArray obj = new SortArray();
		List<Integer> list1 = Arrays.asList(obj.array1);
		for (Integer integ1 : list1) {
			System.out.println("UnSorted Integer List " + " " + integ1);
		}

		obj.mergeSortSplit(0, obj.array1.length-1);

		for (Integer integ : list1) {
			System.out.println("Sorted Integer List using MergeSort " + " " + integ);
		}

	}

}
