package com.tyss.mywebapp.servlets;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lombok.extern.java.Log;
  @Log
public class MyFirstServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
				String currentDateTime = new Date().toString();
				String fnameValue=req.getParameter("fname");
				String lnameValue=req.getParameter("lname");
				String httpMethod=req.getMethod();
				String httpPro=req.getProtocol();
				String reqest=req.getRequestURL().toString();
				
				log.info(httpMethod);
				log.info(httpPro);
				log.info(reqest);
				String htmlResponse = "<!DOCTYPE html>"+
						"<html>"+
						"<head>"+
						"<meta charset=\"ISO-8859-1\">"+
						"<title>My First HTML</title> "+
						"</head> "+
						"<body>"+
						"	<h1>Current Date and time is :"+
						"	<br>"+
						"		<span style=\"color: red\">"+currentDateTime+"</span>  "+
						"<BR><BR>"+
						"First Name:"+fnameValue+
						"<BR><BR>"+
						"last Name:"+lnameValue+
						"	</h1> "+
						"</body> "+
						"</html>";
				//Send to browser
				resp.setContentType("");
				//resp.setHeader("Refresh", "1");
				PrintWriter out = resp.getWriter();
				out.print(htmlResponse);
		

	}
}