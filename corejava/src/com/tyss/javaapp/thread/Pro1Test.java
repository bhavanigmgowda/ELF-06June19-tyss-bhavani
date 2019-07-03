package com.tyss.javaapp.thread;

import lombok.extern.java.Log;

@Log
public class Pro1Test {
	public static void main(String[] args) {
		log.info("main() started");
		Pro1Pen t1 = new Pro1Pen();
		t1.start();
		Pro1Pen t2 = new Pro1Pen();
		t2.start();

		Pro1Pen t3 = new Pro1Pen();
		t3.start();
		log.info("main() ended"); 
	}
}
