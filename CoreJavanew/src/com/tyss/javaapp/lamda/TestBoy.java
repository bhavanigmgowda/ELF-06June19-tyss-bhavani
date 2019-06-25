package com.tyss.javaapp.lamda;

import lombok.extern.java.Log;

@Log
public class TestBoy {
	public static void main(String[] args) {
		MyBoy b= Boy :: new;
		Boy b1=b.getBoy("barath", 5.4, 20);
		log.info("name"+b1.name+"height="+b1.height+"age="+b1.age);
	}

}
