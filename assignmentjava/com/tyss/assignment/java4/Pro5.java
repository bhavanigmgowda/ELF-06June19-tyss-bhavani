package com.tyss.assignment.java4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Logger;

/*
 * WAP to read data from the csv
 */
public class Pro5 {

private static final Logger log=Logger.getLogger("bhavani");

public static void main(String[] args) {
		InputStream in=null;

		File f1=new File("srcfile.csv");
		

				try {
					in=new FileInputStream(f1);
					int i;
					while((i = in.read()) !=-1)
					{
						log.info(""+(char)i);
					}
					if(in!=null)
						in.close();
					
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

}
}