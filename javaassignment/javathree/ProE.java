package com.tyss.assignment.javathree;
class Revs
{
	String count(String s)
	{
		int count=0;
		String out=" ";
		char[] c=s.toCharArray();
		for(int i=0;i<c.length-1;i++)
		{
			String res=" ";
		
			while(c[i]!=' ' && i<c.length-1)
			{
				res=c[i]+res;
				i++;
			}	
	
					out=out+" "+res;
		}
		return out;
		
	}
}
class ProE
{
	public static void main(String[] args) {
		String s="bhavani anjali";
		Revs a=new Revs();
	String s1=a.count(s);
	System.out.println(s1);
	}
}