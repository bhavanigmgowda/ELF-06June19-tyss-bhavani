class Pattern9a
{
	public static void main(String[] args) {
		int n=5;
		int mid=n/2;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(j==n/2||i==n/2)
					System.out.print("* ");
				else
					System.out.print("  ");
				
			}
			System.out.println();
			
		}
	}
}