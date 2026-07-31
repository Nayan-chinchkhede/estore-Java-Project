<%@page import="com.Bean.AdminBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>

<title>Admin Dashboard</title>

<link rel="stylesheet" href="style.css">

<link rel="stylesheet"
href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css">

</head>

<body class="admin-body">


<%
AdminBean abean=(AdminBean)session.getAttribute("AdminBean");
%>


<div class="admin-navbar">

<h2>
<i class="fa-solid fa-cart-shopping"></i>
E-STORE ADMIN
</h2>

<a href="Logout">
<i class="fa-solid fa-power-off"></i>
Logout
</a>

</div>



<div class="dashboard">


<div class="welcome-box">

<h1>
Welcome Mr. <%=abean.getAfname()%>
</h1>

<p>Manage your online store from here</p>

</div>



<div class="admin-cards">


<div class="admin-card">

<i class="fa-solid fa-square-plus"></i>

<h2>Add Product</h2>

<p>Add new products to your store</p>


<a href="AddProduct.html">

<button class="add-btn">
Add Product
</button>

</a>

</div>




<div class="admin-card">

<i class="fa-solid fa-box-open"></i>

<h2>View Product</h2>

<p>View all available products</p>


<a href="View1">

<button class="view-btn">
View Product
</button>

</a>

</div>




<div class="admin-card">

<i class="fa-solid fa-right-from-bracket"></i>

<h2>Logout</h2>

<p>Logout from admin account</p>


<a href="Logout">

<button class="logout-btn">
Logout
</button>

</a>

</div>



</div>

</div>


</body>
</html>