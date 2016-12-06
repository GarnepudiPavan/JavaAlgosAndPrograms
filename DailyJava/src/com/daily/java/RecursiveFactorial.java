package com.daily.java;

public class RecursiveFactorial {

	public String factorial(int fact) {
		int n = 0;
		String s;
		if (fact == 0) {
			return "1";
		} else if (fact == 1) {
			return "1";
		} else if (fact > 1) {
			n = fact * Integer.parseInt(factorial(fact - 1));
			s = new String(Integer.toString(n));
			return s;
		}
		return "-1";
	}

	public int nonRecursive(int n){
		
		if(n<=0){
			return 1;
		}else if(n==1){
			return 1;
		}else{
			for(int i=2; i<=n; i++){
			n=n*(n-1);	

	}
		}
		return n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RecursiveFactorial obj1 = new RecursiveFactorial();
		System.out.println("Factorial of given number is" + " " + obj1.nonRecursive(205));
	}

}
