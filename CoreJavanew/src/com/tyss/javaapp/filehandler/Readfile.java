package com.tyss.javaapp.filehandler;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Readfile {
	public static void main(String[] args) {
		try {
			String fileData=FileUtils.readFileToString(new File("myEx.txt") );
		System.out.println("file data is :- "+fileData);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
