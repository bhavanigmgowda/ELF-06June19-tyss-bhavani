package com.tyss.emp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.tyss.emp.dao.EmployeeDAO;
import com.tyss.emp.dao.EmployeeDAOFactory;
import com.tyss.emp.dto.EmployeeInfoBean;

@WebServlet("/result")

public class SearchedEmployeeDetailsServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession(false);
		if (session == null) {
			RequestDispatcher disp = req.getRequestDispatcher("./login.html");
			disp.include(req, resp);
		} else {
			EmployeeDAO dao = EmployeeDAOFactory.getinstance();
			EmployeeInfoBean bean = dao.getEmployeeInfo(req.getParameter("id"));
			PrintWriter out = resp.getWriter();
			if (bean != null) {
				RequestDispatcher disp = req.getRequestDispatcher("./HomeJSP.jsp");
				disp.include(req, resp);
			}
		}
	}

}
