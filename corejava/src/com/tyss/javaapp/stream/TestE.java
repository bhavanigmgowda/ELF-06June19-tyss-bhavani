package com.tyss.javaapp.stream;

import java.util.stream.Stream;

public class TestE {
public static void main(String[] args) {
		Stream<Integer> s=Stream.of(5,3,2,6,8);
		s.forEach(System.out::println);
	}
}
