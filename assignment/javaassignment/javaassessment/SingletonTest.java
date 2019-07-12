package com.tyss.javaassessment;

import lombok.extern.java.Log;

@Log
public class SingletonTest {
	public static void main(String[] args) {
		Singleton x = Singleton.getInstance();

		Singleton y = Singleton.getInstance();

		Singleton z = Singleton.getInstance();

		log.info("X string" + x.s);
		log.info("Y string" + y.s);
		log.info("Z string" + z.s);

	}
}
