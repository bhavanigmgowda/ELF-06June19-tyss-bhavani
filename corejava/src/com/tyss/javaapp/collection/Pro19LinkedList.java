package com.tyss.javaapp.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Pro19LinkedList {
	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add(10);
		l.add('c');
		l.add("bhavani");

		for (int i = 0; i < l.size(); i++) {
			Object o = l.get(i);
			System.out.println(o);
		}

		for (Object o : l) {
			System.out.println(o);
		}

		Iterator it = l.iterator();
		while (it.hasNext()) {
			Object o = it.next();
			System.out.println(o);
		}
		ListIterator lit = l.listIterator();
		while (lit.hasNext()) {
			Object o = lit.next();
			System.out.println(o);
		}
		while (lit.hasPrevious()) {
			Object o = lit.previous();
			System.out.println(o);
		}

	}

}
