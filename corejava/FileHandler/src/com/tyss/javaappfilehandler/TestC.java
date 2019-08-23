package com.tyss.javaappfilehandler;

import java.io.File;

public class TestC {
	public static void main(String[] args) {
		File f=new File("movies/kannada/new");
	boolean res=f.mkdirs();
	System.out.println(res);
	}
}
