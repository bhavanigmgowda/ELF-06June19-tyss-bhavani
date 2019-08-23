
public abstract class Google {
 void login()
 {
	 System.out.println(" login ");
 }
 abstract void sharedoc();
}

class Gmail extends Google {
	void sharedoc()
	{
		System.out.println("sharing gmail ");
	}
}
class Gdrive extends Google {
	void sharedoc()
	{
		System.out.println("sharing google drive ");
	}
}
