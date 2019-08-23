<%!public String name = "abc";
	private int age = 20;

	public String getName() {
		return name;
	}

	public String getAge() {
		return name;
	}

	public String getName(String s) {
		return "Given Name is:-" + name;
	}%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>JSP Tags Example....</h1>
	<br>name1:<%=name %><br>
	<br>name2:<%=getName() %><br>
	<br>name3:<%=getName("xyz") %><br>
	<br>age1:<%=age %><br>
	<br>age2:<%=getAge() %><br>
	<br><br>
	<% for(int i=0;i<5;i++){
		%>		
			<br>name1:<%=name %><br>
	<%
	}
	%>
	
</body>
</html>