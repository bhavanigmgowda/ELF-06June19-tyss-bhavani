package com.tyss.assignment.java5;

import java.util.logging.Logger;

public class Pro1Count {

private static final Logger log=Logger.getLogger("bhavani");

	static int count;

	public Pro1Count() {
		count++;

	}

	static void getCount() {
		log.info("number of object created= " + count);
	}

}
