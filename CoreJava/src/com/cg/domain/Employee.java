package com.cg.domain;

public class Employee {
	public int empId;
	public String name;
	public String ssn;
	public int salary;
	
	public Employee(int id,String s,int sal) {
		empId = id;
		ssn = s;
		salary = sal;
	}
		
	public int getEmpId() {
		return empId;

	}
	public String getName() {
		return name;
	}
	public void setName(String n)
	{
		name = n;
	}
	public String getSsn() {
		return ssn;
	}
		public int getSalary() {
			return salary;
	}
	
		
			
	
			public static void main(String[] args) {
				
			Employee e1 = new Employee(2101,"1235427",20000);
			e1.setName("Kiran Kumar");
			System.out.println( e1.getName());
			System.out.println( e1.getEmpId());
			System.out.println(e1.getSsn());
			System.out.println(e1.getSalary());
			
			
		}
		
		
	}

