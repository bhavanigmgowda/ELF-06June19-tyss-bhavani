package com.tyss.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tyss.mywebapp.bean.DepartmentInfoBean;
import com.tyss.mywebapp.bean.EmployeeInfoBean;
import com.tyss.mywebapp.util.HibernatUtil;

import lombok.extern.java.Log;
@WebServlet("/saveDept")
@Log
public class CreateDeptServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		DepartmentInfoBean bean = new DepartmentInfoBean();
		bean.setDeptId(Integer.parseInt(req.getParameter("deptId")));
		bean.setDeptName((req.getParameter("deptName")));

		PrintWriter out = resp.getWriter();
		boolean res = saveOrUpdate(bean);

		if (res) {
			out.print("<HTML>");
			out.print("<BODY>");
			out.print("<h1><span style=\"color: red\">Employee data inserted</span>");
			out.print("</BODY>");
			out.print("</HTML>");
		} else {
			out.print("<HTML>");
			out.print("<BODY>");
			out.print("<h1><span style=\"color: red\">Employee data is not inserted</span>");
			out.print("</BODY>");
			out.print("</HTML>");

		}
	}

	private boolean saveOrUpdate(DepartmentInfoBean bean) {
		Transaction txn = null;
		try {

			Configuration cfg = new Configuration();
			cfg.configure();
			cfg.addAnnotatedClass(DepartmentInfoBean.class);

			SessionFactory factory = cfg.buildSessionFactory();
			Session session = factory.openSession();

			txn = session.beginTransaction();
			session.saveOrUpdate(bean);
			txn.commit();
			return true;
		} catch (Exception e) {

			log.info(Arrays.toString(e.getStackTrace()));
			if (txn != null) {
				txn.rollback();
			}
			return false;
		}
	}
}
