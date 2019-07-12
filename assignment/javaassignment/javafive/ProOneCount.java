package com.tyss.assignment.javafive;

import java.util.logging.Logger;

public class ProOneCount {

	private static final Logger log = Logger.getLogger("bhavani");

	static int count;

	public ProOneCount() {
		count++;

	}

	static void getCount() {
		log.info("number of object created= " + count);
	}

}
