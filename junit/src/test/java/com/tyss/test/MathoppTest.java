package com.tyss.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.tyss.javaapp.test.MathOpp;

public class MathoppTest {
	MathOpp m=new MathOpp();
	
	@Test
	public void testAddMethod() { 
		assertEquals(70, m.add(10, 60));
		
	}
	 
	@Test
	public void testDivMethod() {
		assertEquals(6, m.div(60, 10));
	}
	
	@Test(expected=ArithmeticException.class) 
	public void testDivFor() {
		m.div(10, 0);
	}
}
