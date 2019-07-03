package com.tyss.javaassesment;

public class GetCheps {
	Cheps get(int i) {
		if (i==1) {
			return new KurKure();	
		}
		else if(i==2) {
			return new Lays();
		}
		else {
			return new Bingo();
		}
	}
}
