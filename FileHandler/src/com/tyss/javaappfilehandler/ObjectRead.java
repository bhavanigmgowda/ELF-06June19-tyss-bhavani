package com.tyss.javaappfilehandler;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectRead {
	public static void main(String[] args) {
		ObjectInputStream obj1=null;
		FileInputStream fin=null;
	try {
		
		fin=new FileInputStream("person.txt");
		obj1= new ObjectInputStream(fin);
		Person p=(Person)obj1.readObject();
		System.out.println("name:"+p.getName());
		System.out.println("ID:"+p.getId());
		
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
	finally
	{
			try {
				if(obj1!=null)
				obj1.close();
				if(fin!=null)
				fin.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		
	}
	
}

}
