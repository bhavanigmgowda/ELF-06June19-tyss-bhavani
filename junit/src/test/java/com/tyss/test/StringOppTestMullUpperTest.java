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
public class StringOppTestMullUpperTest {
	private String name1;
	private String name2;
	private StringOpp s = new StringOpp();

	
	public StringOppTestMullUpperTest(String name1, String name2) {
		super();
		this.name1 = name1;
		this.name2 = name2;
	}
	@Parameters
	public static Collection<Object[]> getPairs() {
		Object[][] obj = { { "ball", "BALL" }, { "apple fruit", "APPLE FRUIT" }, { "raj ram", "RAJ RAM" } };
		return Arrays.asList(obj);
	}


	@Test
	public void test() {
		String res=s.upperCaseString(name1);
	}

}
