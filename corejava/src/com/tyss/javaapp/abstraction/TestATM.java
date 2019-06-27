package com.tyss.javaapp.abstraction;

public class TestATM {
	public static void main(String[] args) {
		Mechine m = new Mechine();
		SBI s = new SBI();
		m.slot(s);
	}
}
