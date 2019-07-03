package com.tyss.javaapp.implamda;

import java.util.ArrayList;
import java.util.logging.Logger;

import lombok.extern.java.Log;
@Log
public class TestE {
	private static final Logger log=Logger.getLogger("bhavani");

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(20);
		al.add(33);
		al.add(50);
		al.add(61);
		al.add(70);
		
		long x = al.stream().filter(i -> i % 2 != 0).count();
		log.info("no of objects= " + x);
	}

}
