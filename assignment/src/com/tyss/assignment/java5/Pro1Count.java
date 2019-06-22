package com.tyss.assignment.java5;

public class Pro1Count {
	static int count;

	public Pro1Count() {
		count++;

	}

	static void getCount() {
		System.out.println("number of object created= " + count);
	}

}
