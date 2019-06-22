package com.tyss.assignment.java5;

import java.io.Serializable;

public class Emp {
	String name;
	int age;
	String designation;
	double salary;

	void set(String name, int age, String designation, double salary) {
		this.name = name;
		this.age = age;
		this.designation = designation;
		this.salary = salary;

	}

	void get() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(designation);
		System.out.println(salary);
	}

}
