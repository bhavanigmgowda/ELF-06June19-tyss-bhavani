package com.tyss.javaapp.thread;

public class TestPvr {
	public static void main(String[] args) {
		Pro3Pvr p = new Pro3Pvr();
		Browser t1 = new Browser(p);
		t1.start();
	
		Browser t2=new Browser(p);
		t2.start();
		Browser t3=new Browser(p);
		t3.start();
		/*
		 * try { Thread.sleep(2000); } catch (InterruptedException e) {
		 * e.printStackTrace(); }
		 */
		p.leaveme();
	}
}
