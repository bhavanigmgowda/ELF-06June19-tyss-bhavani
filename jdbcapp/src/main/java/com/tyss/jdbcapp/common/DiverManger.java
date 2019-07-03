package com.tyss.jdbcapp.common;

import lombok.extern.java.Log;

@Log
public class DiverManger implements Connection {

	@Override
	public void getConnection() {
		log.info("classA");
	}
	

}
