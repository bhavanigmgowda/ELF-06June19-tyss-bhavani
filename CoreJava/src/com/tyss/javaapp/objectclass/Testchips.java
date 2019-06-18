package com.tyss.javaapp.objectclass;

public class Testchips {
public static void main(String[] args) {
	Chips c=new Lays();
	Lays l=(Lays)c;
	l.open();
	l.eat();
	System.out.println("***********");
	Chips c1=new Bingo();
	Bingo b=(Bingo)c1;
	b.open();
	b.byteBingo();
}
}
