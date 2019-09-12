package com.daily.practise;

public class StringReverse {

	String input;
	char[] temp;

	public StringReverse(String input) {
		this.input = input;
	}

	public String reverseOfGivenString() {
		String returnValue = " ";
		temp = input.toCharArray();
		for (int i = temp.length - 1; i >= 0; i--) {
			returnValue = returnValue + temp[i];
		}
		return returnValue;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringReverse obj1 = new StringReverse("Resilient cow we could not help! Forgive us Sai");
		System.out.println("Given string is" + " " + obj1.input);
		System.out.println("Reverse of given string is" + " " + obj1.reverseOfGivenString());

	}

}
