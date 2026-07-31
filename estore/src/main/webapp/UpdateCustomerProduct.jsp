<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<center>
		<%
		  String data =(String)request.getAttribute("data");
		if(data != null)
		{
			out.println(data +"<br><br>");
			
		}
		%>
	<a href="View2">View all customer productss</a><br><br>
	<a href="CustomerHome.jsp">Customer Home</a><br><br>
	
</body>
</html>