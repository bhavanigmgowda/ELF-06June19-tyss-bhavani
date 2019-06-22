package com.tyss.assignment.java5;

public class ValidNum {
	int s;

	void valid(int s) throws NotValidNum {
		this.s = s;
		if (s > 0) {
			System.out.println("valid Number");
		} else {
			throw new NotValidNum();
		}
	}

}
