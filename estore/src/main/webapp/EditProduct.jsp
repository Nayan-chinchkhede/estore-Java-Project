<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="com.Bean.ProductBean"%>
<%@ page import="com.Bean.AdminBean"%>

<!DOCTYPE html>
<html>

<head>

<meta charset="UTF-8">
<title>Update Product</title>

<link rel="stylesheet" href="style.css">

<link rel="stylesheet"
href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css">

</head>


<body class="update-body">


<%

AdminBean abean=(AdminBean)session.getAttribute("AdminBean");

ProductBean pb=(ProductBean)request.getAttribute("pbean");

%>



<div class="update-card">


<div class="update-icon">
<i class="fa-solid fa-pen-to-square"></i>
</div>


<h1>Update Product</h1>


<p>
Hello <%=abean.getAfname()%>, Edit Product Details
</p>



<form action="update" method="post">



<div class="update-input">

<i class="fa-solid fa-indian-rupee-sign"></i>

<input type="text" 
name="pprice"
value="<%=pb.getpPrice()%>"
placeholder="Product Price">

</div>



<div class="update-input">

<i class="fa-solid fa-layer-group"></i>

<input type="text"
name="pqty"
value="<%=pb.getpQty()%>"
placeholder="Product Quantity">

</div>



<input type="hidden" 
name="pcode"
value="<%=pb.getpCode()%>">



<button class="update-btn">

<i class="fa-solid fa-rotate"></i>

Update Product

</button>



</form>


</div>


</body>

</html>