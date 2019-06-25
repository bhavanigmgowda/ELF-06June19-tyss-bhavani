package com.tyss.javaapp.lamda;

import lombok.extern.java.Log;

@Log
public class TestRefer {
	static void open() {
		log.info("***************Open method********");
		log.info("-------->logic to open the door");
		
	}
	public static void main(String[] args) {
		 Room r=TestRefer :: open;
		 r.remove();
	}

}
