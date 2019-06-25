package com.tyss.javaapp.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test6 {
	public static void main(String[] args) {
		Pro6Mouse t1=new Pro6Mouse("first");
		Pro6Mouse t2=new Pro6Mouse("second");
		Pro6Mouse t3=new Pro6Mouse("third");
		Pro6Mouse t4=new Pro6Mouse("fouth");
		Pro6Mouse t5=new Pro6Mouse("fifth");
		
		ExecutorService s= Executors.newFixedThreadPool(2);
		s.execute(t1);
		s.execute(t2);
		s.execute(t3);
		s.execute(t4);
		s.execute(t5);

		s.shutdown();
	}

}
