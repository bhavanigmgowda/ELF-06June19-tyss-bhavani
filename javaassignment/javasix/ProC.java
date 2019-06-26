package com.tyss.assignment.javasix;

import java.util.logging.Logger;

/*
 * WAP to print msg using lambda exp
 */
public class ProC {
	private static final Logger log=Logger.getLogger("bhavani");

	public static void main(String[] args) {
		ProCInt m = () -> {
			log.info("hi this is lambda");
		};
		m.msg();
	}

}
