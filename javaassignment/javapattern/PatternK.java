package com.tyss.assignment.javapattern;

class PatternK {
	public static void main(String[] args) {
		int n = 5;
		for (int i = 0; i < n; i++) {
			for (int s = 0; s < n - 1 - i; s++) {
				System.out.print("  ");
			}
			for (int j = 0; i * 2 >= j; j++) {
				if (j == 0 || j >= 2 * i || i == n - 1 || j == i)
					System.out.print("* ");
				else {
					System.out.print("  ");
				}
			}
			System.out.println();

		}
		for (int i = n - 2; i >= 0; i--) {
			for (int s = 0; s < n - 1 - i; s++) {
				System.out.print("  ");
			}
			for (int j = 0; i * 2 >= j; j++) {
				if (j == 0 || j >= 2 * i || i == j)
					System.out.print("* ");
				else {
					System.out.print("  ");
				}
			}
			System.out.println();

		}
	}
}