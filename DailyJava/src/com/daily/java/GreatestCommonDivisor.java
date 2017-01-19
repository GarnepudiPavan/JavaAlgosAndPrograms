package com.daily.java;

public class GreatestCommonDivisor {

	private int a = 0;
	private int b = 0;
	// private int[] gcdNumber = new int[100];
	// private int count = 0;
	private int gcdValue = 0;

	public int findGCD(int x, int y) {
		if (x > 1 && y > 1) {
			a = x;
			b = y;
		} else {
			System.out.println("Invalid input");
			return 1;
		}
		
		int r =a;
		/*
		 * for (int i = 2; i <= a / 2; i++) { if (a % i == 0 && b % i == 0) {
		 * gcdNumber[count] = i; count++; } }
		 * System.out.println("GCD of given number " + " " + x + " " + y + " " +
		 * "is"); return getMax(gcdNumber);
		 */
		System.out.println("GCD of given numbers is" + " " + a + " " + b);
		/*while (a != b) {
			if (a > b) {
				a = a - b;
			} else {
				b = b - a;
			}
		}
		This logic also works
		*/
		
		while(r!=0){
			r=a%b;
			a=b;
			b=r;
		}
		
		gcdValue = a;
		System.out.println(" " + gcdValue);
		return gcdValue;
	}

	/*
	 * public int getMax(int a[]) { int temp = 0; for (int i = 0; i < a.length -
	 * 1; i++) { for (int j = 0; j < a.length - 1; j++) { if (a[j] < a[j + 1]) {
	 * temp = a[j + 1]; a[j + 1] = a[j]; a[j] = temp; } } } System.out.print(" "
	 * + a[0]); return a[0]; }
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GreatestCommonDivisor gcd = new GreatestCommonDivisor();
		gcd.findGCD(525, 375);
	}

}
