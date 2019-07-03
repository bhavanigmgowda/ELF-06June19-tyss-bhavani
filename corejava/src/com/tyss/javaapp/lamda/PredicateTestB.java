package com.tyss.javaapp.lamda;

import java.util.function.Predicate;

import lombok.extern.java.Log;
@Log
public class PredicateTestB {
	public static void main(String[] args) {
		Predicate<String> p = str -> 
			 str.length() > 15;

		boolean b = p.test(" hi hello good morning");
		log.info(""+b);
	}
}
