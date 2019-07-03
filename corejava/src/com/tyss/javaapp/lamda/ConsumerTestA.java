package com.tyss.javaapp.lamda;

import java.util.function.Consumer;

import lombok.extern.java.Log;
@Log
public class ConsumerTestA {
	public static void main(String[] args) {
		
	
	Student s1=new Student("bhavani", 50, 80, 40);
	
	Consumer<Student> c= s->{
		double avg=(s.m1+s.m2+s.m3)/3;
		log.info(s.name +" avg="+avg);
	};
	
	c.accept(s1);
	}

}
