package com.tyss.javaassessment;

import lombok.extern.java.Log;

@Log
public class Train {
	public void search(int number) {
		log.info("Train Found by number");
	}

	public void search(String name) {
		log.info("Train Found by name");
	}
}
