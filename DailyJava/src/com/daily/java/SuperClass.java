package com.daily.java;

public class SuperClass {
	
	private int x;
	public int y;

	
	public SuperClass(int x, int y){
		this.x=x;
		this.y=y;
		
	}
	
	
	
	private void displayValues(){
		System.out.println("Given values are"+" "+x+" "+y);	
	}
	
	
	public void givenValues(){
		System.out.println("Given values are"+" "+x+" "+y);
	}
}
