package com.tyss.javaapp.objectclass;

public class Bus {
	int model;
	void move()
	{
		System.out.println("bus is moving "+model);
	}
		
	}

class Van extends Bus {
	int seats;
	void turn()
	{
		System.out.println("num of van seats is  "+seats);
	}
		

}
