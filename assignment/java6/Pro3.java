package com.tyss.assignment.java6;

import java.util.logging.Logger;

/*
 * WAP to print msg using lambda exp
 */
public class Pro3 {
	private static final Logger log=Logger.getLogger("bhavani");

	public static void main(String[] args) {
		Pro3Int m = () -> {
			log.info("hi this is lambda");
		};
		m.msg();
	}

}
