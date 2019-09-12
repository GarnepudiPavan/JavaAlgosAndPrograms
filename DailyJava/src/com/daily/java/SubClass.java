package com.daily.java;

public class SubClass extends SuperClass {
	private int a;
	private int b;

	public SubClass(int x, int y) {
		super(4, 5);
		this.a = x;
		this.b = y;
	}

	// overwritten method
	private void displayValues() {
		System.out.println(" SubClass method Dislay Values of a and b are" + " " + a + " " + b);
	}

	// Overwritten method
	public void givenValues() {
		System.out.println("SubClass method Values of a and b are" + " " + a + " " + b);
	}

	public void returnValues() {
		System.out.println("SubClass method Values of a and b are" + " " + a + " " + b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SuperClass supObj = new SuperClass(10, 12);
		SubClass subObj = new SubClass(1, 2);

		supObj.givenValues();
		subObj.displayValues();
		subObj.returnValues();
		supObj = subObj;// referring subcalss reference to Super class reference
		/*
		 * When Superclass reference is pointed with sub Class reference it can
		 * only access Sub class methods that are present in Super class and
		 * that too which are public /protected
		 */
		// supObj.displayValues(); this method whoch is present in both classes
		// is not accessible to super class reference as it is declared as
		// private in super class
		// supObj.returnValues();
		supObj.givenValues();// Suer Class reference can access this method as
								// it is present in Super class as well.
		subObj.givenValues();
	}

}
