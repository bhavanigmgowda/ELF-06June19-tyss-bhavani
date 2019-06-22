package com.tyss.assignment.java6;
/*
 * WAP to print number of given range using lambda fun
 */
public class Pro5 {
public static void main(String[] args) {
	Pro5Int f = (num) -> {
		for (int i = 0; i <= num; i++)
			System.out.println(i);
	};
	 f.rang(5);

}
}
