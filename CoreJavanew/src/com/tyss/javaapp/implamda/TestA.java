package com.tyss.javaapp.implamda;

import java.util.Comparator;
import java.util.TreeSet;
import java.util.logging.Logger;

import lombok.extern.java.Log;

@Log
public class TestA {
	private static final Logger log=Logger.getLogger("bhavani");

	public static void main(String[] args) {
		Comparator<Emp> c1 = (m, f) ->  m.name.compareTo(f.name);
		
		TreeSet<Emp> t1 = new TreeSet<Emp>(c1);
		Emp e1 = new Emp(3, "bhavani", 'f');
		Emp e2 = new Emp(1, "anjali", 'f');
		Emp e3 = new Emp(4, "sahana", 'f');
		Emp e4 = new Emp(2, "bharath", 'm');
		Emp e5 = new Emp(5, "lakshi", 'm');

		t1.add(e1);
		t1.add(e2);
		t1.add(e3);
		t1.add(e4);
		t1.add(e5);

		for (Emp e : t1) {
			log.info("id= " + e.id + "	name= " + e.name + "	gender= " + e.gender);
		}
	}

}
