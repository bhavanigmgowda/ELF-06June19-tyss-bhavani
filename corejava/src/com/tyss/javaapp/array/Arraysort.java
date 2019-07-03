package com.tyss.javaapp.array;

import java.util.Arrays;
import java.util.Collections;

import lombok.extern.java.Log;
@Log
public class Arraysort {
	public static void main(String[] args) {
		String[] str= {"abc","fgh","asd","bcd"};
		Arrays.sort(str,Collections.reverseOrder());
		for (int i = 0; i < str.length ; i++) {
		log.info(""+str[i]);
		}
	
	}
}