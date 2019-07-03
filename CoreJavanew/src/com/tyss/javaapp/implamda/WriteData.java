package com.tyss.javaapp.implamda;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Logger;

import lombok.extern.java.Log;

@Log
public class WriteData {
	private static final Logger log=Logger.getLogger("bhavani");

	public static void main(String[] args) {
		String msg = "hi ";
		byte b[] = msg.getBytes();
		
		try(FileOutputStream fout = new FileOutputStream("myfile.txt");) {  //try resource
			fout.write(b);
			log.info("data is write into file");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
