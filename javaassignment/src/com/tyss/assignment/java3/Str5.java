package com.cov.javaapp.Assignments;

public class Str5 {

	public static void main(String[] args) {
		String s = "go goa gone";
		String[] s1 = s.split(" ");
		for (int j = 0; j <= s1.length - 1; j++) {
			if (j % 2 == 0) {
				char[] ch = s1[j].toCharArray();
				for (int i = ch.length - 1; i >= 0; i--) {
					System.out.print(ch[i]);
				}
				System.out.print(" ");

				
			} else {
				
				System.out.print(s1[j]);
				System.out.print(" ");

			}
		}
	}


	}


