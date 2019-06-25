package com.tyss.javaapp.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

import lombok.extern.java.Log;
@Log
public class Pro7Callable {
	public static void main(String[] args) {
		Pro7Pencil p=new Pro7Pencil();
		
		FutureTask<Integer> ft =new FutureTask<Integer>(p);
		Thread t1=new Thread(ft);
		t1.start();
		
		try {
			int i=ft.get();
			log.info(""+i);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
		
	}
}
