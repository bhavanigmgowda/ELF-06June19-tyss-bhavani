package com.tyss.javaapp.implamda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import lombok.extern.java.Log;
@Log
public class DivThree {
	private static final Logger log=Logger.getLogger("bhavani");

	public static void main(String[] args) {
		ArrayList<Integer> al= new ArrayList<Integer>();
		al.add(20);
		al.add(30);
		al.add(50);
		al.add(60);
		al.add(70);
		
		Predicate<Integer> x1= i->i%3==0;
		List<Integer> x= al.stream().filter(x1).collect(Collectors.toList());
		log.info(""+x);
		
		List<Integer> x2=al.stream().map(i->i*2).collect(Collectors.toList());
		log.info("double array= "+x2);
	}

}
