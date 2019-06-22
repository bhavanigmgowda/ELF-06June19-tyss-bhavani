package com.tyss.javaapp.stringclass;

public class Testemp {
	public static void main(String[] args) {
		Emp e=new Emp(123,"bhavani",5.5,'F',true);
		System.out.println("ID="+e.getID());
		System.out.println("name="+e.getName());
		System.out.println("Height="+e.getHeight());
		System.out.println("Gender="+e.getGender());
		System.out.println("Status="+e.isStatus());
	}

}
