<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
11111111111111111111111111111111111<br>
<jsp:include page="index.html"/>
<br>
22222222222222222222222222222222<br>
<jsp:include page="currentDate"/>
<br>
333333333333333333333333333333333<br>
<br>
<jsp:include page="currentDate">
<jsp:param value="pa" name="fname"/>
<jsp:param value="abc" name="lname"/>
</jsp:include><br>
<%-- 444444444444444444444444444444444444
<jsp:include page="currentDateJSP"/>

 --%>
</body>
</html>