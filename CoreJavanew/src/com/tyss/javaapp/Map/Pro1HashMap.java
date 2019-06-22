package com.tyss.javaapp.Map;

import java.util.HashMap;
import java.util.Map;

public class Pro1HashMap {
	public static void main(String[] args) {
		HashMap<String, Integer> hm=new HashMap<String, Integer>();
		hm.put("one",10);
		hm.put("two", 20);
		hm.put("three", 30);
		hm.put("foure", 40);
		for(Map.Entry<String, Integer> e:hm.entrySet())
		{
			System.out.println("key: "+e.getKey());
			System.out.println("value:  "+e.getValue());
		}
	}

}
