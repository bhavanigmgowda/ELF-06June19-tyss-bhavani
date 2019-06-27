package com.tyss.javaapp.lamda;

import lombok.extern.java.Log;

@Log
public class Demo {
	static int add(int a, int b) {
		int sum = a + b;
		log.info("add=" + sum);
		return sum;
	}
}
