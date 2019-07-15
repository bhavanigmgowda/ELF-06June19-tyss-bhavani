package com.tyss.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/cookie")
public class CreateCookiesServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//Create a cookie
		Cookie myNameCookie=new Cookie("myName", "bhavani");
		Cookie myLoc=new Cookie("myLocation", "mysore");

		//send the about Cookie to Browser
		resp.addCookie(myNameCookie);
		resp.addCookie(myLoc);

		PrintWriter out=resp.getWriter();
		out.print("created the cookie!!!");
	}

}
