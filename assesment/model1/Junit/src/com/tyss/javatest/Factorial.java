package com.tyss.javatest;

public class Factorial {
	 int fa=1;
	 int fact(int num) {
		
		for(int i=1;i<=num;i++) {
			fa=fa*i;
		}
		return fa;
	}
	
}
