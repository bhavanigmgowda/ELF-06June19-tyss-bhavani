package com.tyss.jdbcapp.connectionpool;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import lombok.extern.java.Log;

@Log
public class ConnectionPoolTest {

	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		ConnectionPool pool=null;
		try {
			pool=ConnectionPool.getConnectionPool();
			con=pool.getConnectionFromPool();
			
			String query = "select * from EMPLOYEE_INFO ";
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);

			while (rs.next()) {
				log.info("  ID (PK)	===>	" + rs.getInt(1));
				log.info("  NAME	===>	" + rs.getString(2));
				log.info("  AGE		===>		" + rs.getInt("AGE"));
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

		} catch (SQLException | ClassNotFoundException | IOException  e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} 
			  finally {
			  
			  try { 
				  pool.returnConnectionToPool(con);
				  if (con != null) { 
					  con.close(); 
					  } 
				  if (stmt != null) { 
					  stmt.close();
					  }
			  if (rs != null) {
				  rs.close(); }
			  
			  } catch (SQLException e) { e.printStackTrace();
			  
			  } }
			 

	}
}
