package com.tyss.designpattern.builder;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter 
@AllArgsConstructor
final public class MyImmutableClass {
	final private String name;
	final private int age;
	final private long phone;
	
}
