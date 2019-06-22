package com.tyss.javaapp.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Pro4ArrayListLItra {
	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(10);
		a.add('c');
		a.add("bhavani");
		a.add(4.6);
		a.add(50);
		a.add(7.96);
		ListIterator it=a.listIterator();
		System.out.println("----->forward");
		while(it.hasNext())
		{
			Object o=it.next();
			System.out.println(o);
			
		}
		System.out.println("---->backward");
		

		while(it.hasPrevious())
		{
			Object o=it.previous();
			System.out.println(o);
		}
		
		
	
	
	
	}
}