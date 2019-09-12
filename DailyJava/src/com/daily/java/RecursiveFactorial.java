package com.daily.java;

public class RecursiveFactorial {

	//Factorial of number more than 10 is beyond capacity of int 32 bits hence return type is used as long
	public long factorial(int n) {
		int fact = 1;
		
		if (n <= 0 || n==1) {
			return 1;
		} else if(n>1){
			fact = (int) (n*factorial(n-1));
		}
		return fact;
	}

	public int nonRecursive(int n){
		int fact=1;
		if(n<=0){
			return 1;
		}else if(n==1){
			return 1;
		}else{
			for(int i=1; i<=n; i++){
			fact=fact*i;	

	}
		}
		return fact;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RecursiveFactorial obj1 = new RecursiveFactorial();
		System.out.println("Factorial of given number using recursive is" + " " + obj1.factorial(16));
		System.out.println("Factorial of given number using non-recursice is" + " " + obj1.nonRecursive(5));
	}

}
