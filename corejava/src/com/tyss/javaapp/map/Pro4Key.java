package com.tyss.javaapp.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Pro4Key {
	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("one", 10);
		hm.put("two", 20);
		hm.put("three", 30);
		hm.put("foure", 40);
		System.out.println("***key***");
		Set<String> s = hm.keySet();
		for (String ts : s) {
			System.out.println(ts);
		}
		System.out.println("***value***");
		Collection<Integer> ci = hm.values();
		Iterator<Integer> it = ci.iterator();
		while (it.hasNext()) {    
			Integer r = it.next();
			System.out.println(r);
		}
	}

}

