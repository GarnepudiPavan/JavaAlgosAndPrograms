package com.daily.java;

public class EqualsComparison {

	String color;
	String make;
	int speed;
	Integer price;

	public EqualsComparison(String color, String make, int speed) {
		this.color = color;
		this.make = make;
		this.speed = speed;
	}

	/*
	 * SCJP study Guide book page 333,334 and 335 If below Equals method of
	 * Object is not overwritten then Equals method call will execute Object
	 * Class equals method and will return False as it does comparison based on
	 * "==" which compares reference for Objects. We overwrite Object class
	 * method, Equals, as seen below; using "Instanceof" keyword, current
	 * object comparison and String class equals method to do exact content
	 * comparison of Objects of EqualsComparison class. (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */

	public boolean equals(Object obj) {
		if (this == obj) {//if same reference is passed then return true
			return true;
		} else if (!(obj instanceof EqualsComparison)) {
			//if argument passed is not an instance of type EqualsComparison class then return false
			return false;
		}

		EqualsComparison obj1 = (EqualsComparison) obj;
		return (speed == obj1.speed && make.equals(obj1.make) && color.equals(obj1.color));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EqualsComparison obj1 = new EqualsComparison("White", "Maruti", 120);
		obj1.price = 10;
		EqualsComparison obj2 = new EqualsComparison("White", "Maruti", 120);
		obj2.price = 20;
		String s1 = new String("Durga");
		String s2 = new String("Durga");
		System.out.println("Equals to comparison" + " " + obj1.equals(obj2));
		System.out.println("Double equals to or Equality operator == comparison" + " " + (obj1 == obj2));

		System.out.println("Equals method of String Class  comparison" + " " + s1.equals(s2));
		System.out.println("Double equals to or Equality operator == comparison  of String" + " " + (s1 == s2));
		if (obj1.speed == obj2.speed) {
			System.out.println("This will print as == for primitive values compare only value and not references"
					+ "obj1.speed==obj2.speed ");
		}
		if (obj1.price.equals(obj2.price)) {
			System.out.println(
					"This will also not print as equals must be overritten else it will compare refernce and not value");
		}
		obj2.price = obj1.price;
		if (obj1.price.equals(obj2.price)) {
			System.out.println("This value will be printed as Obj2 reference is now pointing to obj1"
					+ "Value of obj1.price is" + " " + obj1.price + " " + "Value of obj2.price is" + " " + obj2.price);
		}

	}

}
