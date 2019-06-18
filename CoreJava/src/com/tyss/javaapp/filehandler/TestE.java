package com.tyss.javaapp.filehandler;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class TestE {
public static void main(String[] args) {
	String msg="ding ding diganna";
	char ch[]=msg.toCharArray();
	try {
		FileWriter fout=new FileWriter("ph.txt",true);
		fout.write(ch);
		fout.flush();
		fout.close();
		System.out.println("data is write into file");
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
}
}
