package com.tyss.javaapp.exception;

public class Book {
	void open()
	{
		String s=null;
		try {
			System.out.println(10/4);
			System.out.println(s.length());
			
		}
		catch (ArithmeticException e) {
System.out.println("number shoud not div by 0");


		}
		catch (NullPointerException n) {
System.out.println("null shoud not used");
		}
	}

	}


