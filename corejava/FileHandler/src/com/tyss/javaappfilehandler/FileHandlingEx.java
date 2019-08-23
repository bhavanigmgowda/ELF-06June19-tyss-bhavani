package com.tyss.javaappfilehandler;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;

public class FileHandlingEx {
	public static void main(String[] args) {
		try {
			FileUtils.writeStringToFile(
										new File("myEx1.txt"), 
										"Hello welcome to file",
										Charset.defaultCharset());
		System.out.println("file created..");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
