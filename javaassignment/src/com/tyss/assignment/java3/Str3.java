package com.cov.javaapp.Assignments;

import java.util.Scanner;

public class Str3 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("ENter a sentence: ");
		String s =scan.nextLine();
		String[] st = s.split(" ");
		String temp="";
		String temp1="";
		for (int i = 0; i <= st.length - 1; i++) {
			if (i % 2 == 0) {
				if (i == 0) {
					temp=st[i];
					st[i] = st[st.length - 1];
					st[st.length - 1] = temp;
					System.out.print(st[i]);
					System.out.print(" ");

				}
				if (i > 0) {
					temp1=st[i];
					st[i] = temp;
					temp= temp1;
					System.out.print(st[i]);
					System.out.print(" ");
				}

			} else {
				System.out.print(st[i]);
				System.out.print(" ");

			}
	}
	}
}
