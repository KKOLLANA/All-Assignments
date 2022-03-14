package com.cg.practice;

import java.util.Scanner;

public class ArrayHiMarks {
	

public static void main(String arg[]) {
	
	String details[][];            //Declaration
	details = new String[3][5];  //initializaton
	
	Scanner input = new Scanner(System.in);
	int count =1, sum =0,a_mark=0, e_mark=0, highest = 0, grandtotal=0, average;
	
	String name ="",mode,assess,exam,total, bestscore="";
	
	
	//Student details input
	
	
	for(int i=0;i<3;i++)  //row
	{
		for(int j=0; j<5; j++)
			
			{
			if(j==0) 
			{
		System.out.println("Enter the name of the student" + count);
		name =input.nextLine();
		details[i][j] = name;
		count++;
		}
		if(j==1)
		{
			System.out.println("Type mode of Study" + name);
			mode =input.nextLine();
			details[i][j] = mode;
			
		}
		if(j==2) 
		{
			System.out.println("Type assessment for student" + name);
			assess =input.nextLine();
			details[i][j] = assess;
			a_mark = Integer.parseInt(assess);
			

			}
		if(j==3)
		{
		System.out.println("Type exam marks for Student" + name);
		exam =input.nextLine();
		details[i][j] = exam;
		e_mark = Integer.parseInt(exam);
		}
		
			}
		sum = a_mark + e_mark;
		total = Integer.toString(sum);
		details[i][4] = total;
		grandtotal = grandtotal +sum;
		
		if(sum>highest)
		{
			highest = sum;
			bestscore= details[i][0];
		}
		
		int size = details.length;
		average = grandtotal/size;
		
		//output student data
		
		System.out.println("Student details");
		for(int i1=0; i1<3; i1++)
		
		{
			for(int j1=0; j1<5; j1++) 
			{
		System.out.print(details[i1][j1]+ "\t");
			}
			System.out.println();
		
		
		}
	System.out.println("Highest mark" + highest + "by" + bestscore);
	System.out.println("Class average +" +average);
	}
	}
}

	



