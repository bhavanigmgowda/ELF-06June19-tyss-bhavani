package com.tyss.assignment.java5;

import java.util.logging.Logger;

public class ValidNum {
	private static final Logger log=Logger.getLogger("bhavani");

	int s;

	void valid(int s) throws NotValidNum {
		this.s = s;
		if (s > 0) {
			log.info("valid Number");
		} else {
			throw new NotValidNum();
		}
	}

}
