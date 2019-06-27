package com.tyss.javaapp.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Pro3TreeSet {
	public static void main(String[] args) {
		TreeSet h = new TreeSet();
		h.add(5);
		h.add(7);
		h.add(6);
		h.add(1);
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
