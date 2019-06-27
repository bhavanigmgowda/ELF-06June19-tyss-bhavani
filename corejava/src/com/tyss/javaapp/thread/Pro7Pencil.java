package com.tyss.javaapp.thread;

import java.util.concurrent.Callable;

public class Pro7Pencil implements Callable<Integer>{

	@Override
	public Integer call() throws Exception {

		return 120;
	}
	
}
