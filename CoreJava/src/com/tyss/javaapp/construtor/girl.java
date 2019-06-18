package com.tyss.javaapp.construtor;

public class girl {
	void recived(Phone p) {

		if (p instanceof MIphone) {
			System.out.println("thank you");
		} else if (p instanceof Iphone) {
			System.out.println("I love you");
		}
	}

}
