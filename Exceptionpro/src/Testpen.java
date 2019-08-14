import java.io.FileNotFoundException;

public class Testpen {

	public static void main(String[] args) {
		/*
		 * Pen p=new Pen(); try { p.open(); } catch (NullPointerException e) {
		 * System.out.println("null shoud not used"); }
		 */
		Marker m = new Marker();
		try {
			m.write();
		} catch (FileNotFoundException e) {

			System.out.println("file not found");
		}
	}
}
