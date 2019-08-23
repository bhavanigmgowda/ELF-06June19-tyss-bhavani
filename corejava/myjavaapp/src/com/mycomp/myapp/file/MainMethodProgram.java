package com.mycomp.myapp.file;

import com.tyss.filecreationutil.util.CreateFileUtil;

public class MainMethodProgram {
	public static void main(String[] args) {
		CreateFileUtil util=new CreateFileUtil();
		util.createFile("MyAnotherFile.txt", "hello how are you");
		
	}
}
