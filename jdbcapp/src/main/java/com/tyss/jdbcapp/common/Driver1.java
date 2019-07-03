package com.tyss.jdbcapp.common;

import lombok.extern.java.Log;

@Log
public class Driver1 implements Connection {

	
	@Override
	public void getConnection() {
		log.info("classB");
		
	}
}
