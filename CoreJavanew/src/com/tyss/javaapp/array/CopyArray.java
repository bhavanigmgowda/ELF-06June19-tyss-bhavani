package com.tyss.javaapp.array;

import java.util.Arrays;
import lombok.extern.java.Log;
@Log
public class CopyArray {
	public static void main(String[] args) {
		int[] a = { 1, 8, 3,6,9,3 };
		int[] b = Arrays.copyOfRange(a, 2, 5);
	
	
		log.info("Contents of a[] ");
		for (int i = 0; i < a.length; i++) {
		log.info(a[i] + " ");
		}
		log.info("\n\nContents of b[] ");
		for (int i = 0; i < b.length; i++) {
			log.info(b[i] + " ");
		}
	}

}
