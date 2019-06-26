package com.tyss.javaapp.implamda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import lombok.extern.java.Log;

@Log
public class TestD {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(20);
		al.add(33);
		al.add(50);
		al.add(60);
		al.add(70);
		List<Integer> x = al.stream().filter(i -> i % 2 != 0).collect(Collectors.toList());
		log.info("" + x);
	}

}
