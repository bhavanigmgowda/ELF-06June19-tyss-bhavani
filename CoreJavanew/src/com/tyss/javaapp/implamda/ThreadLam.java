package com.tyss.javaapp.implamda;

import java.util.logging.Logger;

import lombok.extern.java.Log;

@Log
public class ThreadLam {
	private static final Logger log=Logger.getLogger("bhavani");
	public static void main(String[] args) {
	
		Runnable x=()->{
			for(int i=0;i<5;i++) {
				log.info(""+i);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		Thread t1=new Thread(x);
		t1.start();
	}
}
