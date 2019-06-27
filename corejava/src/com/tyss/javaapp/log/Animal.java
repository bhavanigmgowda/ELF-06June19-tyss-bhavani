package com.tyss.javaapp.log;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Animal {
	private static final Logger loger = Logger.getLogger("Bhavani");

	void sound() {
		loger.log(Level.SEVERE, "sound() is called");
		System.out.println("animal sound");
	}

	void div(int a, int b) {
		loger.log(Level.SEVERE, "div()  is called");
		double c = a / b;
		System.out.println(c);
	}

}
