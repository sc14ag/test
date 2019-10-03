package com.amdocs;

public class MyClass {

	private int x,y;

	public MyClass(){

		x=5;
		y=10;

		System.out.println("Inside default constructor ...");
		System.out.println("Value of x= "+ x);
		System.out.println("Value of y= "+ y);
	}		
	
	public MyClass (int a,int b){
		x=a;
		y=b;

		System.out.println("Overloaded constructor ...");
	}
	public void printDetails(){

		System.out.println(x);
		System.out.println(y);
	}

	public static void main(String[] args){

		MyClass obj1 = new MyClass();
		obj1.printDetails();

		MyClass obj2 = new MyClass(20,40);
		obj2.printDetails();
	}	

}



