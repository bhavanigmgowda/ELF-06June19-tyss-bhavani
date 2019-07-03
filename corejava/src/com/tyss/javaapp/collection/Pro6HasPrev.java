package com.tyss.javaapp.collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class Pro6HasPrev {
	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(10);
		a.add('c');
		a.add("bhavani");
		a.add(4.6);
		a.add(50);
		a.add(7.96);
		
		ListIterator i=a.listIterator(a.size());
		while(i.hasPrevious())
		{
			Object o=i.previous();
			System.out.println(o);
		}
}

}
