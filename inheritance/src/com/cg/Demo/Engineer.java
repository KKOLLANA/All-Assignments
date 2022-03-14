package com.cg.Demo;

public class Engineer extends Employee1
{
private int id;
private String name;
private String ssn;
private double salary;
public Engineer(int Id,String Name,String Ssn,double Salary)
{
id=Id;
name=Name;
ssn=Ssn;
salary=Salary;
}
public String toString()
{
return "[id= "+id+", "+"Name= "+name+", ssn= "+ssn+", salary= "+salary+"]";

}
}



