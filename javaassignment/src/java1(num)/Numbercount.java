class Addnum
{
	String count(String s)
	{
		int count=0;
		String res=" ";
		char[] c=s.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			while(c[i]!=' ' && i<c.length-1)
			{
				res=res+c[i];
				count++;
				i++;
			}	
	
					res=res+count+" ";
					count=0;			
			
		}
		return res;
		
	}
}
class Numbercount
{
	public static void main(String[] args) {
		String s="bhavani anjali";
		Addnum a=new Addnum();
	String s1=a.count(s);
	System.out.println(s1);
	}
}