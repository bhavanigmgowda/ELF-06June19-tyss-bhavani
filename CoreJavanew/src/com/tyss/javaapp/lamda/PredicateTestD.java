package com.tyss.javaapp.lamda;

import java.util.function.Predicate;

import lombok.extern.java.Log;
@Log
public class PredicateTestD {
	public static void main(String[] args) {
		int[] a = { 2, 4, 6, 7, 9 };
		Predicate<Integer> p  = (ar) -> ar > 4 ;

		for (int i = 0; i < a.length; i++) {
			boolean x = p.test(a[i]);
			if (x) {
				log.info(""+a[i]);
			}
		}

	}

}
