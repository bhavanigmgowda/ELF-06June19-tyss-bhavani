package com.tyss.javaapp.lamda;

import java.util.function.Function;

import lombok.extern.java.Log;
@Log
public class FunctionTestB {
		public static void main(String[] args) {
			Function<String, Integer> f= s -> s.length();
			
			Integer x=f.apply("bhavani");
			log.info(""+x);
		}
	
}

