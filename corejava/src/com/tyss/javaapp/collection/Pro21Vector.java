package com.tyss.javaapp.collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

public class Pro21Vector {
	public static void main(String[] args) {
		Vector v = new Vector();
		v.add(10);
		v.add('c');
		v.add("bhavani");

		for (int i = 0; i < v.size(); i++) {
			Object o = v.get(i);
			System.out.println(o);
		}

		for (Object o : v) {
			System.out.println(o);
		}

		Iterator it = v.iterator();
		while (it.hasNext()) {
			Object o = it.next();
			System.out.println(o);
		}
		ListIterator lit = v.listIterator();
		while (lit.hasNext()) {
			Object o = lit.next();
			System.out.println(o);
		}
		while (lit.hasPrevious()) {
			Object o = lit.previous();
			System.out.println(o);
		}

		Enumeration e = v.elements();
		while (e.hasMoreElements()) {
			Object o = e.nextElement();
			System.out.println(o);
		}

	}

}
