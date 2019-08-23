package com.tyss.springcore.bean;

import lombok.extern.java.Log;

@Log
public class Monkey implements Animal {

	public void eat() {
		log.info("eating banana");
	}

	public void sound() {
		log.info("monkey making sound");
	}

}
