package com.tyss.assignment.javaseven;

import java.util.Comparator;
import java.util.TreeSet;

import com.tyss.assignment.javafive.Emp;

public class ProA {
	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		Student s4=new Student();
		s1.set("bhavani", 18, 67);
		s2.set("ANJALI", 21, 77);
		s3.set("sahana", 21, 87);
		s4.set("vani", 22, 96);
		
		Comparator<Student> sortName=	(i,j)-> i.name.compareTo(j.name); 
		Comparator<Student> sortId=	(i,j)-> {
			Integer a=i.id;
			Integer b=j.id;
			return a.compareTo(b); 
		};
		Comparator<Student> sortMarks=	(i,j)-> {
			Double a=i.marks;
			Double b=j.marks;
			return a.compareTo(b); 
		};
		TreeSet<Student> t=new TreeSet<Student>(sortName);
		t.add(s1);
		t.add(s2);
		t.add(s3);
		t.add(s4);
		for (Student el : t) {
			el.get();
		}


		
		
	}

}
