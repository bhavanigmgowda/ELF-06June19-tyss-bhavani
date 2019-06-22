package com.tyss.javaapp.collection;
//remove element present in 1 array of element  
import java.util.ArrayList;

public class Pro16 {
	public static void main(String[] args) {
		ArrayList<Double> a1=new ArrayList<Double>();
		a1.add(9.2);
		a1.add(1.5);
		a1.add(6.9);
		a1.add(2.4);
		a1.add(3.6);
		ArrayList<Double> b1=new ArrayList<Double>();
		b1.add(154.67);
		b1.add(763.87);
		System.out.println("Before--->"+a1);
		boolean b=a1.containsAll(b1);
		System.out.println(b);
		System.out.println("After--->"+a1);
		
	}
}
