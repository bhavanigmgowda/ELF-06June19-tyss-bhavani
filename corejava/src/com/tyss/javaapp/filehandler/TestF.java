package com.tyss.javaapp.filehandler;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestF {
public static void main(String[] args) {
	String msg="ding ding diganna";
	char ch[]=msg.toCharArray();
	try {
		FileWriter fout=new FileWriter("poem.txt");
		fout.write(ch);
		fout.flush();
		fout.close();
		System.out.println("data is write into file");
		FileInputStream fin=new FileInputStream("poem.txt");
		FileReader fin1=new FileReader("poem.txt");
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
