
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Pen {

	void open() {
		String s = null;
		try {
			System.out.println(10 / 0);
			System.out.println(s.length());
		} catch (ArithmeticException e) {
			System.out.println("number shoud not div by 0");
		} catch (NullPointerException n) {
			System.out.println("null shoud not used");
			throw n;
		}
	}

}

class Marker {
	void write() throws FileNotFoundException {
		FileReader f = new FileReader("abc.txt");

	}
}
