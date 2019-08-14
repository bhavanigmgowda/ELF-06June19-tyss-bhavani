
public class Testname {
	public static void main(String[] args) {
		Validname v=new Validname();
		try {
			v.valid("bhav");
		} catch (NameNotValid e) {
			
			System.out.println(e);
		}
	}
 
}
