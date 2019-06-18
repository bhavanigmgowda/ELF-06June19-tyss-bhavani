class Primenum
{
	public static boolean prime(int n)
	{

		for(int i=2;i<n/2;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
				return true;
	
	}

	public static void main(String[] args) {
		int n=7;
		boolean res=prime(n);
		if(res)
			System.out.println("prime number");
		else
			System.out.println("not a prime number");
	}
}