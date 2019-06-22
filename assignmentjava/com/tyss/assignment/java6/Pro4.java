package com.tyss.assignment.java6;

import java.util.logging.Logger;

/*
 * WAP to calculate sqrt of given number 
 */
public class Pro4 {
	private static final Logger log=Logger.getLogger("bhavani");

	public static void main(String[] args) {
		Pro4Int s = (sqr) -> {
			return sqr * sqr;
		};
		int sqr = s.sqrt(5);
		log.info(""+sqr);

	}

}
