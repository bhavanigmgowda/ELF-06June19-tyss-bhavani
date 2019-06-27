package com.tyss.javaapp.filehandler;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestG {
	public static void main(String[] args) {
		try {
			FileReader fin=new FileReader("poem.txt");
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
