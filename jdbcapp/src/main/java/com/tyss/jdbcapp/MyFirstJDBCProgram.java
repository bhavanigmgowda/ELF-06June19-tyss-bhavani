package com.tyss.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//import org.gjt.mm.mysql.Driver;

import com.mysql.jdbc.Driver;

import lombok.extern.java.Log;

@Log
public class MyFirstJDBCProgram {

	public static void main(String[] args) {
		
		try {

			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			String dbUrl = "jdbc:mysql://localhost:3306/tyss_db?";

			Connection con = DriverManager.getConnection(dbUrl, "root", "root");
			log.info("class name" + con.getClass());
			String query = "select * from EMPLOYEE_INFO ";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);

			while (rs.next()) {
				log.info("  ID (PK)	===>	" + rs.getInt(1));
				log.info("  NAME	===>	" + rs.getString(2));
				log.info("  AGE		===>	" + rs.getInt("AGE"));
				log.info("  GENDER	===>	" + rs.getString("GENDER"));
				log.info("  SALARY	===>	" + rs.getInt("SALARY"));
				log.info("  PHNUM	===>	" + rs.getInt("PHNUM"));
				log.info("  JOINING_DATE ===>" + rs.getDate("JOINING_DATE"));
				log.info("  ACCOUNT_NUMBER  ===>" + rs.getInt("ACCOUNT_NUMBER"));
				log.info("  EMAIL		===>" + rs.getString("EMAIL"));
				log.info("	DESIGNATION	===>" + rs.getString("DESIGNATION"));
				log.info("  DOB		===>	" + rs.getDate("DOB"));
				log.info("  DEPT_ID(FK) ===>" + rs.getInt("DEPT_ID"));
				log.info("  MNGR_ID ===>	" + rs.getInt("MNGR_ID"));

			}

		} catch (SQLException e) {
			e.printStackTrace();
		} 
			 

	}
}
