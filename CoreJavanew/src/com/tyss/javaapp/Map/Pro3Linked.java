package com.tyss.javaapp.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Pro3Linked {
	public static void main(String[] args) {
		LinkedHashMap<Integer, Double> hm=new LinkedHashMap<Integer, Double>();
		hm.put(50,4.5);
		hm.put( 30,1.2);
		hm.put( 10,5.8);
		hm.put( 90,5.7);
		for(Map.Entry<Integer, Double> e:hm.entrySet()){
			System.out.println("key: "+e.getKey());
			System.out.println("value:  "+e.getValue());
		}
		
	}

}
