package com.tyss.javaapp.lamda;

import lombok.extern.java.Log;

@Log
public class Pro1MyStd {
	void cal(int a,int b,int c) {
		double r=(a+b+c)/3.0;
		log.info("avg="+r);
	}
	int fact(int a) {
		int f=1;
		for(int i=1;i<=a;i++) {
			f=f*i;
		}
		return f;
	}

}
