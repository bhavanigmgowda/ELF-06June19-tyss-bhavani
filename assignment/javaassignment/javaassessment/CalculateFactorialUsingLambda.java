package com.tyss.javaassessment;

import java.util.function.Function;
import java.util.logging.Logger;

import lombok.extern.java.Log;
@Log
public class CalculateFactorialUsingLambda {
	public static void main(String[] args) {
		Function<Integer, Integer> f = i->{
			if(i==0) {
				return 1;
			}else {
				int fact=1;
				for(int j=1;j<=i;j++) {
					fact=fact*j;
				}
				return fact;
			}
		};
		
		int number=5;
		int res=f.apply(number);
		log.info("Factorial is:"+res);
	}

}
