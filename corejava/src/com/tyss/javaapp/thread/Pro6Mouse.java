package com.tyss.javaapp.thread;

import lombok.extern.java.Log;

@Log
public class Pro6Mouse implements Runnable {
	String name;
	public Pro6Mouse(String name) {
		this.name=name;
	}
	@Override
	public void run() {
		log.info(name+" started");
		for(int i=0;i<5;i++) {
			log.info(""+i);
		
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		log.info(name+" ended");
	}
	
	
}
