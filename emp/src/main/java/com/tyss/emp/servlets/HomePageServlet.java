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
import com.tyss.emp.dao.EmployeeInfoBean;
import com.mysql.cj.Session;
import com.tyss.emp.dao.EmployeeDAO;

import lombok.extern.java.Log;

@WebServlet("/login")
@Log
public class HomePageServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		if(req.getCookies()==null) {
			req.getRequestDispatcher("cookiesDisabled.html").include(req, resp);
			return;
		}
		
		
		EmployeeDAO dao = EmployeeDAOFactory.getinstance();
			EmployeeInfoBean bean = dao.getEmployeeInfo(req.getParameter("id"));
			if(bean.getPassword() == null) {
				resp.sendRedirect("./login.html?error=invalid");
			} else if(bean.getPassword().equals(req.getParameter("password"))) {
				HttpSession session = req.getSession(true);
				session.setAttribute("data", bean);
				Cookie cookie=new Cookie("JSESSION",session.getId());
				cookie.setMaxAge(7*24*60);
				resp.addCookie(cookie);
				PrintWriter out = resp.getWriter();
					out.print("<html>");
					out.print("<head>");
					out.print("<meta charset='UTF-8'>");
					out.print("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
					out.print("<meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">");
					out.print("<title>Employee Management Portal</title>");
					out.print("<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">");
					out.print("<style>                     ");
					out.print(".nav {                      ");
					out.print("background-color: beige;    ");
					out.print("}                           ");
					out.print(".profile {                  ");
					out.print("height:50px;                ");
					out.print("width:20px;                 ");
					out.print("background-color: blueviolet");
					out.print("}                           ");
					out.print(".logout {                   ");
					out.print("font-size: 25px;            ");
					out.print("color: brown;               ");
					out.print("font-weight: 600;           ");
					out.print("                            ");
					out.print("}                           ");
					out.print(".search-button {border: none;background-color: beige;margin-top: -26px;margin-left: -60px;}");
					out.print(".employee-info {            ");
					out.print("border: 1px solid brown;    ");
					out.print("}                           ");
					out.print(".data-display {             ");
					out.print("font-size: 18px;            ");
					out.print("padding: 5px;               ");
					out.print("}                           ");
					out.print("</style>                    ");
					out.print("</head>                     ");
					out.print("<body>                      ");
					out.print("<div style=\"background-color: beige;\"> ");
					out.print("<h1 style=\"margin-left:35%\">Employee Management Portal</h1>                        ");
					out.print("<div class=\"row\" style=\"height:70px; padding: 20px;\">                              ");
					out.print("<div class=\"col-1 profile\"><span ></span></div>                                    ");
					out.print("<div class=\"col-5\"><span class=\"logout\">Edit</span></div>                          ");
					out.print("<div class=\"search col-2\"><form action=\"./search\"> <input type=\"text\" placeholder=\"Search\" name=\"search\"/></form></div>         ");
					out.print("<div class=\"col-3\"><a href=\"./logedout\"><span class=\"logout\" style=\"margin-left: 70%;\">Logout</span></a></div> ");
					out.print("</div>     ");
					out.print("</div>     ");
					out.print("<br><br>   ");
					out.print("<div class=\"employee-info container\">            ");
					out.print("<div class=\"data-display\">ID: "+bean.getId()+ "</div>");
					out.print("<div class=\"data-display\">Name: "+bean.getName()+" </div>           ");
					out.print("<div class=\"data-display\">Account Number: "+bean.getAccountNumber()+ "</div> ");
					out.print("<div class=\"data-display\">Email Id: "+bean.getEmail()+" </div>       ");
					out.print("<div class=\"data-display\">Age: "+bean.getAge()+" </div>            ");
					out.print("<div class=\"data-display\">Designation: "+bean.getDesignation()+" </div>    ");
					out.print("<div class=\"data-display\">Department Id: "+bean.getDepartmentId()+" </div>  ");
					out.print("<div class=\"data-display\">Manager Id: "+bean.getManagerId()+"</div>     ");
					out.print("<div class=\"data-display\">Phone: "+bean.getPhnum()+"</div>          ");
					out.print("<div class=\"data-display\">Gender: "+bean.getGender()+" </div>         ");
					out.print("<div class=\"data-display\">Date of birth: "+bean.getDob()+" </div>  ");
					out.print("<div class=\"data-display\">Date of Joining: "+bean.getJoiningDate()+" </div>");
					out.print("<div class=\"data-display\">Salary: "+bean.getSalary()+" </div>   ");
					out.print("</div> ");
					out.print("</body>");
					out.print("</html>");
			} else {
				resp.sendRedirect("http://localhost/emp/login.html?error=invalid");
			}
	}
}
