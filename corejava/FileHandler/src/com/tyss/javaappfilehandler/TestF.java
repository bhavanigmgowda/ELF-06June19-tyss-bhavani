package com.tyss.javaappfilehandler;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestF {
public static void main(String[] args) {
	try {
		FileInputStream fin=new FileInputStream("poem.txt");
		int i;
		while((i = fin.read()) !=-1)
		{
			System.out.print((char)i);
		}
		fin.close();
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	
}
}
