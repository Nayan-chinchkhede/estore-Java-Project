<%@page import="com.Bean.AdminBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>

<head>

<meta charset="UTF-8">
<title>Delete Product</title>

<link rel="stylesheet" href="style.css">

<link rel="stylesheet"
href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css">

</head>


<body class="delete-body">


<%

AdminBean abean=(AdminBean)session.getAttribute("AdminBean");

String data=(String)request.getAttribute("data");

%>



<div class="delete-card">


<div class="delete-icon">

<i class="fa-solid fa-trash-can"></i>

</div>



<h1>Product Deleted</h1>



<p>
Hello <%=abean.getAlname()%>
</p>



<p>
<%=data%>
</p>




<a href="View1">

<button class="view-delete-btn">

<i class="fa-solid fa-box"></i>

View Product

</button>

</a>




<a href="AddProduct.html">

<button class="add-delete-btn">

<i class="fa-solid fa-plus"></i>

Add Product

</button>

</a>




<a href="Logout">

<button class="logout-delete-btn">

<i class="fa-solid fa-right-from-bracket"></i>

Logout

</button>

</a>


</div>



</body>

</html>