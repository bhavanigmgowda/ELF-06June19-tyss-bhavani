class Pattern9b
{
	public static void main(String[] args) {
		int n=5;
		int mid=n/2;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i+j==n-1||i==j)
					System.out.print("* ");
				else
					System.out.print("  ");
				
			}
			System.out.println();
			
		}
	}
}