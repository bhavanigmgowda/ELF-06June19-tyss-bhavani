package com.tyss.filecreationutil.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.tyss.filecreationutil.util.CreateFileUtil;

public class CreateFileUtilTest {
	private CreateFileUtil cf=new CreateFileUtil();
	@Test
	public void createFileTest() {
		boolean expected=true;
		boolean actual=cf.createFile("myFile.txt", "hi hello ");
		assertEquals(expected, actual);
		
	}
}
