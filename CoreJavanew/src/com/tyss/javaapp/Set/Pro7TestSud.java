package com.tyss.javaapp.Set;

import java.util.TreeSet;


public class Pro7TestSud {
	public static void main(String[] args) {
		TreeSet<Student> t=new TreeSet<Student>();
		Student s1 = new Student();
		s1.set("divya", 1, 78.98);
		Student s2 = new Student();
		s2.set("priya", 3, 69.87);
		Student s3 = new Student();
		s3.set("anil", 4, 62);
		Student s4 = new Student();
		s4.set("manu", 2, 88.97);
		t.add(s1);
		t.add(s2);
		t.add(s3);
		t.add(s4);
		for (Student s : t) {
			System.out.println("name=" + s.name+" id=" + s.id+" per=" + s.per);
		}
	}

}
