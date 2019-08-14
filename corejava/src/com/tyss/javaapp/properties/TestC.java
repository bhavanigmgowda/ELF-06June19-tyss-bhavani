package com.tyss.javaapp.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import lombok.extern.java.Log;

@Log
public class TestC {
	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("demo.properties");
			Properties p = new Properties();
			p.load(fin);

			String phnumber = p.getProperty("phoneNumber");
			String name = p.getProperty("companyname");
			log.info("name=" + name);
			log.info("phone number= " + phnumber);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
