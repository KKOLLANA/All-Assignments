package com.cg.practice;
import java.util.ArrayList;

public class ArrayRem 
{
	public static void main(String arg[])
	{
		ArrayList<String>details = new ArrayList<String>();
		
		details.add("jane Doe");
		details.add("Harriet Tubman");
		details.add("jane Doe");
		
		details.remove(2);
		
		System.out.println("Name :" +details);
		System.out.println("size : "+ details.size());
		
		
		
	}

}
