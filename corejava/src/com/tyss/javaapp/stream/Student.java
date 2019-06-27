package com.tyss.javaapp.stream;

import lombok.extern.java.Log;

@Log
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
		log.info("name=" + name);
		log.info("id=" + id);
		log.info("per=" + per);
	}

}
