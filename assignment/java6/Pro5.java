package com.tyss.assignment.java6;

import java.util.logging.Logger;

/*
 * WAP to print number of given range using lambda fun
 */
public class Pro5 {
	private static final Logger log=Logger.getLogger("bhavani");

public static void main(String[] args) {
	Pro5Int f = (num) -> {
		for (int i = 0; i <= num; i++)
			log.info(""+i);
	};
	 f.rang(5);

}
}
