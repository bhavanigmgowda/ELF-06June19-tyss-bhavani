package com.tyss.javaapp.lamda;

import lombok.extern.java.Log;

@Log
public class TestFact {
	public static void main(String[] args) {

		Pro1MyStd p = new Pro1MyStd();
		FactInt f = p::fact;
		int i = f.getFact(5);
		log.info("fact=" + i);
	}

}
