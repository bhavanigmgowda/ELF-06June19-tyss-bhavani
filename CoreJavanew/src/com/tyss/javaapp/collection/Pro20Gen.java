package com.tyss.javaapp.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Pro20Gen {

	public static void main(String[] args) {
		LinkedList<Character> l = new LinkedList<Character>();
		l.add('b');
		l.add('h');
		l.add('a');
		System.out.println("**************");
		for (int i = 0; i < l.size(); i++) {
			Character o = l.get(i);
			System.out.println(o);
		}
		System.out.println("**************");
		for (Character o : l) {
			System.out.println(o);
		}

		System.out.println("**************");

		Iterator<Character> it = l.iterator();

		while (it.hasNext()) {
			Character o = it.next();
			System.out.println(o);
		}

		System.out.println("**************");
		ListIterator<Character> lit = l.listIterator();
		while (lit.hasNext()) {
			Object o = lit.next();
			System.out.println(o);
		}

		System.out.println("**************");
		while (lit.hasPrevious()) {
			Object o = lit.previous();
			System.out.println(o);
		}

	}

}
