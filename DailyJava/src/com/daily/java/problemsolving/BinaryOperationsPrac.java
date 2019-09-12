package com.daily.java.problemsolving;

public class BinaryOperationsPrac {
int x =0;
int y=2;
int z=4;

public int preIncrement() {
	int k= y;
	return ++k;
}
public int postIncrement() {
	int k= y;
	return k++;
}



public void callByValue(int a, int b) {
		/*
		 * For privimitive values it is pass by value in Java. Hence values changed
		 * inside method will not reflect. As int value is copied to a and b reference
		 * inside method and will not change values of x and y.
		 */
	int temp  = a;
	a = b;
	b=temp;
	System.out.println("Value of number x within method is"+" "+ a );
	System.out.println("Value of number y within method is"+" "+ b );
	 
}

public int callByReference(BinaryOperationsPrac obj) {
		/*
		 * Here since object reference is passed changing original value inside the
		 * method will also reflect outside the method.
		 */
	int a = ++obj.x;
	return a;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinaryOperationsPrac object = new BinaryOperationsPrac();
		
		System.out.println("Pre Increment of number"+" "+object.y +" "+"is:"+ object.preIncrement());
		System.out.println("Post Increment of number"+" "+object.y +" "+"is:"+ object.postIncrement());
		System.out.println("Value of number y post call of postIncrement method is"+" "+object.y);
		object.callByValue(object.x,object.y);
		System.out.println("After call by value method values of number x and y are"+" "+object.x +" "+"and"+" "+object.y );
		System.out.println("value of number x is"+" "+object.x );
		//object.x =7;
		System.out.println("call by reference of number"+" "+object.x +" "+"is:"+ object.callByReference(object));
		double d = 3.2;
		float f = 2.11f;
		System.out.println(Integer.MAX_VALUE);
		
		
	}

}
