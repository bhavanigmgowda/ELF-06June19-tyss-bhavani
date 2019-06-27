package com.tyss.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.tyss.javaapp.test.StringOpp;

public class StringOppTest {
private StringOpp s=new StringOpp();
	@Test
	public void countTest() {
		int expected=7;
		int actual=s.count("bhavani");
		assertEquals(expected, actual);
	} 
	@Test(expected=NullPointerException.class)
	public void testCountCharInStringException() {
		s.count(null);
	}

}
