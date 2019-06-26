package com.tyss.assignment.javaone;

import java.util.logging.Logger;

class ProC {
	private static final Logger log=Logger.getLogger("bhavani");
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++)
			if (i % 2 != 0 && i % 7 == 0)
				log.info(""+i);
	}
}