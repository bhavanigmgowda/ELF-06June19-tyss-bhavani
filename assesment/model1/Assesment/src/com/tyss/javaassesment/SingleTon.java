package com.tyss.javaassesment;

public class SingleTon {
	private static SingleTon s = new SingleTon();

	private SingleTon() {

	}

	public static SingleTon get() {
		return s;
	}

}
