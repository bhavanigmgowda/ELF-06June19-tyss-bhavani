package com.tyss.assignment.java6;

/*
 * WAP to print msg using lambda exp
 */
public class Pro3 {
	public static void main(String[] args) {
		Pro3Int m = () -> {
			System.out.println("hi this is lambda");
		};
		m.msg();
	}

}
