package com.tyss.javaassessment;

import lombok.extern.java.Log;

@Log
public class ImmutableClassTest {

	public static void main(String[] args) {
		ImmutableClass c = new ImmutableClass("Immutable class");
		log.info("Instance address" + c);
		c = new ImmutableClass("Hi");
		log.info("Instance address" + c);
	}

}
