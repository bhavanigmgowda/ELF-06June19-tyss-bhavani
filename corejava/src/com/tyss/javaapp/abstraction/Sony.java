package com.tyss.javaapp.abstraction;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Sony implements Printer {
	private static final Logger loger = Logger.getLogger("google");

	public void print() {
		loger.log(Level.SEVERE, "it's printer of sony");
	}
}
