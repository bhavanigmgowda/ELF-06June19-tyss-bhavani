package com.tyss.assignment.java5;

public class Student {
	String name;
	int age;
	double marks;

	void set(String name, int age, double marks) {
		this.name = name;
		this.age = age;
		this.marks = marks;

	}

	void get() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(marks);
	}

}
