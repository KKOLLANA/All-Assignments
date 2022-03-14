package com.cg.practice;

import java.util.Scanner;

//one dimentional array

public class Array {
	
	public static void main(String arg[]) {
		
		String names [];            //Declaration
		names = new String[3];    //initializaton
		Scanner input = new Scanner(System.in);
		int count =1;
		String name;
		
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter the name" + count);
			name =input.nextLine();
			names[i] = name;
			count++;
		}
		System.out.println("Student names");
		for(int i= 0; i<3; i++)
		{
			System .out.println(names[i]);
		}
		
	}

}
