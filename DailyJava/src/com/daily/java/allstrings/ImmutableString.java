package com.daily.java.allstrings;

public class ImmutableString {

	String string1 = new String("Durga");
	String string2 = new String("KANAKA");
	StringBuffer strBuffer = new StringBuffer(string1); 
	StringBuilder strBldr = new StringBuilder(string2);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ImmutableString obj1 = new ImmutableString();
obj1.string1.concat("Software");
obj1.string2 = obj1.string2.concat("Software");

System.out.println("Strng1 remains unchanged as String is immutable"+" "+obj1.string1);
System.out.println("Strng2 is changed as String is immutable and new string oject is assigned to String2 ref"+" "+obj1.string2);

System.out.println("Reverse of a String using String Buffer"+" "+obj1.strBuffer.reverse());
System.out.println("Reverse of a String using String Builder"+" "+obj1.strBldr.reverse());
	
	
	}

}
