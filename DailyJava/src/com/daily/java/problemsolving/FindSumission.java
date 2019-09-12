package com.daily.java.problemsolving;

import java.util.Arrays;
import java.util.HashMap;
/*
 * Given a pair of two integer arrays of equal length and a target number.
 * Identify pair of numbers from two arrays that are close or equal to given target number.
 * For example array1[]={1,2,3,7,5,12} and array2[]={9,12,23,4,16,20}. Target number is 35.
 * Then we ned to find array1, array2= (12,23) = 35 and also (12,20) = 32 which is close to target.
 */
import java.util.HashMap.*;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindSumission {

	int array1[] = { 1, 2, 3, 7, 5, 12 };
	int array2[] = { 9, 12, 23, 4, 16, 20 };
	int targetNumber = 18;

	public HashMap<Integer, Integer> matchFinder() {
		HashMap<Integer, Integer> matchingMap = new HashMap<Integer, Integer>();
		// List<Integer> tempList = Arrays.asList(array2);
		// If we want to use this direct Arrays method then array2 must be of type
		// Integer and not int. As compiler will throw boxing error cannot convert
		// List<int[]> to List<Integer>
		List<Integer> tempList = Arrays.stream(array2).boxed().collect(Collectors.toList());
		// Above Stream method is introduced in Java 8 to support boxing from int to
		// Integer
		int temp = 0;

		for (int i = 0; i < array1.length; i++) {
			temp = (targetNumber - array1[i]);
			if (tempList.contains(temp)) {
				matchingMap.put(array1[i], tempList.get(tempList.indexOf(temp)));
			} else if (tempList.contains(temp + 1)) {
				matchingMap.put(array1[i], tempList.get(tempList.indexOf(temp + 1)));
			} else if (tempList.contains(temp - 2)) {
				matchingMap.put(array1[i], tempList.get(tempList.indexOf(temp - 2)));
			} else if (tempList.contains(temp - 3)) {
				matchingMap.put(array1[i], tempList.get(tempList.indexOf(temp - 3)));
			}
		}

		return matchingMap;

	}

	public static void main(String args[]) {
		FindSumission obj1 = new FindSumission();
		HashMap<Integer, Integer> temp = obj1.matchFinder();
		for (Map.Entry<Integer, Integer> matchingNumbers : temp.entrySet()) {
			System.out.println("Matching number from Array1" + " " + matchingNumbers.getKey());
			System.out.println("Matching number from Array2" + " " + matchingNumbers.getValue());

		}
	}
}
