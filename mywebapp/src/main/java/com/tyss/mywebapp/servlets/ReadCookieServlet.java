package com.tyss.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("readCookie")
public class ReadCookieServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//Get the Cookies from Request
		
		Cookie[] receCookies=req.getCookies();
		
		PrintWriter out=resp.getWriter();
		
		if(receCookies==null) {
			out.print("Cookies are not present!!!!");
		}else {
			out.print("Cookies are present!!!!");
			for(Cookie  rCookie:receCookies) {
				out.print("Cookie Name: "+rCookie.getName());
				out.print("Cookie Value: "+rCookie.getValue());
			}
		}
	}

}
