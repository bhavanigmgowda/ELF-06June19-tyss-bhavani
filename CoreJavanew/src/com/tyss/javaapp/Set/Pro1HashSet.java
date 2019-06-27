package com.tyss.javaapp.set;

import java.util.HashSet;
import java.util.Iterator;

public class Pro1HashSet {
	public static void main(String[] args) {
		HashSet h = new HashSet();
		h.add(5);
		h.add(2.4);
		h.add('a');
		h.add("bhavani");
		System.out.println("************");

		for (Object r : h) {
			System.out.println(r);
		}
		System.out.println("************");

		Iterator it = h.iterator();

		while (it.hasNext()) {
			Object o = it.next();
			System.out.println(o);
		}
	}

}
