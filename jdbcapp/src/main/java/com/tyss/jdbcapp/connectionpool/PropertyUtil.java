package com.tyss.jdbcapp.connectionpool;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyUtil {

	
	static PropertyUtil util=null;
	Properties properties =null;
	private PropertyUtil() throws IOException  {
		FileInputStream fin= new FileInputStream("personal.properties");
			properties = new Properties();
			properties.load(fin);
	}
	public static PropertyUtil getProperty() throws IOException {
		if(util==null) {
			util=new PropertyUtil();
		}
		return util;
	}
	public String getProperty(String key)  {
		return properties.getProperty(key);
	}
}
