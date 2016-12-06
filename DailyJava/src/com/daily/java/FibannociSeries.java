package com.daily.java;

public class FibannociSeries {
	private int n1 = 1;
	private int n2 = 1;
	private int fib = 0;
	private int k = 0;

	public int returnFib(int n) {

		if (n <= 2) {
			fib= 1;
			System.out.println("Values less than 2"+":"+fib);
			return fib;
		} else {
			while (k <n) {
				fib = n1 + n2;
				System.out.println("Fibbanocci series" + " " + n1+" "+n2+" "+ fib);

				n1 = n2;
				n2 = fib;
				k++;
			}
			
			return fib;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FibannociSeries fib = new FibannociSeries();
		fib.returnFib(12);
	}

}
