package com.tyss.javaapp.array;

import java.util.logging.Logger;

public class Chararray {
	private static final Logger loger = Logger.getLogger("array");

	public static void main(String[] args) {
		char[] d = { 'b', 'h', 'a', 'v', 'a', 'n', 'i' };

		for (int i = 0; i < d.length; i++) {
			loger.severe(" value of " + d[i]);
		}
		loger.severe("" + d.length);
	}
}
