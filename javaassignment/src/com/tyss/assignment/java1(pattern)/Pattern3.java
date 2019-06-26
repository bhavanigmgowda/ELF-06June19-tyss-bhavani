package assignmentday1;

public class Pattern3 {
	public static void main(String[] args) {
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(i>j)
				System.out.print("* ");
			}
				System.out.println();
		}
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(i+j<=5-1)
				System.out.print("* ");
			}
				System.out.println();
		}

	}
}
