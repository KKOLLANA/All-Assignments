package com.cg.model;        //package

public class calc {              //class declaration
	int num1 = 2;
	int num2 = 2;                 // variables directly initializing the values
	int result;
	
	public void perform()   // Method
	{
		result  = num1 + num2;
		System.out.println("answer is = " +result);
	}		
	
	
	public static void main(String[] args) {
		calc hello = new calc();
		hello.perform();   

	}

}
