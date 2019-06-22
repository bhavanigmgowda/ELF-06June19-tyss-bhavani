package com.tyss.javaapp.abstraction;

import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class Honda {
	private static final Logger loger = Logger.getLogger("google");

	void engin() {
		loger.log(Level.SEVERE, "engin");
	}

	abstract void design();
}
