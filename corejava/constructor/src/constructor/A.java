package constructor;

public class A {
	int i=90;
	
}
class B extends A
{
	int i=60;
	void display()
	{
		int i=30;
		System.out.println(i);
		System.out.println(this.i);
		System.out.println(super.i);
		
	}
	
}
