package com.tyss.assignment.javafive;

public class NotValidAge extends RuntimeException {
	String s="Age must be greater than 18";
	@Override
	public String toString() {
		return s;
	}
		@Override
		public String getMessage() {

			return s;
		}


}
