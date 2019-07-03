package com.tyss.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import lombok.extern.java.Log;
@Log
public class StatementEx2 {
	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		int i;
		try {

			Class.forName("com.mysql.jdbc.Driver");

			String dbUrl = "jdbc:mysql://localhost:3306/tyss_db?";

			con = DriverManager.getConnection(dbUrl, "root", "root");
			log.info("class name" + con.getClass());
			String query = "insert into employee_info "+
							" values(12,'sowndarya',22,'f',50000,678545454,'2018-06-07' "+
							" ,367842345,'bhavaj','HR','1998-07-06',20,5) ";
			stmt = con.createStatement();
			i= stmt.executeUpdate(query);

			log.info(""+i);

		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		} finally {

			try {
				if (con != null) {
					con.close();
				}
				if (stmt != null) {
					stmt.close();
				}
				if (rs != null) {
					rs.close();
				}

			} catch (SQLException e) {
				e.printStackTrace();

			}
		}
	}
}
