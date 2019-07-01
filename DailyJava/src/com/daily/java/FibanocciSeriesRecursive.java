package com.daily.java;

public class FibanocciSeriesRecursive {

	private int fib = 0;

	private int n3=0;
	private int n1=1;
	private int n2=1;

	public int fibSeries(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else if (n == 2) {
			return 1;
		} else if (n > 2) {

			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			fibSeries(n - 1);
			fib = n3;
		}
		System.out.println("Fib series " + " " + fib);
		return fib;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FibanocciSeriesRecursive fib = new FibanocciSeriesRecursive();
		System.out.println("Fibbanoci series for given length is" + " " + fib.fibSeries(11));

	}

}
