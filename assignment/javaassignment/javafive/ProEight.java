package com.tyss.assignment.javafive;
/*
 * WAP to store student WRT role (using Map<string,arraylist<student>>)
 */

import java.util.logging.Logger;

public class ProEight {

private static final Logger log=Logger.getLogger("bhavani");

	public static void main(String[] args) {
		ValidAge v = new ValidAge();
		try {
			v.valid(18);
		} catch (NotValidAge e) {

			log.info(" "+e);
		}
	}
}
