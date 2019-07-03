package com.tyss.javaassesment;

import lombok.extern.java.Log;

@Log
public class PrintNumber extends Thread {
	public void run() {
		for(int i=1;i<=10;i++) {
			log.info(""+i);
		}
	}
	

}
