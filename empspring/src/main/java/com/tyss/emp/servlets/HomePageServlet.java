package com.tyss.emp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.tyss.emp.dao.EmployeeDAOFactory;
import com.tyss.emp.dto.EmployeeInfoBean;
import com.mysql.cj.Session;
import com.tyss.emp.dao.EmployeeDAO;

import lombok.extern.java.Log;

@WebServlet("/login")
@Log
public class HomePageServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
	throws ServletException, IOException {
		if (req.getCookies() == null) {
			req.getRequestDispatcher("cookiesDisabled.html").include(req, resp);
			return;
		}

		EmployeeDAO dao = EmployeeDAOFactory.getinstance();
		EmployeeInfoBean bean = dao.getEmployeeInfo(req.getParameter("id"));
		if (bean.getPassword() == null) {
			resp.sendRedirect("./login.jsp?error=invalid");
		} else if (bean.getPassword().equals(req.getParameter("password"))) {
			HttpSession session = req.getSession(true);
			session.setAttribute("data", bean);
			Cookie cookie = new Cookie("JSESSION", session.getId());
			cookie.setMaxAge(7 * 24 * 60);
			resp.addCookie(cookie);
			RequestDispatcher dispatcher = req.getRequestDispatcher("./HomeJSP.jsp");
			dispatcher.forward(req, resp);

		} else {
			resp.sendRedirect("./login.jsp?error=invalid");
			
		}
	}
}
