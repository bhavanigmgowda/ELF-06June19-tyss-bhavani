package com.tyss.javaapp.lamda;

import java.util.function.Function;

import lombok.extern.java.Log;
@Log
public class FunctionTestA {
	public static void main(String[] args) {
		Function<Double, Double> f=r-> 3.142*r*r;
		
		double x=f.apply(5.3);
		log.info(""+x);
	}

}
