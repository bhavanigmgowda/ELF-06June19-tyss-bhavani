package com.tyss.javaapp.lamda;

public class TestAvg {
	public static void main(String[] args) {
		Pro1MyStd m=new Pro1MyStd();
		
		Avg a=m::cal;
		a.avg(10, 50, 70);
	}
}
