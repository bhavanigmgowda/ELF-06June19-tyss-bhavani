package com.tyss.emp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/logedout")
public class LogoutServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession(false);
		if(session != null) {
			session.invalidate();
		}
		/*
		 * PrintWriter out = resp.getWriter();
		 * out.print("<h1 style=\"color:green\">Thanks for visiting</h1><br><br>");
		 */
		String message = "Thanks for logout";
		req.setAttribute("message", message);
		req.getRequestDispatcher("/login.jsp").forward(req, resp);
		
		/*
		 * RequestDispatcher disp = req.getRequestDispatcher("./Login.html");
		 * disp.include(req, resp);
		 */
	}
}
