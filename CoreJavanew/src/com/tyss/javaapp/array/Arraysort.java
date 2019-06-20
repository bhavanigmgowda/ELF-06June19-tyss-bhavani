package com.tyss.javaapp.array;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Arraysort {
	public static void main(String[] args) {
		Integer[] a = { 5, 2, 1, 4, 3 };
		String str[]= {"abc","fgh","asd","bcd"};
		Arrays.sort(str,Collections.reverseOrder());
		for (int i = 0; i < str.length ; i++)
			System.out.println(str[i]);
	}
}