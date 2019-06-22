package com.tyss.javaapp.filehandler;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectWriter  {
	public static void main(String[] args) {
	TakePerson t=new TakePerson();
	Person p=new Person();
	p.setId(10);
	p.setName("bhavani");
	t.take(p);
	FileOutputStream fout=null;
	ObjectOutputStream obj=null;
		try {
			fout =new FileOutputStream("person.txt");
			obj=new ObjectOutputStream(fout);
			obj.writeObject(p);	
			System.out.println("done");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		finally {
		
				try {
					if(fout!=null)
					fout.close();
					if(obj!=null)
						obj.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		
	}

}

class TakePerson{
	void take(Person p)
	{
		
		p.getId();
		p.getName();
	}
	
}