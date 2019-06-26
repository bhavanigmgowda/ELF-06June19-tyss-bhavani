package com.tyss.assignment.javasix;

import java.util.logging.Logger;

/*
 * WAP to calculate sqrt of given number 
 */
public class ProD {
	private static final Logger log=Logger.getLogger("bhavani");

	public static void main(String[] args) {
		ProDInt s = (sqr) -> {
			return sqr * sqr;
		};
		int sqr = s.sqrt(5);
		log.info(""+sqr);

	}

}
