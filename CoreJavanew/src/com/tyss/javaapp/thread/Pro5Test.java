package com.tyss.javaapp.thread;

public class Pro5Test {
	public static void main(String[] args) {
		Pro5Marker m = new Pro5Marker();
		Thread t1 = new Thread(m);
		t1.start();

		Thread t2 = new Thread(m);
		t2.start();

	}
}
