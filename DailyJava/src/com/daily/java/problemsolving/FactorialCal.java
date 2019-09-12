package com.daily.java.problemsolving;

public class FactorialCal {

	long number;
	long fact;

	public FactorialCal(int n) {
		this.number = n;
		//this.fact = 0;
	}

	public int getFactorial(long n) {
		if (n == 1) {
			return 1;
		} else if (n >= 2) {
			return (int) (n * getFactorial(n - 1));
		}else {
		return 1;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FactorialCal obj1 = new FactorialCal(12);
		System.out.println("Factorial of given number" +" "+obj1.number+ " "+"is" +" "+ obj1.getFactorial(obj1.number));
	}

}
