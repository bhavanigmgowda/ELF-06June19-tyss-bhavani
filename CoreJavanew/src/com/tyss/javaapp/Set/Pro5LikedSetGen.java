package com.tyss.javaapp.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Pro5LikedSetGen {
	public static void main(String[] args) {
		LinkedHashSet<Integer> h = new LinkedHashSet<Integer>();
		h.add(5);
		h.add(2);
		h.add(4);
		h.add(6);
		System.out.println("************");

		for (Integer r : h) {
			System.out.println(r);
		}
		Iterator<Integer> it = h.iterator();
		System.out.println("************");

		while (it.hasNext()) {
			Object o = it.next();
			System.out.println(o);
		}
	}

}
