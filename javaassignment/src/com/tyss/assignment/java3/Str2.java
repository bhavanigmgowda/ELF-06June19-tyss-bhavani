package com.cov.javaapp.Assignments;

public class Str2 {

	public static void main(String[] args) {
		String str="hi my dear friends";
		String s[]=str.split(" ");
		for(int i=0;i<s.length;i++){
			System.out.print(s[i]+s[i].length()+" ");
		}
	}

}
