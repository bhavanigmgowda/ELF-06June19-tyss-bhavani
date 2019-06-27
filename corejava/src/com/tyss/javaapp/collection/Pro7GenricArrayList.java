package com.tyss.javaapp.collection;

import java.util.ArrayList;

public class Pro7GenricArrayList {
	public static void main(String[] args) {
		ArrayList<Double> d=new ArrayList<Double>();
		d.add(3.8);
		d.add(5.7);
		d.add(3.8);
		for(Double o:d)
			System.out.println(o);
	}

}
