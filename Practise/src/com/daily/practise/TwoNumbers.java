package com.daily.practise;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class TwoNumbers {

	
	public int[] twoNumbers(int sum, Integer array[]) {
		int index[] =new int[2];
		List <Integer> number =  new LinkedList<>(Arrays.asList(array));
		/*
		 * for(Integer val: array) { number.add(val); }
		 */
		int temp=-1;
		for(int i=0; i<array.length; i++) {
		temp=sum-array[i];
			if(number.contains(temp)) {
				index[0]=number.indexOf(array[i]);
				index[1]=number.indexOf(temp);
				break;
			}else {
				continue ;
			}
		}
	return index;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoNumbers obj1 = new TwoNumbers();
		Integer arrayInt[] = {5,6,17,14,3,7,-1,1}; int sum = 0;
		int result[] = obj1.twoNumbers(sum, arrayInt);
		for(Integer values: result) {
			System.out.println("Number exist for given sum at index"+" "+values);
		}

	}

}
