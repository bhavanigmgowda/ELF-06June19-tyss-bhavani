package com.tyss.javaapp.stringclass;

public class Testmarker {
public static void main(String[] args) {
	MarkerSingleton a= MarkerSingleton.getmarker();

	MarkerSingleton b= MarkerSingleton.getmarker();
	
	System.out.println(a);
	System.out.println(b);
}
}
