 package com.tyss.springcore.assignment;

import lombok.extern.java.Log;

@Log
public class HardDisk implements StorageDevice {
	void capcity() {
		log.info("HardDisk capcity is 1TB ");
	}
	void writingSpeed() {
		log.info("writingSpeed is 3.5 ");
	}
	
	void readingSpeed() {
		log.info("readingSpeed is 3.5 ");

	}

	public void write() {
		 writingSpeed();
		log.info("writing ");
	
	}

	public void read() {
		readingSpeed();
		log.info("reading ");
		
	}

	public void format() {
		capcity();
		log.info("formating ");
		
	}
	
}