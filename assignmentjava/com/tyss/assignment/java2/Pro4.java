package com.tyss.assignment.java2;
/*
 * usecase: this program will give the even number
 */
class Pro4 {
	public static void main(String[] args) {
		for (int i = 50; i <= 100; i++)
			if (i % 2 == 0 && i % 5 == 0)
				System.out.println(i);
	}
}