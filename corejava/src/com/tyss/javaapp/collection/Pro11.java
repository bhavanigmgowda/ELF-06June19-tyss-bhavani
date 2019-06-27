package com.tyss.javaapp.collection;

/*

		a1.add(index, element);

*/import java.util.ArrayList;
public class Pro11 {
	public static void main(String[] args) {
		ArrayList<Double> a1=new ArrayList<Double>();
		a1.add(9.2);
		a1.add(1.5);
		a1.add(6.9);
		a1.add(2.4);
		a1.add(3.6);
		System.out.println("Before--->"+a1);
		
		a1.add(2,22.34);
		
		System.out.println("After--->"+a1);
		
	}
}
