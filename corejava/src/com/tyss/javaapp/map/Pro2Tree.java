package com.tyss.javaapp.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Pro2Tree {
	public static void main(String[] args) {
		TreeMap< Integer,Integer> hm=new TreeMap<Integer,Integer>();
		hm.put(2,10);
		hm.put(4, 20);
		hm.put(1, 30);
		hm.put(6, 40);
		for(Map.Entry<Integer,Integer> e:hm.entrySet())
		{
			System.out.println("key: "+e.getKey());
			System.out.println("value:  "+e.getValue());
		}
	}

}
