package com.tyss.springcore.bean;

import lombok.extern.java.Log;

@Log
public class Donkey implements Animal {

	public void eat() {
		log.info("eating paper");
	}

	public void sound() {
		log.info("Donkey making sound");
	}

}
