package assignment3;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AppendFile {
	
			
		public static void main(String[] args) {
			String msg="twinkel twinkel little star "
					+ "how i wander what they are  ";
			byte b[]=msg.getBytes();
			try {
				FileInputStream fin=new FileInputStream("ex.txt");
				
				FileOutputStream fout=new FileOutputStream("poem.txt",true);
				fout.write(b);
				fout.close();
				System.out.println("data is write into file");
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	

}
