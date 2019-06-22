package com.tyss.javaapp.collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

public class Pro22GenVector {
	public static void main(String[] args) {
		Vector<Integer> v=new Vector<Integer>();
		v.add(10);
		v.add(20);
		v.add(9);
		System.out.println("**************");
		for(int i=0;i<v.size();i++)
		{
			Integer o=v.get(i);
			System.out.println(o);
		}
		System.out.println("**************");
		for(Integer o:v)
		{
			System.out.println(o);
		}

		System.out.println("**************");
		
		Iterator<Integer> it=v.iterator();
		
		while(it.hasNext())
		{
			Integer o=it.next();
			System.out.println(o);
		}

		System.out.println("**************");
		ListIterator<Integer> lit=v.listIterator();
		while(lit.hasNext())
		{
			Object o=lit.next();
			System.out.println(o);
		}

		System.out.println("**************");
		while(lit.hasPrevious())
		{
			Object o=lit.previous();
			System.out.println(o);
		}
		Enumeration<Integer> e=v.elements();
		while(e.hasMoreElements())
		{
			Object o=e.nextElement();
			System.out.println(o);
		}
		
		
	}

}
