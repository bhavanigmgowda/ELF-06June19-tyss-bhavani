package test;

public class pat {
	public static void sample3(int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i>=j)
				{
					System.out.print("*");
					
				}
			}
			System.out.println();
		}
	}

}
