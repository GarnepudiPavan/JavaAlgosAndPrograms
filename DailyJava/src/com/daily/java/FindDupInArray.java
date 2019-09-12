package com.daily.java;

public class FindDupInArray {

	int a[] = { 43, 4,5,7,9,20,3,3 };
	int count = 0;
	int dup[] = new int[10];

	public void findDup() {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i; j <= a.length - 2; j++) {
				if (a[i] == a[j+1]) {
					dup[count] = a[i];

					count++;

					// break;
				}
			}
		}
		for (int i = 0; i < count; i++) {
			System.out.println("Duplicate element found is" + " " + dup[i]);
		}
		System.out.println("Number of occurences of duplicate element are" + " " + count);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindDupInArray obj1 = new FindDupInArray();
		obj1.findDup();
	}

}
