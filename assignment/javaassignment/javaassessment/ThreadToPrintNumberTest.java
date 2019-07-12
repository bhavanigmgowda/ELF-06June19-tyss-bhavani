package com.tyss.javaassessment;
/*26)	WAP to print the numbers from 1 to 10 using 5 threads, with the thread pool size of 2.*/
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class ThreadToPrintNumberTest {
	public static void main(String[] args) {
		ThreadToPrintNumber m1 = new ThreadToPrintNumber("First");
		ThreadToPrintNumber m2 = new ThreadToPrintNumber("Second");
		ThreadToPrintNumber m3 = new ThreadToPrintNumber("Third");
		ThreadToPrintNumber m4 = new ThreadToPrintNumber("Fourth");
		ThreadToPrintNumber m5 = new ThreadToPrintNumber("Fifth");

		ExecutorService service = Executors.newFixedThreadPool(2);
		service.execute(m1);
		service.execute(m2);
		service.execute(m3);
		service.execute(m4);
		service.execute(m5);

		service.shutdown();
	}
}
