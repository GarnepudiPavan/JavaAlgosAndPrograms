package com.daily.java;

public class ReverseOfNumber {
	private int number = 0;
	private int answer = 0;
	private int reminder = 0;

	public int reverseOfNumber(int e) {
		number = e;
		System.out.println("Given number is" + " " + number);
		if (number == 0 || number < 10) {
			return number;
		} else {
			while (number != 0) {

				reminder = number % 10;
				answer = answer * 10 + reminder;
				number = number / 10;
			}
			return answer;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseOfNumber rev = new ReverseOfNumber();
		long startTime = System.currentTimeMillis()/1000;
		System.out.println("Start time" + "" + startTime);
		int reversedValue = rev.reverseOfNumber(123);
		long endTime = System.currentTimeMillis()/1000;
		System.out.println("Reverse of given number is" + " " + reversedValue);
		System.out.println("End time" + "" + System.currentTimeMillis()/1000);
		System.out.println("Time taken" + " " + (endTime-startTime));
	}

}
