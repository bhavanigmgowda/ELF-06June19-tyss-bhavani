package com.tyss.javaapp.Set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Pro6LinkedSet {
	public static void main(String[] args) {
		LinkedHashSet h = new LinkedHashSet();
		h.add(5);
		h.add(2.4);
		h.add('a');
		h.add("bhavani");
		System.out.println("************");
		for (Object r : h) {
			System.out.println(r);
		}
		Iterator it = h.iterator();
		System.out.println("************");

		while (it.hasNext()) {
			Object o = it.next();
			System.out.println(o);
		}
	}

}
