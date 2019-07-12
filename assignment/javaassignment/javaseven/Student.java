package com.tyss.assignment.javaseven;

import java.util.logging.Logger;

public class Student {
	private static final Logger log=Logger.getLogger("bhavani");

	String name;
	int id;
	double marks;

	void set(String name, int id, double marks) {
		this.name = name;
		this.id = id;
		this.marks = marks;

	}
	
	@Override
	public String toString() {
		return "name= "+ name+" id= "+id+" marks= "+marks;
	}

	void get() {
		log.info("name= "+name+"id= "+id+"marks= "+marks);
	}

}
