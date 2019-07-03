package com.tyss.javaapp.implamda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import lombok.extern.java.Log;
@Log
public class TestH {
	private static final Logger log=Logger.getLogger("bhavani");

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(20);
		al.add(33);
		al.add(50);
		al.add(60);
		al.add(70);
	 al.stream().forEach(i->log.info(i+""));
	
	}

}
