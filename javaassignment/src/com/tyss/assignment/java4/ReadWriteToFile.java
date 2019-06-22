package com.tyss.assignment.java4;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWriteToFile {
	public static void main(String[] args) {
		String msg="ding ding diganna";
		char ch[]=msg.toCharArray();
		try {
			FileWriter fout=new FileWriter("srcfile.csv",true);
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
