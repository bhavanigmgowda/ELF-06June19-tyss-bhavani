package com.tyss.assignment.java5;
/*
 * WAP to store student WRT role (using Map<string,arraylist<student>>)
 */

public class Pro8 {
	public static void main(String[] args) {
		ValidAge v = new ValidAge();
		try {
			v.valid(18);
		} catch (NotValidAge e) {

			System.out.println(e);
		}
	}
}
