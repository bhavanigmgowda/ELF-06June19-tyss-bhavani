package com.tyss.emp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.jws.WebService;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/myGeneric")
public class MyGenericServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) 
			throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.print("<html>");
		out.print("<body>");
		out.print("<h1>");		
		out.print("Welcome to web page");		
		out.print("</h1>");		
		out.print("</body>");
		out.print("</html>");
	}

}
