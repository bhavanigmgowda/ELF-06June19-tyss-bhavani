package com.tyss.emp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.mysql.jdbc.Driver;
import com.tyss.emp.dto.EmployeeInfoBean;



public abstract class EmployeeDAOJDBCImpl implements EmployeeDAO {
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	EmployeeInfoBean bean;
	
	public EmployeeInfoBean getEmployeeInfo(String id) {
		try {
			return bean=getEmployeeInfo(Integer.parseInt(id));
		} catch (NumberFormatException e) {
			e.printStackTrace();
			return null;
		}
		

	}// end method

	public EmployeeInfoBean getEmployeeInfo(int id) {
		try {

			Class.forName("com.mysql.jdbc.Driver");

			String dbUrl = "jdbc:mysql://localhost:3306/tyss_db?";
			con = DriverManager.getConnection(dbUrl, "root", "root");

			String query = "select * from EMPLOYEE_INFO " + "WHERE ID=? ";
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();
			 bean=new EmployeeInfoBean();
			while (rs.next()) {
				bean.setId( rs.getInt("ID"));
				bean.setName(rs.getString("NAME"));
				bean.setAge( rs.getInt("AGE"));
				bean.setGender( rs.getString("GENDER"));
				bean.setSalary(rs.getInt("SALARY"));
				bean.setPhnum( rs.getInt("PHNUM"));
				bean.setJoiningDate(rs.getDate("JOINING_DATE"));
				bean.setAccountNumber( rs.getInt("ACCOUNT_NUMBER"));
				bean.setEmail( rs.getString("EMAIL"));
				bean.setDesignation(rs.getString("DESIGNATION"));
				bean.setDob(rs.getDate("DOB"));
				bean.setDepartmentId(rs.getInt("DEPT_ID"));
				bean.setManagerId( rs.getInt("MNGR_ID"));

			}
			return bean;
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
			return null;
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
		} // end finally
	}
	
	public  ArrayList<EmployeeInfoBean> getAllEmployeeInfo() {
		Driver driver = null;
		String dbUrl = "jdbc:mysql://localhost:3306/tyss_db?";
		String query = "select * from EMPLOYEE_INFO ";
		try (Connection con = DriverManager.getConnection(dbUrl, "root", "root");
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(query);) {

			driver = new Driver();
			DriverManager.registerDriver(driver);
			ArrayList<EmployeeInfoBean> beans=new ArrayList<EmployeeInfoBean>();
			 bean=new EmployeeInfoBean();
			while (rs.next()) {
				bean.setId( rs.getInt("ID"));
				bean.setName(rs.getString("NAME"));
				bean.setAge( rs.getInt("AGE"));
				bean.setGender( rs.getString("GENDER"));
				bean.setSalary(rs.getInt("SALARY"));
				bean.setPhnum( rs.getInt("PHNUM"));
				bean.setJoiningDate(rs.getDate("JOINING_DATE"));
				bean.setAccountNumber( rs.getInt("ACCOUNT_NUMBER"));
				bean.setEmail( rs.getString("EMAIL"));
				bean.setDesignation(rs.getString("DESIGNATION"));
				bean.setDob(rs.getDate("DOB"));
				bean.setDepartmentId(rs.getInt("DEPT_ID"));
				bean.setManagerId( rs.getInt("MNGR_ID"));
				beans.add(bean);
			}
			return beans;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;

		}

	}

	@Override
	public boolean createEmployeeInfo(EmployeeInfoBean bean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateEmployeeInfo(EmployeeInfoBean bean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteEmployeeInfo(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteEmployeeInfo(String id) {
		// TODO Auto-generated method stub
		return false;
	}

}
