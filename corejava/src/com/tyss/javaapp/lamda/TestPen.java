package com.tyss.javaapp.lamda;

public class TestPen {
	public static void main(String[] args) {
		PenFactory f= Pen:: new;
		
				f.getPen();
				
	}
}
