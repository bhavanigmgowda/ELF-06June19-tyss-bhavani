package com.tyss.javaapp.log;

import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Testanimal {
	private static final Logger loger = Logger.getLogger("Animallog");

	public static void main(String[] args) {
		LogManager.getLogManager().reset();
		loger.setLevel(Level.SEVERE);

		try {
			FileHandler fh = new FileHandler("myFevLog.log", true);

			fh.setLevel(Level.ALL);
			fh.setFormatter(new SimpleFormatter());
			loger.addHandler(fh);
			Cow c = new Cow();
			c.sound();
			c.div(40, 10);
			Lion l = new Lion();
			l.sound();
			l.div(20, 10);
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

}
