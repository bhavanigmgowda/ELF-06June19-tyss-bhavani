package com.tyss.javaapp.array;

public class ArrayDouble {
	public static void main(String[] args) {
		double[] a = { 5.6, 2.1, 1.4, 4.2, 1.3 };
		double temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int i = 0; i < a.length - 1; i++)
			System.out.println(a[i]);
	}
}
