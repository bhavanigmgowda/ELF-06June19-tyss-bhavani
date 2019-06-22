package com.tyss.javaapp.array;

import java.util.logging.Logger;

public class Revarray {
	private static final Logger loger = Logger.getLogger("array");

	public static void main(String[] args) {
		char[] d = { 'b', 'h', 'a', 'v', 'a', 'n', 'i' };

		for (int i = d.length - 1; i >= 0; i--) {
			loger.severe(" " + d[i]);
		}
		loger.severe(" " + d.length);
	}
}
