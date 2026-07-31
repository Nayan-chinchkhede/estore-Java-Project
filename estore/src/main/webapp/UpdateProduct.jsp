<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>

<head>

<meta charset="UTF-8">
<title>Update Status</title>

<link rel="stylesheet" href="style.css">

<link rel="stylesheet"
href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css">

</head>


<body class="success-body">


<div class="success-card">


<div class="success-icon">

<i class="fa-solid fa-circle-check"></i>

</div>


<h1>Success</h1>


<%
String data=(String)request.getAttribute("data");

if(data!=null)
{
%>

<p>
<%=data%>
</p>

<%
}
%>



<a href="View1">

<button class="success-btn">

<i class="fa-solid fa-box"></i>

View All Products

</button>

</a>




<a href="AdminHome.jsp">

<button class="home-btn">

<i class="fa-solid fa-house"></i>

Admin Home

</button>

</a>


</div>


</body>

</html>