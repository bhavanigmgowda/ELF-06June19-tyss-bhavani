package test;

import java.util.Scanner;

public class Bmical {
	public static void cal(double w, double h)
	{
		double avg = w+h/2;
		if(w>=50 && w<=100 && h>=150 && h<=200)
		{
			
			System.out.println("average"+avg);
			
		}
		if(w>=100 && w<=200 && h<100)
		{
		
			System.out.println("overweight"+avg);
			
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the body weight");
		double w=sc.nextDouble();
		System.out.println("enter the body height");
		double h=sc.nextDouble();
		cal(w,h);
		
	}

}
