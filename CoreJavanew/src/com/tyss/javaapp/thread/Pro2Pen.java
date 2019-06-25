package com.tyss.javaapp.thread;

import lombok.extern.java.Log;

@Log
public class Pro2Pen extends Thread {
	@Override
	public void run() {
		String s=getName();
		log.info(" "+s);
	}

}
