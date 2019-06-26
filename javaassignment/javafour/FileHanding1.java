package com.tyss.assignment.javafour;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileHanding1 {

	public static void main(String[] args) {
		File file=new File("emp");
		try {
			FileWriter ofile=new FileWriter(file);
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
	}
}


//wap to store 5 stdnt into file and read only the stdnt who got more than 80%
//wap to append the content of file1 to content of file2