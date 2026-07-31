<%@page import="java.util.ArrayList"%>
<%@page import="com.Bean.orderBean"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>

<title>My Orders</title>

<style>

body{
    margin:0;
    padding:0;
    font-family:'Segoe UI',sans-serif;
    background:#f4f6f9;
}


.container{

    width:85%;
    margin:40px auto;

}


h1{

    text-align:center;
    color:#333;

}


.order-card{

    background:white;
    padding:25px;
    margin:20px 0;
    border-radius:12px;
    box-shadow:0px 5px 15px #bbb;

}


.order-card h3{

    margin:12px;
    color:#444;

}


.status{

    color:green;
    font-weight:bold;

}


.btn{

    display:inline-block;
    padding:12px 25px;
    background:#007bff;
    color:white;
    text-decoration:none;
    border-radius:6px;

}


.btn:hover{

    background:#0056b3;

}


</style>

</head>


<body>


<div class="container">


<h1>📦 My Orders</h1>


<%

ArrayList<orderBean> list =
(ArrayList<orderBean>)request.getAttribute("orders");


if(list != null && !list.isEmpty())
{

    for(orderBean ob : list)
    {

%>


<div class="order-card">


<h3>
Order ID :
<%=ob.getOrderId()%>
</h3>


<h3>
Customer ID :
<%=ob.getCustId()%>
</h3>


<h3>
Product Code :
<%=ob.getPcode()%>
</h3>


<h3>
Quantity :
<%=ob.getQty()%>
</h3>


<h3>
Amount :
₹ <%=ob.getAmount()%>
</h3>


<h3>
Order Date :
<%=ob.getDate()%>
</h3>


<h3 class="status">
Status : Order Confirmed
</h3>


</div>


<%

    }

}
else
{

%>


<div class="order-card">

<h2 style="text-align:center;color:red;">
No Orders Found
</h2>

</div>


<%

}

%>


<center>

<a href="ViewProductServlet" class="btn">
Continue Shopping
</a>

</center>


</div>


</body>
</html>