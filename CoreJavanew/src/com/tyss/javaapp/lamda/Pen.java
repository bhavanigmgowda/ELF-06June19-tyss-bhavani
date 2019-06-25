package com.tyss.javaapp.lamda;

import lombok.extern.java.Log;

@Log
public class Pen {
	Pen(){
		log.info("pen class constructor");
	}
	void write() {
		log.info("write");
	}
}
