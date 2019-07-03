package com.tyss.javaassesment;

import lombok.extern.java.Log;

@Log
public class Bingo extends Cheps {
	@Override
	void eat() {
		log.info("eating bingo");
	}
}
