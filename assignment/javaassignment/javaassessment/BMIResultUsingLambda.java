package com.tyss.javaassessment;
/*18)	WAP to return the result of the BMI based on the BMI value, using lambda expression*/
import java.util.function.Function;

import lombok.extern.java.Log;
@Log
public class BMIResultUsingLambda {
	public static void main(String[] args) {
		Function<Double, String> f= a->{
			if(a <18.5) {
				return "Underweight";
			}else if(a == 18.5) {
				return "Normal";
			}
			return "Overweight";
		};
		
		log.info("BMI is: "+f.apply(19.00));
	}
}
