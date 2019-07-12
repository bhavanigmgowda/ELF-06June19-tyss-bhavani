package assignmentday2;

class Revs
{
	String count(String s)
	{
		int count=0;
		String out="";
		char[] c=s.toCharArray();
		for(int i=0;i<c.length-1;i++)
		{
			String res="";
			while(c[i]!=' ' && i<c.length-1)
			{
				if(count%2==0)
				{
				res=c[i]+res;
				i++;
				}
				else
				{
				res=res+c[i];
				i++;	
				}
			}	
			out=out+res+" ";	
			
			if(c[i]==' ')
			{
				count++;
			}
		}
		return out;
		
	}
}
class Oddrev
{
	public static void main(String[] args) {
		String s="Hoga beda hudugi nana bittu";
		Revs a=new Revs();
	String s1=a.count(s);
	System.out.println(s1);
	}
}