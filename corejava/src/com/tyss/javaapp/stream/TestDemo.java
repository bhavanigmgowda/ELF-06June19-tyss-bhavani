package com.tyss.javaapp.stream;

import lombok.extern.java.Log;

@Log
public class TestDemo {
	public static void main(String[] args) {
		Demo a = x -> log.info("" + x);
		a.print(23);
		Pen p = new Pen();
		Demo b = p::write;
		b.print(10);
	}

}
