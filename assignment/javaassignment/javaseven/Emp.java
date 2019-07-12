package com.tyss.assignment.javaseven;

import java.util.logging.Logger;

public class Emp {
	private static final Logger log=Logger.getLogger("bhavani");

	String name;
	int id;
	int exp;
	String job;
	
	
	public Emp(String name, int id, int exp, String job) {
		super();
		this.name = name;
		this.id = id;
		this.exp = exp;
		this.job = job;
	}


	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + ", exp=" + exp + ", job=" + job + "]";
	}


	
}
