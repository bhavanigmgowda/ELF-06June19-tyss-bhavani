package com.tyss.javaassessment;
/*4)	WAP to search a train by name or number*/
public class TrainTest {

	public static void main(String[] args) {
		Train train=new Train();
		int number=2;
		String name="Karnataka";
		train.search(number);
		train.search(name);
	}

}
