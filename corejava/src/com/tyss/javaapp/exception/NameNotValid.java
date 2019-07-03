package com.tyss.javaapp.exception;

public class NameNotValid extends RuntimeException {
	String s="pls enter char  is more 5";
@Override
public String toString() {
	return s;
}
	@Override
	public String getMessage() {

		return s;
	}
}
