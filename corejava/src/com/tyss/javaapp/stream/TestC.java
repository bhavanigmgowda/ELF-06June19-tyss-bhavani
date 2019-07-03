package com.tyss.javaapp.stream;

import java.util.stream.Stream;

import lombok.extern.java.Log;

@Log
public class TestC {
	public static void main(String[] args) {
		Integer[] a= {5,3,2,6,8};
		Stream<Integer> s=Stream.of(a);
		s.forEach(i->log.info(""+i));
	}
}
