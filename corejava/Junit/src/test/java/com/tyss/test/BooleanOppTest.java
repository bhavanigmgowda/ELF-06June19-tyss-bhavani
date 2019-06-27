package com.tyss.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.tyss.javaapp.test.BooleanOpp;

public class BooleanOppTest {
private BooleanOpp b=new BooleanOpp();
	@Test
	public void testOddEvenForOdd() {
		assertEquals(true, b.odd(7));
	}

}
