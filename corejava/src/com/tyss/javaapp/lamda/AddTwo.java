package com.tyss.javaapp.lamda;

import lombok.extern.java.Log;

@Log
public class AddTwo {
	
	public static void main(String[] args) {
		MyMath m= Demo :: add;
		int i=	m.add(5, 6);
		log.info("sum is"+i);
	}

}
