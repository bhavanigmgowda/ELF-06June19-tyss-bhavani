package com.tyss.javaapp.lamda;

import java.util.logging.Logger;

import lombok.extern.java.Log;

@Log
public class AddTwo {
	private static final Logger log=Logger.getLogger("bhavani");

	public static void main(String[] args) {
		MyMath m= Demo :: add;
		int i=	m.add(5, 6);
		log.info("sum is"+i);
	}

}
