package com.tyss.javaappfilehandler;

import java.io.File;
import java.io.IOException;

public class TestA {
public static void main(String[] args) {
	File f=new File("D://bh.txt");
	try {
		boolean res=f.createNewFile();
		System.out.println("result is "+res);
		System.out.println("done");
	} catch (IOException e) {
		e.printStackTrace();
	}
}
}
