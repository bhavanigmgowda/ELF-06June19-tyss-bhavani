package com.tyss.assignment.java6;

/*
 * WAP to calculate sqrt of given number 
 */
public class Pro4 {
	public static void main(String[] args) {
		Pro4Int s = (sqr) -> {
			return sqr * sqr;
		};
		int sqr = s.sqrt(5);
		System.out.println(sqr);

	}

}
