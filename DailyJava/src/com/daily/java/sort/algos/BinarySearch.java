package com.daily.java.sort.algos;

/*
 *Source:- https://www.youtube.com/watch?v=j5uXyPJ0Pew 
 * Binary search is best of all search algorithms. It's Big O notation of O(logN).
 * But Binary search needs array to be in Sorted order to find an element.	Below is the logic:-
 * Given an array(A,n,x)- array A of size n and x is the element to be searched.
 * Then we need to know Start index, End Index and Middle index of Array.
 * while(start index <=end index){mid=(start+end)/2;
 * if(x==A(mid)){
 * return mid;
 * }else if(x<A(mid)){
 * end index = mid-1;
 * }else if (x>Mid(i)){
 * start index = mid+1;  
 * }return -1;
 * }
 */
public class BinarySearch {

	private int a[] = { 0, 1, 5, 7, 9, 15, 32 };
	int midIndex = (a.length / 2);
	int startIndex = 0;
	int endIndex = a.length - 1;

	public int elementFinder(int e) {
		while (startIndex <= endIndex) {
			midIndex = (startIndex + endIndex) / 2;
			if (e == a[midIndex]) {
				return midIndex;
			} else if (e > a[midIndex]) {
				startIndex = midIndex + 1;
			} else if (e < a[midIndex]) {
				endIndex = midIndex - 1;
			}
		}
		return -1;
	}

	// recursive Binary

	public int recursiveBinary(int a[], int start, int end, int element) {

		int min = (start + end) / 2;
		if (element == a[min]) {
			System.out.println("Element is present in array at index" + " " + min);
		} else if (element > a[min]) {
			min = recursiveBinary(a, min + 1, end, element);
		} else if (element < a[min]) {
			min = recursiveBinary(a, start, min - 1, element);
		}
		if (start > end) {
			System.out.println("Element is not present in array at" + " " + -1);
			min = -1;
		}
		return min;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearch obj1 = new BinarySearch();
		System.out.println(" Element given is present in array at index" + " a " + obj1.elementFinder(7));

		int a1[] = { 2, 3, 4, 5, 6, 7, 8 };
		obj1.recursiveBinary(a1, 0, a1.length - 1, 6);
	}

}
