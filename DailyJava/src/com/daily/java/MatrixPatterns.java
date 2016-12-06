package com.daily.java;

public class MatrixPatterns {

	public void diamondPattern() {
		int noOfCol = 1;
		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= noOfCol; j++) {

				System.out.print(" " + "*");
			}
			System.out.println();

			if (i < 3) {
				noOfCol = noOfCol + 1;
			} else {
				noOfCol = noOfCol - 1;
			}

		}
	}

	public void squareMatrix() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(" " + "*");
			}
			System.out.println();

		}
	}

	public void squareMatrixWithBlank() {
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j < 5; j++) {

				if (i == 1 || i == 4 || j == 1 || j == 4) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MatrixPatterns obj1 = new MatrixPatterns();
		 obj1.squareMatrix();
		obj1.squareMatrixWithBlank();
		obj1.diamondPattern();

	}
}