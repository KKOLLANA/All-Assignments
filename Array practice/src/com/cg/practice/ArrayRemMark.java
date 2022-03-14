package com.cg.practice;

import java.util.ArrayList;

public class ArrayRemMark 
{
	public static void main(String arg[])
	{
	ArrayList<ArrayList<String>> details = new ArrayList<ArrayList<String>>();
	
	ArrayList<String> s1 = new ArrayList<String>();
	s1.add("jane doe");
	s1.add("50");
	details.add(s1);
	
	ArrayList<String> s2 = new ArrayList<String>();
	s1.add("jane doe");
	s1.add("80");
	details.add(s2);
	
	for(int i=0; i < details.size(); i++)
			
	{
		
		for(int j=0; j < details.get(i).size(); j++)
{
	System.out.print(details.get(j)+ "");
}
	}
	System.out.println();
	}
	

}
