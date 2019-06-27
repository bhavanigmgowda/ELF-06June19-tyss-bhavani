package com.tyss.javaapp.collection;

public class Student {
	String name;
	int id;
	double per;

	public void set(String name, int id, double per) {
		this.name = name;
		this.id = id;
		this.per = per;
	}

	void display() {
		System.out.println("name=" + name);
		System.out.println("id=" + id);
		System.out.println("per=" + per);
	}

}
