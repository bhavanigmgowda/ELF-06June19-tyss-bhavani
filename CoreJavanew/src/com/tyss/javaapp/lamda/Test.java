package com.tyss.javaapp.lamda;

import lombok.extern.java.Log;

@Log
public class Test {
	void display(Student s) {
		double avg=(s.m1+s.m2+s.m3)/3;
		log.info(s.name+"avg="+avg);
	}

}
