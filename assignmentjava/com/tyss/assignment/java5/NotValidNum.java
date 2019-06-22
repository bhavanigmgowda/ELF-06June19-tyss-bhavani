package com.tyss.assignment.java5;

public class NotValidNum extends Exception {
	String s = "pls enter positive number";

	@Override
	public String toString() {
		return s;
	}

	@Override
	public String getMessage() {

		return s;
	}

}
