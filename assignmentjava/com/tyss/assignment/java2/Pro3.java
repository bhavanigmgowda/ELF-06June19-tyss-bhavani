package com.tyss.assignment.java2;
/*
 * usecase: odd number that are divisible by 7 from 1 to 100
 */
class Pro3 {
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++)
			if (i % 2 != 0 && i % 7 == 0)
				System.out.println(i);
	}
}