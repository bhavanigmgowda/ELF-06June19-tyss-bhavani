package com.tyss.javaapp.array;

import java.util.Arrays;

public class SortArray {
	   
    public static void main(String a[]){    
      //  int[] a1= {10,20,30,50,70,90};  
        String a1[]= {"abc","fgh","asd","bcd"};
        Arrays.parallelSort(a1);
        for (int i = 0; i < a1.length ; i++)
			System.out.println(a1[i]);
       int index= Arrays.binarySearch(a1, "fgd");
       if(index>0)
    	   System.out.println("element is present");
       else
    	   System.out.println("element is not present");
    }    
}

