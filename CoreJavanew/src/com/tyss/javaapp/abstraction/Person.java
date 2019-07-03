package com.tyss.javaapp.abstraction;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Person implements Animal, Human {
	private static final Logger loger = Logger.getLogger("google");
 
	public void eat() {
		loger.log(Level.SEVERE, "eating food");
	}

	public void walk() {
		loger.log(Level.SEVERE, "walking");
	}

}
