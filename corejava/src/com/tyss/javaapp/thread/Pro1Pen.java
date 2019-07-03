package com.tyss.javaapp.thread;

import lombok.extern.java.Log;

@Log
public class Pro1Pen extends Thread {
	@Override	
	public void run() {
			for(int i=0;i<=5;i++) {

				log.info(" getName()"+i);
				try {
					sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
}
