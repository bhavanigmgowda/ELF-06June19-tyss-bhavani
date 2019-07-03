package com.tyss.jdbcapp.common;

public class MainClass {
	public static void main(String[] args) {
		Connection ref = MyClass.getInstance(args[0]);
		ref.getConnection();

	}
}
