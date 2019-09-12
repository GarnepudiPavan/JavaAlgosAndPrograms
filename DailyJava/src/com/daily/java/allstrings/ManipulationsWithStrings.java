package com.daily.java.allstrings;

public class ManipulationsWithStrings {

	public String reverseOfString(String s) {
		String temp = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			temp = temp + s.charAt(i);
		}

		System.out.println("Reverse of String is" + " " + temp);
		return temp;
	}

	public String reverseOfStringTokens(String s) {
		String temp = "";
		if (s.length() == 1) {
			temp = s;
		} else if (s.length() > 2) {
			String[] subS = s.split(" ");

			for (int i = 0; i <= subS.length - 1; i++) {

				System.out.println("Array given is" + " " + subS[i]);

				for (int j = subS[i].length() - 1; j >= 0; j--) {

					temp = temp + subS[i].charAt(j);
				}temp = temp +" ";
				System.out.println("Array given is after reverse" + " " + subS[i]);
			}
		}
		return temp;
	}

	public boolean isPalindrome(String s) {
		StringBuffer st = new StringBuffer(s);
		System.out.println("Reverse of String" + " " + st.reverse() + " " + "and palindrome check using String Buffer"
				+ " " + s.equals(st.reverse().toString()));
		if (s.equals(reverseOfString(s))) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ManipulationsWithStrings obj1 = new ManipulationsWithStrings();
		obj1.reverseOfString("Hello there");
		System.out.println("Given String is a Palindrome is" + " " + obj1.isPalindrome("malayalam"));
		System.out.println("Reverse of individual tokens in a sentence" + " " + obj1.reverseOfStringTokens("The Cow"));

	}

}
