package com.tyss.javaapp.filehandler;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestB {
public static void main(String[] args) {
	String msg="hi all good evening";
	byte b[]=msg.getBytes();
	try {
		FileOutputStream fout=new FileOutputStream("myfile.txt");
		fout.write(b);
		fout.close();
		System.out.println("data is write into file");
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
}
}
