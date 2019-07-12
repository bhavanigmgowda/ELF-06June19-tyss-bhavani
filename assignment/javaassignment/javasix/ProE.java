package com.tyss.assignment.javasix;

import java.util.logging.Logger;

/*
 * WAP to print number of given range using lambda fun
 */
public class ProE {
	private static final Logger log=Logger.getLogger("bhavani");

public static void main(String[] args) {
	ProEInt f = (num) -> {
		for (int i = 0; i <= num; i++)
			log.info(""+i);
	};
	 f.rang(5);

}
}
