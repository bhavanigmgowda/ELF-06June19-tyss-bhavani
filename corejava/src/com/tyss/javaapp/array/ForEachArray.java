package com.tyss.javaapp.array;
import lombok.extern.java.Log;
@Log
public class ForEachArray {
	public static void main(String[] args) {
		int a[]= {1,2,6,3,4};
		String str[]= {"abc","asd","gfe"};
		double d[]= {4.5,6.7,1.4,6.2};
		for(int i:a)
			System.out.println(i);
		for(String j:str)
			System.out.println(j);
		for(double k:d)
			System.out.println(k);
		
		
	}

}
