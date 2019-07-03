package com.tyss.javaapp.stream;

import java.util.stream.Stream;

import lombok.extern.java.Log;
@Log
public class TestD {
	public static void main(String[] args) {
		
		Stream<Integer> s=Stream.of(5,3,2,6,8);
		s.forEach(i->log.info(""+i));
	}
}
