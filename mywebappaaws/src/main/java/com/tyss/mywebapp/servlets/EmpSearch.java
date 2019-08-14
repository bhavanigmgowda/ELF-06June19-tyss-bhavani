package com.tyss.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tyss.mywebapp.bean.EmployeeInfoBean;
import com.tyss.mywebapp.dao.EmployeeDAO;
import com.tyss.mywebapp.dao.EmployeeDAOFactory;
@WebServlet("/search")
public class EmpSearch extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String idValue = req.getParameter("id");
		
		EmployeeDAO dao = EmployeeDAOFactory.getinstance();
		EmployeeInfoBean bean = dao.getEmployeeInfo(idValue);
		
		PrintWriter out=resp.getWriter();
		
		if(bean==null) {
			out.print("<HTML>");
			out.print("<BODY>");
			out.print("<h1><span style=\"color: red\">Employee not Found!!!</span>");
			out.print("</BODY>");
			out.print("</HTML>");
		}
		else {
			out.print("<HTML>");
			out.print("<BODY>");
			out.print("<h1><span style=\"color: red\">Employee Found!!!</span>");
			out.print("<br>ID="+bean.getId());
			out.print("<br>Name="+bean.getName());
			out.print("<br>MGRID="+bean.getManagerId());
			out.print("<br>phnum="+bean.getPhnum());
			out.print("<br>salary="+bean.getSalary());
			out.print("<br>Email="+bean.getEmail());
			out.print("<br> Gender="+bean.getGender());
			out.print("<br>Designation="+bean.getDesignation());
			out.print("<br>DepartmentId="+bean.getDepartmentId());
			out.print("<br>Age="+bean.getAge());
			out.print("<br>AccountNumber="+bean.getAccountNumber());
			out.print("</BODY>");
			out.print("</HTML>");
		}
	}
}
