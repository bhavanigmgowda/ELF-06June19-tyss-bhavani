package com.tyss.javaapp.stringclass;

public class MarkerSingleton {
	private static final MarkerSingleton m=new MarkerSingleton();
	private MarkerSingleton()
	{
		
	}
	public static MarkerSingleton getmarker()
	{
		return m;
	}
	
}
