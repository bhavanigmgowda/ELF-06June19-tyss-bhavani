package com.tyss.assignment.java5;

public class ValidAge {

	int s;

	void valid(int s) {
		this.s = s;
		if (s > 18) {
			System.out.println("valid age");
		} else {
			throw new NotValidAge();
		}
	}

}
