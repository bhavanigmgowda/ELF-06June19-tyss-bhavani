package com.tyss.javaapp.stream;

import java.util.ArrayList;
import java.util.Comparator;

import lombok.extern.java.Log;
@Log
public class ProA {
	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(60);
		Comparator<Integer> c=(i,j)->i.compareTo(j);
		Integer minValue= a.stream().min(c).get();
		
		
		log.info(" "+minValue);
	}

}
