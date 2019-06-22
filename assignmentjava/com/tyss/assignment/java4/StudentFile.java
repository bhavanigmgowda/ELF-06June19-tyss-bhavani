package assignment3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class StudentFile {
	public static void main(String[] args) {

		Student s[]=new Student[5];
		for(int i=0;i<s.length;i++)
		{
			s[i]=new Student();
		}
		s[0].std("bhavani", 123, 60);
		s[1].std("anjali", 345, 90);
		s[2].std("rashmi", 567,	82);
		s[3].std("rashmi", 567, 89);
		s[4].std("barath", 321, 70);
		try {
			FileOutputStream fout = new FileOutputStream("ex.txt",true);
			ObjectOutputStream obj = new ObjectOutputStream(fout);
			for(int i=0;i<s.length;i++)
			{
			obj.writeObject(s[i]);
			if(s[i].marks>=80)
			{
				s[i].display();
			}
			}
			
			System.out.println("done");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
