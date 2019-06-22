package com.tyss.javaapp.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Pro4TreeSetGen {
	public static void main(String[] args) {
		TreeSet<Integer> h = new TreeSet<Integer>();
		h.add(5);
		h.add(2);
		h.add(4);
		h.add(6);
		System.out.println("************");

		for (Integer r : h) {
			System.out.println(r);
		}
		System.out.println("************");

		Iterator<Integer> it = h.iterator();

		while (it.hasNext()) {
			Object o = it.next();
			System.out.println(o);
		}
	}

}
