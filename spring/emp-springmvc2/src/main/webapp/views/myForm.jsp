<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
${msg}
<form action="./login" method="post">
userid:<input type="text" name="userid"/>
password:<input type="password" name="password"/>
<input type="submit"/>
</form>
</body>
</html>