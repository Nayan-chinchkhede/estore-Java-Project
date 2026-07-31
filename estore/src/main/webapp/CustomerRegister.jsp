<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
String msgg = (String)request.getAttribute("msgg");
if(msgg != null){
%>

<h3 style="color:green;"><%= msgg %></h3>

<%
}
%>
</body>
</html>