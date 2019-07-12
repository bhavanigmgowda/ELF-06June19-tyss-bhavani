package com.tyss.assignment.javathree;

public class ProA {
	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

class DB1 {
	void pass(ProA s) {

		System.out.println("student id is " + s.getId());
		System.out.println("student name is " + s.getName());

	}
}
