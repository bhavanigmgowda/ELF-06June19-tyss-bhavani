package com.tyss.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tyss.mywebapp.bean.EmployeeInfoBean;
import com.tyss.mywebapp.dao.EmployeeDAO;
import com.tyss.mywebapp.dao.EmployeeDAOFactory;

import lombok.extern.java.Log;
@WebServlet("/save")

@Log
public class EmployeeInsert extends HttpServlet {

	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String idValue = req.getParameter("id");
		String nameValue = req.getParameter("name");
		String ageValue = req.getParameter("age");
		String genderValue = req.getParameter("gender");
		String salaryValue = req.getParameter("salary");
		String phnumValue = req.getParameter("phnum");
		String dojValue = req.getParameter("doj");
		String accnumberValue = req.getParameter("accnumber");
		String emailValue = req.getParameter("email");
		String dobValue = req.getParameter("dob");
		String deptidValue = req.getParameter("deptid");
		String mgridValue = req.getParameter("mgrid");
		String desdValue = req.getParameter("designation");

		EmployeeInfoBean bean = new EmployeeInfoBean();
		bean.setAccountNumber(Integer.parseInt(accnumberValue));
		bean.setAge(Integer.parseInt(ageValue));
		bean.setDepartmentId(Integer.parseInt(deptidValue));
		bean.setDesignation(desdValue);
		try {
			bean.setDob(new SimpleDateFormat("dd/MM/yyyy").parse(dobValue));
			bean.setJoiningDate(new SimpleDateFormat("dd/MM/yyyy").parse(dojValue));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		bean.setEmail(emailValue);
		bean.setGender(genderValue);
		bean.setId(Integer.parseInt(idValue));
		
		bean.setManagerId(Integer.parseInt(mgridValue));
		bean.setName(nameValue);
		bean.setPhnum(Integer.parseInt(phnumValue));
		bean.setSalary(Double.parseDouble(salaryValue));
		
		EmployeeDAO dao = EmployeeDAOFactory.getinstance();
		boolean res = dao.createEmployeeInfo(bean); 
		PrintWriter out = resp.getWriter();
		if (res) {
			out.print("<HTML>");
			out.print("<BODY>");
			out.print("<h1><span style=\"color: red\">Employee data inserted</span>");
			out.print("</BODY>");
			out.print("</HTML>");
		} else {
			out.print("<HTML>");
			out.print("<BODY>");
			out.print("<h1><span style=\"color: red\">Employee data is not inserted</span>");
			out.print("</BODY>");
			out.print("</HTML>");

		}

	}

}
