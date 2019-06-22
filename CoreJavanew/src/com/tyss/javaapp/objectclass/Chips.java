package com.tyss.javaapp.objectclass;

public class Chips {
	void open()
	{
		System.out.println("open the chips");
	}

}
class Lays extends Chips 
{
	void eat()
	{
		System.out.println("eating the lays");
	}
}
class Bingo extends Chips 
{
	void byteBingo()
	{
		System.out.println("eating the bingo");
	}
}

