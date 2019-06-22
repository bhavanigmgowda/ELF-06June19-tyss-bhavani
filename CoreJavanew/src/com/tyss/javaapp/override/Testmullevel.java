package com.tyss.javaapp.override;

public class Testmullevel {
	public static void main(String[] args) {
		

		Level1 l3=new Level3();
		l3.start();
		Level1 l2=new Level2();
		l2.start();
		Level1 l1=new Level1();
		l1.start();
	}
}
