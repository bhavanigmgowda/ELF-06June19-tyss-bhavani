package com.tyss.assignment.javaone;

import java.util.logging.Logger;

class ProD {
	private static final Logger log=Logger.getLogger("bhavani");

	public static void main(String[] args) {
		for (int i = 50; i <= 100; i++)
			if (i % 2 == 0 && i % 5 == 0)
				log.info(""+i);
	}
}