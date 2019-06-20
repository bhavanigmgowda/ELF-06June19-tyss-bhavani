package com.tyss.javaapp.passbyobject;

public class Testbaby {
	static int a=run.add();
	static
	{
		
	}
	
	public static void main(String[] args) {

		Baby b = new Baby();
		Lays l[] = new Lays[4];
		for(int i=0;i<l.length;i++)
				{
				l[i] = new Lays();
			
				}
		b.receive(l);
	}
	
}


class run
{
	static int add()
	{
		int a=10;
		System.out.println(a);
		return a;
	}
}

