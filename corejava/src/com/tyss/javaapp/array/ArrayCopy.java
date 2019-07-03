package com.tyss.javaapp.array;

import lombok.extern.java.Log;
@Log
public class ArrayCopy {
	
	public static void main(String[] args) {
		int a[] = { 5, 6, 7, 8, 4, 1, 9 };
		int b[] = { 20, 50, 55, 66, 88, 42, 6, 4, 8 };
		int sourceArrayIndex = 1;
		int givenIndex = 1;
		int givenNum = 3;
		for (int i = givenIndex; i < b.length; i++) {
			if (sourceArrayIndex <= givenNum) {
				b[i] = a[sourceArrayIndex++];
			}                                                
		}
		for (int j = 0; j < b.length; j++) {
			log.info(b[j] + " ");
		}
		System.arraycopy(a, 1, b, 1, 3);
		
		log.info("");
		
		for (int j = 0; j < b.length; j++) {
			
			log.info(b[j] + " ");
		}
		
	}

}
