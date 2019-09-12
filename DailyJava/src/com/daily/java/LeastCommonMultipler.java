package com.daily.java;

public class LeastCommonMultipler {

	private int a = 0;
	private int b = 0;
	private int lcmValue = 0;
	private int max = 0;
	private int min = 0;

	public int findLCM(int x, int y) {

		if (x > 1 && y > 1) {
			a = x;
			b = y;
		} else {
			System.out.println("Invalid input");
			return 1;
		}
		if (a > b) {
			max = a;
			min = b;
		} else {
			max = b;
			min = a;
		}

		for (int i = 2; i <=min; i++) {
			x = max * i;
			if (x % min == 0) {
				lcmValue = x;
				break;
			}
		}
		System.out.println("LCM of given numbers is" + " " + lcmValue);
		return lcmValue;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeastCommonMultipler lcm = new LeastCommonMultipler();
		lcm.findLCM(5, 4);
	}

}
