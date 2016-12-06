package com.daily.java;

public class EqualsComparison {

	String color;
	String make;
	int speed;

	public EqualsComparison(String color, String make, int speed) {
		this.color = color;
		this.make = make;
		this.speed = speed;
	}

	/* SCJP study Guide book page 333,334 and 335
	 * If below Equals method of Object is not overwritten then Equals method
	 * call will execute Object Class equals method and will return False as it
	 * does comparison based on "==" which compares reference for Objects. Once
	 * we overwrite Object class methods Equals as seen below we can use
	 * Instance of keyword, cuent object compariosn and String class equals
	 * method to do exact content comparison of Objects of EqualsComparison
	 * class. (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		} else if (!(obj instanceof EqualsComparison)) {
			return false;
		}

		EqualsComparison obj1 = (EqualsComparison) obj;
		return (speed == obj1.speed && make.equals(obj1.make) && color.equals(obj1.color));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EqualsComparison obj1 = new EqualsComparison("White", "Maruti", 120);
		EqualsComparison obj2 = new EqualsComparison("White", "Maruti", 120);
		String s1 = new String("Durga");
		String s2 = new String("Durga");
		System.out.println("Equals to comparison" + " " + obj1.equals(obj2));
		System.out.println("Double equals to or Equality operator == comparison" + " " + (obj1 == obj2));

		System.out.println("Equals method of String Class  comparison" + " " + s1.equals(s2));
		System.out.println("Double equals to or Equality operator == comparison  of String" + " " + (s1 == s2));

	}

}
