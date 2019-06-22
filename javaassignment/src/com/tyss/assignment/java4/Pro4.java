package com.tyss.assignment.java4;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
 * wap to write the data in CSV file (name,age,designation,salary)
 */
public class Pro4 {

	public static void main(String[] args) {

		FileOutputStream fout=null;
	ObjectOutputStream obj=null;
		try {
			Emp e=new Emp();
			e.set("bhavani", 20, "IT", 20000);
			fout =new FileOutputStream("person.csv");
			obj=new ObjectOutputStream(fout);
			obj.writeObject(e);	
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
