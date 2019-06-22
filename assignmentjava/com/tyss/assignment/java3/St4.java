package com.cov.javaapp.Assignments;

import java.util.Scanner;

class WordRev{
	void rcv(String[] s) {
		for(int i=0;i<=s.length-1;i++){
			char[] ch=s[i].toCharArray();
			for(int j=ch.length-1;j>=0;j--){
				System.out.print(ch[j]);
			}
			System.out.print(" ");
		}
	}
}
public class St4 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a sentence");
		String s1=s.nextLine();
		String[] str=s1.split(" ");
		WordRev wr=new WordRev();
		wr.rcv(str);
		s.close();
		
	}

}
