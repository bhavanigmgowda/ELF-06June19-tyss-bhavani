class Rev
{
	String count(String s)
	{
		int count=1;
		String out="";
		char[] c=s.toCharArray();
		for(int i=0;i<c.length-1;i++)
		{
			String res="";
		
			while(c[i]!=' ' && i<c.length-1)
			{
				res=res+c[i];
				i++;
			}	
			if(c[i]==' ')
			{
				count++;
			}
			if(count%2!=0)
					out=out+" "+res;
				else
					out=res+" "+out;
		}
		return out;
		
	}
}
class Oddexch
{
	public static void main(String[] args) {
		String s="hoga beda hudugi nana bittu ";
		System.out.println(s);
		Rev a=new Rev();
	String s1=a.count(s);
	System.out.println(s1);
	}
}