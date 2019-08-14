
abstract class pen extends Pencli {
		void write()
		{
		System.out.println("pen class of write()");	
		}
		
	}

class Marker extends pen
{
	void color()
	{
		System.out.println("marker color()");
	}
}

