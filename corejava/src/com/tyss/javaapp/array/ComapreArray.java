package com.tyss.javaapp.array;

import java.util.Arrays;

import lombok.extern.java.Log;
@Log
public class ComapreArray {
	  public static void main (String[] args)  
	    { 
	        int[] arr1 = {4, 2, 3}; 
	        int[] arr2 = {4, 2, 3}; 
	        if (Arrays.equals(arr1, arr2))   
	            log.info("Same"); 
	        else
	            log.info("Not same"); 
	    } 
}
