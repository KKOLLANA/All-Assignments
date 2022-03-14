package com.cg.practice;
import java.util.Scanner;


//two dimentional array
public class Array2D 
{
	
	
	public static void main(String arg[]) {
		
		String details[][];            //Declaration
		details = new String[3][4];    //initializaton
		Scanner input = new Scanner(System.in);
		int count =1;
		String name ="",mode,assess,exam;
		
		//Student details input
		
		
		for(int i=0;i<3;i++)  //row
		{
			for(int j = 0; j<4; j++)
				
				{
				if(j==0) 
				{
			System.out.println("Enter the name of the student" + count);
			name =input.nextLine();
			details[i][j] = name;
			count++;
			}  //end column
				
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
			
			}
			if(j==3)
			{
			System.out.println("Type exam marks for Student" + name);
			exam =input.nextLine();
			details[i][j] = exam;
			
			}
			//output student data
			
			System.out.println("Student details");
			for(int i1=0; i1<3; i1++)
			
			{
				for(int j1=0; j1<4; j1++) 
				{
			System.out.print(details[i1][j1]+ "\t");
				}
				System.out.println();
			
			
				
			}
				}
		}
	}


		
}


	


