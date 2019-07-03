package com.tyss.javaapp.array;

import java.util.logging.Logger;

public class Doublearray {
	private static final Logger loger = Logger.getLogger("array");

	public static void main(String[] args) {
		double[] d = new double[4];
		d[0] = 10.7;
		d[1] = 14.67;
		d[2] = 18.7;
		d[3] = 16.97;
		for (int i = 0; i < d.length; i++) {
			loger.severe(" " + d[i]);
		}
	}

}
