package com.tyss.emp.servlets;

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

import com.tyss.emp.dao.EmployeeDAO;
import com.tyss.emp.dao.EmployeeDAOFactory;
import com.tyss.emp.dto.EmployeeInfoBean;
import com.tyss.emp.dto.EmployeeOtherInfoBean;

import lombok.extern.java.Log;

@WebServlet("/save")
@Log
public class SaveEmployeeServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		EmployeeDAO dao = EmployeeDAOFactory.getinstance();
		EmployeeInfoBean bean = new EmployeeInfoBean();
		EmployeeOtherInfoBean infoBean =new EmployeeOtherInfoBean();
		bean.setId(Integer.parseInt(req.getParameter("id")));
		bean.setName(req.getParameter("name"));
		bean.setAccountNumber(Integer.parseInt(req.getParameter("accnumber")));
		bean.setEmail(req.getParameter("email"));
		bean.setAge(Integer.parseInt(req.getParameter("age")));
		bean.setDesignation(req.getParameter("designation"));
		bean.setGender(req.getParameter("gender"));
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		try {
			bean.setDob(formatter.parse(req.getParameter("dob")));
			bean.setJoiningDate(formatter.parse(req.getParameter("doj")));

		} catch (ParseException e) {
			e.printStackTrace();
		}
		bean.setSalary(Double.parseDouble(req.getParameter("salary")));
		bean.setDepartmentId(Integer.parseInt(req.getParameter("deptid")));
		bean.setPhnum(Integer.parseInt(req.getParameter("phnum")));
		bean.setManagerId(Integer.parseInt(req.getParameter("mgrid")));
		bean.setPassword(req.getParameter("password"));
		
	
	
		infoBean.setAdhar(Integer.parseInt(req.getParameter("anum")));
		infoBean.setBloodGroup(req.getParameter("bgroup"));
		infoBean.setEmergencyContactName(req.getParameter("ecname"));
		infoBean.setEmergencyContactNumber(Integer.parseInt(req.getParameter("ecnum")));
		infoBean.setFatherNm(req.getParameter("fname"));
		infoBean.setId(Integer.parseInt(req.getParameter("id")));
		infoBean.setIsChallenged(req.getParameter("pchal"));
		infoBean.setIsMarried(req.getParameter("mstatus"));
		infoBean.setMotherNm(req.getParameter("mname"));
		infoBean.setNationality(req.getParameter("nationality"));
		infoBean.setPan(Integer.parseInt(req.getParameter("pan")));
		infoBean.setPassport(Integer.parseInt(req.getParameter("pnum")));
		infoBean.setReligion(req.getParameter("reg"));
		infoBean.setSpouseNm(req.getParameter("sname"));
		bean.setOtherInfo(infoBean);
		boolean isInserted = dao.createEmployeeInfo(bean);
		if (isInserted) {
			String message = "Account Created";
			req.setAttribute("message", message);
			req.getRequestDispatcher("/login.jsp").forward(req, resp);
			
			/*
			 * PrintWriter out = resp.getWriter();
			 * out.print("<h1 style=\"margin-left:35%\">Account Created</h1>");
			 */
		}

	}
}
