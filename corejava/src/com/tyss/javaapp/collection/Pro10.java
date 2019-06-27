package com.tyss.javaapp.collection;

import java.util.ArrayList;
//boolean add
public class Pro10 {
	public static void main(String[] args) {
		ArrayList<Double> a1=new ArrayList<Double>();
		a1.add(9.2);
		a1.add(1.5);
		a1.add(6.9);
		a1.add(2.4);
		a1.add(3.6);
		System.out.println("Before--->"+a1);
		
		a1.add(22.24);
		
		System.out.println("After--->"+a1);
		
	}

}
