package com.tyss.javaapp.array;

import java.util.logging.Logger;

public class Stringarray {
	private static final Logger loger = Logger.getLogger("array");

	public static void main(String[] args) {
		String[] d = new String[4];
		d[0] = "bhavani";
		d[1] = "anjali";
		d[2] = "sahana";
		d[3] = "rashmi";
		for (int i = 0; i < d.length; i++) {
			loger.severe(" " + d[i]);
		}
		loger.severe(" " + d.length);
	}
}
