package com.tyss.javaapp.construtor;

public class Emp {
	String name;
	int id; 
	double sal;
	Emp(String name, int id, double sal)
	{
		this.name=name;
		this.id=id;
		this.sal=sal;
	}
	void display()
	{
		System.out.println("name is "+name);
		System.out.println("id is "+id);
		System.out.println("sal is "+sal);
	}
}
