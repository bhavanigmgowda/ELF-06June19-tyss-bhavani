package com.tyss.javaapp.objectclass;

public class Pen {
	int i;
	void writepen()
	{
		System.out.println("write by pen "+i);
	}
		
	}

	 class Marker extends Pen {
	double j;
	void writemarker()
	{
		System.out.println("write by marker "+j);
	}
		
	}


