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
public class JDBCProgramForAWSDB {


	
	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {

			Class.forName("com.mysql.jdbc.Driver");

			String dbUrl = "jdbc:mysql://mysql.cusnhfizwsgq.us-east-2.rds.amazonaws.com:3306/bhavanidatabase?user=root&password=rootroot" ;

			con = DriverManager.getConnection(dbUrl);
			log.info("class name" + con.getClass());
			String query = "select * from employee_info ";
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);

			if (rs.next()) {
				log.info("  ID (PK)			===>	" + rs.getInt("ID"));
				log.info("  NAME			===>	" + rs.getString("NAME"));
				log.info("  AGE				===>		" + rs.getInt("AGE"));
				log.info("  GENDER			===>	" + rs.getString("GENDER"));
				log.info("  SALARY			===>	" + rs.getInt("SALARY"));
				log.info("  PHNUM			===>	" + rs.getInt("PHNUM"));
				log.info("  JOINING_DATE    ===>" + rs.getDate("JOINING_DATE"));
				log.info("  ACCOUNT_NUMBER  ===>" + rs.getInt("ACCOUNT_NUMBER"));
				log.info("  EMAIL			===>" + rs.getString("EMAIL"));
				log.info("	DESIGNATION		===>" + rs.getString("DESIGNATION"));
				log.info("  DOB				===>	" + rs.getDate("DOB"));
				log.info("  DEPT_ID(FK)		 ===>" + rs.getInt("DEPT_ID"));
				log.info("  MNGR_ID			 ===>	" + rs.getInt("MNGR_ID"));

			}
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
}
