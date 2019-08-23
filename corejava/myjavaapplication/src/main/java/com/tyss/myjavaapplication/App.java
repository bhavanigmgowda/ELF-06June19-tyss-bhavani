package com.tyss.myjavaapplication;

import com.tyss.filecreationutilnew.util.CreateFileUtil;

import lombok.extern.java.Log;

/**
 * Hello world!
 *
 */
@Log
public class App {
	public static void main(String[] args) {
		CreateFileUtil fileUtil = new CreateFileUtil();
		fileUtil.createFile("myfile.txt", "hi good morning");
		log.info("done");

	}
}
