<%@page import="com.tyss.employee.dto.UserBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%UserBean bean=(UserBean)request.getAttribute("userBean"); %>
UserID=<%=bean.getUserID() %>
Password=<%=bean.getPassword() %>
</body>
</html>