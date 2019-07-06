package com.tyss.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

import lombok.extern.java.Log;;
@Log
public class Sampl {
	public static void main(String[] args) {
		Driver driver;
		try {
			driver = new Driver();
			DriverManager.registerDriver(driver);
			
			
			String dbUrl="jdbc:mysql://localhost:3306/tyss_db";
			
			Connection con=DriverManager.getConnection(dbUrl,"root","root");
			Statement stmt=con.createStatement();
			String sql="select * from EMPLOYEE_INFO ";
			ResultSet rs=stmt.executeQuery(sql);
			while(rs.next()) {
				log.info(""+rs.getInt("id"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}

}
