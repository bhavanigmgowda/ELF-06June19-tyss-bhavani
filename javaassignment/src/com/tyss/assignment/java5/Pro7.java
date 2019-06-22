package com.tyss.assignment.java5;

public class Pro7 {
	public static void main(String[] args) {
		ValidNum v = new ValidNum();
		try {
			v.valid(0);
		} catch (NotValidNum e) {

			System.out.println(e);
		}
	}

}
