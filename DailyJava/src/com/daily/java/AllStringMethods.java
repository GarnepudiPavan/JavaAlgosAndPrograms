package com.daily.java;

public class AllStringMethods {

	// creation of string method1
	String value1 = "Saibaba";
	// creation of String method2
	String value = new String("Saibaba");
	// method 3 for String creation
	char[] charArray = { 's', 'a', 'i', 'b', 'a', 'b', 'a' };
	String comValue = String.copyValueOf(charArray);

	// Method 4 of String creation
	int value2String = 11;
	String newValue = String.valueOf(value2String);

	// Method 5 to create String
	String value11 = "stringplusint" + 12;

	String reverse = "Monday is Funday and every day is Sunday!";

	public String reverseAString(String givenString) {
		char[] tokens = givenString.toCharArray();
		String returnString = " ";
		for (int i = tokens.length - 1; i >= 0; i--) {
			returnString = returnString + tokens[i];
		}
		return returnString;

	}

	public String reverseAStringInSamePosition(String givenString) {
		char[] tokens;
		String returnString = " ";
		String[] stringTokens = givenString.split(" ");
		for (int i = 0; i < stringTokens.length; i++) {
			tokens = stringTokens[i].toCharArray();
			for (int j = tokens.length - 1; j >= 0; j--) {
				returnString = returnString + tokens[j];
			}
			returnString = returnString + " ";
		}
		return returnString;

	}

	public static void main(String args[]) {

//		StringBuffer value2 = "Shirdi Sai";
//		StringBuilder value3 = "Sadguru Sai";
		AllStringMethods obj1 = new AllStringMethods();

		System.out.println("Char array is converted to String using copyValueof(char[]) method of String class" + " "
				+ obj1.comValue);
		if (obj1.value.hashCode() == obj1.value1.hashCode()) {
			System.out.println("Hashcode values of two Strings" + " " + "String1" + " " + obj1.value + " " + "is:"
					+ obj1.value.hashCode());
			System.out.println("Hashcode values of two Strings" + " " + "String2" + " " + obj1.value1 + " " + "is:"
					+ obj1.value1.hashCode());
		}

		System.out.println("11,int data type converted to String using String.valueOf(int i)" + " " + obj1.newValue);
		System.out.println("String  concat with int using '+' is also a string" + "" + obj1.value11);
		System.out.println("Reverse of string entire line" + " " + obj1.reverse + " " + " " + " "
				+ obj1.reverseAString(obj1.reverse));

		System.out.println("Reverse of string tokens" + " " + obj1.reverse + " " + " " + " "
				+ obj1.reverseAStringInSamePosition(obj1.reverse));
	}

}
