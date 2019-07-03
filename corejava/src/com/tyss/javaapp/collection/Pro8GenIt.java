package com.tyss.javaapp.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Pro8GenIt {
	public static void main(String[] args) {
		ArrayList<Double> a=new ArrayList<Double>();
		a.add(4.5);
		a.add(6.4);
		a.add(7.9);
		a.add(1.3);

		Iterator<Double> it=a.iterator();
		while(it.hasNext())
		{
			Double o=it.next();
			System.out.println(o);
		}
		
		ArrayList<String> str=new ArrayList<String>();
		str.add("bhavani");
		str.add("vani");
		str.add("avani");
		str.add("abc");
		Iterator<String> sit=str.iterator();
		while(sit.hasNext())
		{
			String o=sit.next();
			System.out.println(o);
		}
		
		
	}

}
