package com.tyss.javaapp.collection;

import java.util.ArrayList;

public class Pro2ArrayListForEach {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(10);
		a.add('c');
		a.add("bhavani");
		a.add(4.6);
		a.add(50);
		a.add(7.96);
		for (Object o : a) {
			System.out.println(o);
		}
	}
}