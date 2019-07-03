package com.tyss.javaassesment;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/**
 * WAP to print the numbers from 1 to 10 using 5 threads, with the thread pool size of 2.
 *
 */
public class TestThread {
	public static void main(String[] args) {
		PrintNumber p1=new PrintNumber();
		PrintNumber p2=new PrintNumber();
		PrintNumber p3=new PrintNumber();
		PrintNumber p4=new PrintNumber();
		PrintNumber p5=new PrintNumber();
		
		ExecutorService s= Executors.newFixedThreadPool(2);
		s.execute(p1);
		s.execute(p2);
		s.execute(p3);
		s.execute(p4);
		s.execute(p5);

		s.shutdown();
		
		
		
		
		

	}

}
