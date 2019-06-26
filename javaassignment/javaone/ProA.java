package com.tyss.assignment.javaone;

import java.util.logging.Logger;

class ProA {
	private static final Logger log=Logger.getLogger("bhavani");

	public static void main(String[] args) {
		for (int i = 5; i > 0; i--)
			log.info(""+i);
	}
}