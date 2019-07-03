package javaeight;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import lombok.extern.java.Log;
@Log
public class PerC {
	public static void main(String[] args) {
		
		try {
			FileOutputStream f=new FileOutputStream("personal.properties");
			Properties p= new Properties();
			p.setProperty("name", "bhavani");
			p.setProperty("phoneNumber", "9964968584");
			p.store(f, "personal details");
			log.info("done");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
