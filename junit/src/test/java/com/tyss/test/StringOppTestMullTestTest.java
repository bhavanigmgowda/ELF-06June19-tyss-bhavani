package com.tyss.test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.tyss.javaapp.test.StringOpp;

@RunWith(Parameterized.class)
public class StringOppTestMullTestTest {

	private StringOpp s = new StringOpp();
	private String name; 
	private int value;

	public StringOppTestMullTestTest(String name, int value) {
		super();
		this.name = name;
		this.value = value;
	}

	@Parameters
	public static Collection<Object[]> getPairs() {
		Object[][] obj = { { "ball", 4 }, { "apple fruit", 11 }, { "raj ram", 7 } };
		return Arrays.asList(obj);
	}

	@Test
	public void testString() {
		int res = s.count(name);
		assertEquals(value, res);

	}

}
