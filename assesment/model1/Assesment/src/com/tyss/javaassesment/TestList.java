package com.tyss.javaassesment;
/**
 *WAP for a method which returns ArrayList, LinkedList, Vector… based on the option entered 
 *1.ArrayList
 *2.LinkedList
 *3.Vector
 */
public class TestList {
	public static void main(String[] args) {
		ArrayListOne k = new ArrayListOne();
		LinkedListTwo l = new LinkedListTwo();
		VectorThree b = new VectorThree();
		GetList g = new GetList();
		int key = 1;
		switch (key) {
		case 1:
			g.get(k);
			break;
		case 2:
			g.get(l);
			break;
		case 3:
			g.get(b);
			break;

		default:
			break;
		}

	}

}
