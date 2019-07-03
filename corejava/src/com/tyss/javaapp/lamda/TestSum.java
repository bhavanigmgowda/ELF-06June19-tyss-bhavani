package com.tyss.javaapp.lamda;

public class TestSum {
	static Sum s=(a,b)-> a+b;
	
	static Fact f = (num) -> {
		int fa=0;
		for (int i = 1; i <= num; i++)
			fa = i*i+1;
		return fa;
	};
	
	static Stringcount s1 = (str)->
	{
		return str.length();
	};
	
	static Squre sq=(sqr)->
	{
		return sqr*sqr;
	};
	
	public static void main(String[] args) {
		int i=s.add(5,10);
		System.out.println("addtion= "+i);
		int fa=f.fact(5);
		System.out.println(fa);
		int len=s1.lengthCount("bhavani");
		System.out.println(len);
		int s=sq.sqr(10);
		System.out.println(s);
		
	}
}
