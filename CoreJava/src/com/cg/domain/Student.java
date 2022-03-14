package com.cg.domain;

public class Student {
	public String name1;
	public String name2;
	public double gpa1;
	public double gpa2;
	
	
public Student(String na, String nam)
{
	name1 = na;
	name2 = nam;
	
}

	public String getName1()
	{
		return name1;
	}
	public String getName2()
	{
		return name2;
	}
	public double getGpa1() {
		return gpa1;
	}
	public void setGpa1(double a) {
		gpa1 =a;	
	}
	public double getGpa2() {
		return gpa2;
	}
	public void setGpa2(double g) {
		gpa2 =g;
	}
	public static void main (String args) 
	{
		Student s1 = new Student("kiran","kumar");
				s1.setGpa1(123.3);
				s1.setGpa2(124.2);			
		System.out.println(s1.getName1());
		System.out.println(s1.getName2());
	}
}

