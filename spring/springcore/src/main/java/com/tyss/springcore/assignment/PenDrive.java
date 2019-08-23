package com.tyss.springcore.assignment;

import lombok.extern.java.Log;

@Log
public class PenDrive implements StorageDevice {
	void capcity() {
		log.info("PenDrive capcity is 1TB ");
	}
	void writingSpeed() {
		log.info("writingSpeed is 3.5 ");
	}
	
	void readingSpeed() {
		log.info("readingSpeed is 3.5 ");

	}

	public void write() {
		log.info("writing ");
	
	}

	public void read() {
		log.info("reading ");
		
	}

	public void format() {
		log.info("formating ");
		
	}
}