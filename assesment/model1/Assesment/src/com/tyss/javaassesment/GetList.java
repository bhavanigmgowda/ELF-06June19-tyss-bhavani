package com.tyss.javaassesment;

public class GetList {
	ListElement get(int i) {
	if (i==1) {
		return new ArrayListOne();	
	}
	else if(i==2) {
		return new LinkedListTwo();
	}
	else {
		return new VectorThree();
	}
}
}