package com.tyss.javaapp.array;

import java.util.Arrays;

public class CopyArray {
	public static void main(String[] args) {
		int a[] = { 1, 8, 3,6,9,3 };
		int b[] = Arrays.copyOfRange(a, 2, 5);
	
	
		System.out.println("Contents of a[] ");
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println("\n\nContents of b[] ");
		for (int i = 0; i < b.length; i++)
			System.out.print(b[i] + " ");
	}

}
