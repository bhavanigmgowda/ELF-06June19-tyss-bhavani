package com.tyss.javaapp.abstraction;

import java.util.logging.Level;
import java.util.logging.Logger;

abstract class Pen extends Pencli {
	private static final Logger loger = Logger.getLogger("google");

	void write() {
		loger.log(Level.SEVERE, "pen class of write()");
	}

}

class Marker extends Pen {
	private static final Logger loger = Logger.getLogger("google");

	void color() {
		loger.log(Level.SEVERE, "marker color()");
	}
}
