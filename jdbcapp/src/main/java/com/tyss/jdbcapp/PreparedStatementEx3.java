package com.tyss.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import lombok.extern.java.Log;
@Log
public class PreparedStatementEx3 {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int i;
		try {

			Class.forName("com.mysql.jdbc.Driver");

			String dbUrl = "jdbc:mysql://localhost:3306/tyss_db?";

			con = DriverManager.getConnection(dbUrl, "root", "root");
			log.info("class name" + con.getClass());
			String query = "insert into employee_info "+
							" values(?,?,?,?,?,?,?,?,?,?,?,?,?) ";
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, Integer.parseInt(args[0]));	
			pstmt.setString(2, args[1]);
			pstmt.setInt(3, Integer.parseInt(args[2]));	
			pstmt.setString(4, args[3]);
			pstmt.setDouble(5, Double.parseDouble(args[4]));	
			pstmt.setInt(6,Integer.parseInt( args[5]));
			pstmt.setString(7,(args[6]));	
			pstmt.setInt(8,Integer.parseInt( args[7]));
			pstmt.setString(9, (args[8]));	
			pstmt.setString(10, args[9]);
			pstmt.setString(11, args[10]);	
			pstmt.setInt(12,Integer.parseInt( args[11]));
			pstmt.setInt(13,Integer.parseInt( args[12]));
			i= pstmt.executeUpdate();

			log.info(""+i);

		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		} finally {

			try {
				if (con != null) {
					con.close();
				}
				if (pstmt != null) {
					pstmt.close();
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
