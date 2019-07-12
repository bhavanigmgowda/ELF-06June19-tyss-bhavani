package com.tyss.assignment.javaseven;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import lombok.extern.java.Log;
@Log
public class ProF {
	private static final Logger log = Logger.getLogger("bhavani");

	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		Student s4=new Student();
		s1.set("bhavani", 6, 67);
		s2.set("ANJALI", 1, 77);
		s3.set("sahana", 2, 87);
		s4.set("vani", 7, 96);
		ArrayList<Student> list=new ArrayList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		

		Comparator<Student> c=(i,j)->{
			Integer a=i.id;
			Integer b=j.id;
			return a.compareTo(b);
		};
		List<Student> x = list.stream().sorted(c).collect(Collectors.toList());
		log.info("" + x);

	}
}
