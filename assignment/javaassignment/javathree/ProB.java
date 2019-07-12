package com.tyss.assignment.javathree;

public class ProB {
	private int id;
	private String pname;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return pname;
	}

	public void setName(String pname) {
		this.pname = pname;
	}

}

class DBP1 {
	void pass(ProB p) {

		System.out.println("product id is " + p.getId());
		System.out.println("product name is " + p.getName());

	}
}
