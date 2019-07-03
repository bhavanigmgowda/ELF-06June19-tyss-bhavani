package com.tyss.javaapp.construtor;

public class Student {
	String name;
	int age;
	double per;
	public Student(String n, int a, double p)
	{
		name=n;
		age=a;
		per=p;
		// TODO Auto-generated constructor stub
	}
	void display()
	{
		System.out.println("name is "+name);
		System.out.println("age is "+age);
		System.out.println("percentage is "+per);
	}

}
