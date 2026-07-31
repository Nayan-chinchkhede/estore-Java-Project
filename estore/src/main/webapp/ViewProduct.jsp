<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Iterator" %>
<%@ page import="com.Bean.ProductBean"%>
<%@ page import="com.Bean.AdminBean"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>View Product</title>


<link rel="stylesheet" href="style.css">


<link rel="stylesheet"
href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css">


</head>


<body class="view-body">


<%

AdminBean abean =
(AdminBean)session.getAttribute("AdminBean");


ArrayList<ProductBean> al =
(ArrayList<ProductBean>)session.getAttribute("productlist");


%>



<div class="view-navbar">


<h2>
<i class="fa-solid fa-cart-shopping"></i>
E-STORE PRODUCTS
</h2>


<a href="AdminHome.jsp">

<i class="fa-solid fa-house"></i>
Home

</a>


</div>




<div class="view-container">


<h1>
Product Details
</h1>


<p>
Manage your store products
</p>



<div class="table-box">


<table>


<tr>

<th>Product Code</th>
<th>Product Name</th>
<th>Company</th>
<th>Price</th>
<th>Quantity</th>
<th>Action</th>

</tr>



<%

if(al==null || al.size()==0)
{

%>


<tr>

<td colspan="6">

Product Data Not Available

</td>

</tr>


<%

}

else
{


Iterator<ProductBean> i=al.iterator();


while(i.hasNext())
{


ProductBean pb=i.next();


// NULL PRODUCT SKIP

if(pb.getpCode()==null || pb.getpName()==null)
{
    continue;
}


%>



<tr>


<td>
<%=pb.getpCode()%>
</td>



<td>
<%=pb.getpName()%>
</td>



<td>
<%=pb.getpCompany()%>
</td>



<td>
₹ <%=pb.getpPrice()%>
</td>



<td>
<%=pb.getpQty()%>
</td>




<td>


<a class="edit-btn"
href="edit?pcode=<%=pb.getpCode()%>">

<i class="fa-solid fa-pen"></i>
Edit

</a>



<a class="delete-btn"
href="Delete?pcode=<%=pb.getpCode()%>">

<i class="fa-solid fa-trash"></i>
Delete

</a>



</td>



</tr>



<%

}

}

%>



</table>


</div>


</div>


</body>
</html>