package com.daily.java;

public class NumericPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j < i + 1; j++) {

				System.out.print(" " + "*");// replace j with * for diamond pattern

			}
			System.out.println("");

		}
		// Below for loop is not needed if we want to print only upper part of
		// Triangle

		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j < i + 1; j++) {

				System.out.print(" " + "*");// replace j with "*" for diamond pattern

			}
			System.out.println("");
		}

	}

}
