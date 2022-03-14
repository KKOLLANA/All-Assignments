package com.cg.model;

public class Demo {
	int a=10;
	String b ="kiran";
	
	void show() //Method
	{
		System.out.println(a+ " "+b);
	}
	
	public static void main(String[] args) {
		Demo hello = new Demo();
		hello.show(); // calling Method
	
	}

}
