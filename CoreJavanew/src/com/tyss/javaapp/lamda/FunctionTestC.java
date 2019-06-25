package com.tyss.javaapp.lamda;

import java.util.function.Function;

import lombok.extern.java.Log;
@Log
public class FunctionTestC {
	public static void main(String[] args) {
		Function<Integer, Integer> f = s -> s*s;

		Integer x = f.apply(5);
		log.info("" + x);
	}

}
