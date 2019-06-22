package com.cov.javaapp.Assignments;

import java.util.Scanner;

public class Str1 {

	public static void main(String[] args) {
		String str;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a string : ");
		str = s.nextLine();
		System.out.println("Reverse of a String '" + str + "' is  :");
		{
			for (int j = str.length(); j > 0; j--) {
				System.out.print(str.charAt(j - 1));
			}
			s.close();
		}
	}
}