package com.tyss.javaapp.passbyobject;

public class Baby {
void receive(Chips c[])
{
	for(int i=0;i<c.length;i++)
	{
		Chips cm=c[i];
		System.out.println("baby eating");
		cm.open();
		cm.eat();
		
	}
	
}
}
