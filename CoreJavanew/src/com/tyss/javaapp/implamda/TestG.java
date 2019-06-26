package com.tyss.javaapp.implamda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import lombok.extern.java.Log;
@Log
public class TestG {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(20);
		al.add(33);
		al.add(50);
		al.add(60);
		al.add(70);
		Comparator<Integer> c=(i,j)-> i.compareTo(j)*-1;
		List<Integer> x = al.stream().sorted(c).collect(Collectors.toList());
		log.info("" + x);
	}

}
