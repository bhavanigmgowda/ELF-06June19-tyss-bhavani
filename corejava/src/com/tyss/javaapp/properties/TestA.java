package com.tyss.javaapp.properties;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import lombok.extern.java.Log;
@Log
public class TestA {
	public static void main(String[] args) {
		
		try {
			FileOutputStream f=new FileOutputStream("demo.properties");
			Properties p= new Properties();
			p.setProperty("companyname", "TestYantra");
			p.setProperty("phoneNumber", "9964968584");
			p.store(f, "company details");
			log.info("done");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
