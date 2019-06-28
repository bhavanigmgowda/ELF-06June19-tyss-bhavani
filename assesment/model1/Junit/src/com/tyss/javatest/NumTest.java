package com.tyss.javatest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
/**
 * 
 *WAP to calculate simple interest, percentage, factorial and write the unit test case.
 */
class TestNum {
	private SimpleInterest s1 = new SimpleInterest();
	private Percentage s2 = new Percentage();
	private Factorial s3 = new Factorial();

	@Test
	public void testSimpleInterest() {
		double expected = 1.250;
		double actual = s1.interest(5, 5, 5);
		assertEquals(expected, actual);
	}

	@Test
	public void testPercentage() {
		double expected = 50;
		double actual = s2.per(50, 50, 50);
		assertEquals(expected, actual);
	}

	@Test
	public void testFactorial() {
		double expected = 120;
		double actual = s3.fact(5);
		assertEquals(expected, actual);
	}

}
