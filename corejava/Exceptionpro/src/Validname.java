
public class Validname {

	String s;
	void valid(String s)
	{
		this.s=s;
		if(s.length()>5)
		{
			System.out.println("valid name");
		}
		else 
		{
			throw new NameNotValid();
		}
	}
}

