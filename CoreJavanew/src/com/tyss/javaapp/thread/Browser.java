package com.tyss.javaapp.thread;

public class Browser extends Thread {
	Pro3Pvr ref;
	public Browser(Pro3Pvr ref) {
		this.ref=ref;
	}
	public void run() {
		ref.book();
	}
}
