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
	<h1>
	  <%
	  String msg=(String)request.getParameter("msg");
	  response.sendError(HttpServletResponse.SC_BAD_REQUEST,msg);
	  %>
	  
	     <a href="AdminProduct.html">Add Product</a><br><br>
	     <a href="View1">View Product</a><br><br>
	     <a href="Logout">Logout</a><br><br>
	</h1>
	
</body>
</html>