package com.tyss.assignment.java6;
/*
 * WAP to addd num using lamda expression 
 */
public class Pro1 {
static Pro1int s=(a,b)-> a+b;
	
	/*
	
	static Stringcount s1 = (str)->
	{
		return str.length();
	};
	
	static Squre sq=(sqr)->
	{
		return sqr*sqr;
	};
	*/
	public static void main(String[] args) {
		int i=s.add(5,10);
		System.out.println("addtion= "+i);
	/*int len=s1.lengthCount("bhavani");
		System.out.println(len);
		int s=sq.sqr(10);
		System.out.println(s);
*/		
	}

}
