package com.daily.java;

public class ReverseNumericValue {
	private int number = 0;
	private int ans = 0;
	private int remainder = 0;

	public ReverseNumericValue(int e) {
		this.number = e;
	}

	public int fetchRemainder() {
		// System.out.println("Numeric value given is"+" "+value);
		while (number != 0) {
			remainder = Math.floorMod(number, 10);//same as number%10
			System.out.println("Value of remainder is" + " " + remainder);
			ans = ans * 10 + remainder;
			number = number / 10;
			System.out.println("Value of number is" + " " + number);
		}
		return ans;
	}

	/*
	 * public int fetchQuotient(int x) { //
	 * System.out.println("Numeric value given is"+" "+value); return (x / 10);
	 * }
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseNumericValue obj1 = new ReverseNumericValue(143);
		System.out.println("Reverse of given number " + " " + obj1.number + " " + "is" + " " + obj1.fetchRemainder());

	}

}
