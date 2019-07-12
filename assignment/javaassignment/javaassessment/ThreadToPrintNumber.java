package com.tyss.javaassessment;

import lombok.extern.java.Log;

@Log
public class ThreadToPrintNumber implements Runnable{
	String name;

	public ThreadToPrintNumber(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		log.info(name + "started");
		for (int i = 1; i <= 10; i++) {
			log.info("" + i);
		}
		log.info(name + "Completed");
	}
}
