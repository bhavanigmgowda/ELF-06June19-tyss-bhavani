<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.tyss.emp.dto.EmployeeInfoBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta charset='UTF-8'>
<meta name="viewport" content="width=device-width,
initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Employee Management Portal</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<style>
.nav {
	background-color: beige;
}

.profile {
	height: 50px;
	width: 20px;
	background-color: blueviolet
}

.logout {
	font-size: 25px;
	color: brown;
	font-weight: 600;
}

.employee-info {
	border: 1px solid brown;
}

.data-display {
	font-size: 18px;
	padding: 5px;
}
</style>
</head>
<body>
	<div style="background-color: beige;">
		<h1 style="margin-left: 35%">Employee Management Portal</h1>
		<div class="row" style="height: 70px; padding: 20px;">
			<div class="col-1profile">
				<a href='../validate1/profile'><span></span></a>
			</div>
			<div class="col-5">
				<span class="logout">Edit</span>
			</div>
			<div class="searchcol-2">
				<form action="../../validator/validate/employee/search">
					<input type="text" placeholder="Search" name="search" />
			</div>
			</form>
			<div class="col-3">
				<a href="../logout"><span class="logout"
					style="margin-left: 70%;">Logout</span></a>
			</div>
		</div>
	</div>
	<br>
	<br>
	<div class="employee-infocontainer">
		<%
			List<EmployeeInfoBean> bean = (List<EmployeeInfoBean>) request.getAttribute("bean");
			if (!bean.isEmpty()) {
				for (EmployeeInfoBean b : bean) {
		%>
		<div class="data-display">
			<a
				href="../../validator/validate/employee/selected?id=<%=b.getId()%>"><%=b.getName()%>
			</a>
		</div>
		<%
			}
			} else {
		%>
		<div class="data-display">No Result Found</div>
		<%} %>
	</div>
</body>
</html>