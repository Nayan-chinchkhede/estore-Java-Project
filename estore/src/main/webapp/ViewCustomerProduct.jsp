<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.Bean.ProductBean"%>
<%@page import="com.Bean.CustomerBean"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>View Products</title>

<style>

*{
    margin:0;
    padding:0;
    box-sizing:border-box;
    font-family:'Segoe UI',sans-serif;
}

body{
    background:#f1f3f6;
}


.header{

    height:80px;
    background:#2874f0;
    color:white;
    display:flex;
    justify-content:space-between;
    align-items:center;
    padding:0 50px;

}

.logo{

    font-size:32px;
    font-weight:bold;

}


.home{

    text-decoration:none;
    background:white;
    color:#2874f0;
    padding:12px 30px;
    border-radius:25px;
    font-weight:bold;

}


h1{

    text-align:center;
    margin:40px;
    color:#333;

}


.products{

    display:flex;
    justify-content:center;
    flex-wrap:wrap;
    gap:30px;

}



.card{

    width:300px;
    background:white;
    padding:25px;
    text-align:center;
    border-radius:20px;
    box-shadow:0px 10px 25px rgba(0,0,0,0.2);
    transition:0.4s;

}


.card:hover{

    transform:translateY(-10px);

}



.image img{

    width:200px;
    height:160px;
    object-fit:contain;
    border-radius:15px;

}



.card h2{

    margin:15px;
    color:#333;

}


.info{

    font-size:17px;
    line-height:30px;
    color:#555;

}


.price{

    color:#2e7d32;
    font-size:25px;
    font-weight:bold;

}



.buy{

    display:inline-block;
    margin-top:20px;
    background:#ff9f00;
    color:white;
    padding:12px 40px;
    border-radius:30px;
    text-decoration:none;
    font-weight:bold;

}


.buy:hover{

    background:#fb641b;

}

</style>

</head>


<body>


<div class="header">

<div class="logo">
🛒 E-STORE
</div>


<a class="home" href="CustomerHome.jsp">
Home
</a>


</div>



<h1>
Available Products
</h1>



<div class="products">


<%

CustomerBean bbean =
(CustomerBean)session.getAttribute("CustomerBean");


ArrayList<ProductBean> al =
(ArrayList<ProductBean>)session.getAttribute("productlist");



if(al==null || al.size()==0)
{

out.println("<h2>Product Data Not Available</h2>");

}

else
{


Iterator<ProductBean> i = al.iterator();


while(i.hasNext())
{

ProductBean pb = i.next();


// NULL PRODUCT REMOVE

if(pb.getpCode()==null || pb.getpName()==null)
{
    continue;
}



String image="product.jpg";


if(pb.getpName().equalsIgnoreCase("laptop"))
{
    image="laptop.png";
}

else if(pb.getpName().equalsIgnoreCase("mobile"))
{
    image="mobile.jpg";
}

else if(pb.getpName().equalsIgnoreCase("computer"))
{
    image="computer.jpg";
}


%>



<div class="card">


<div class="image">

<img src="<%=request.getContextPath()%>/<%=image%>">

</div>



<h2>
<%=pb.getpName()%>
</h2>



<div class="info">


Company :
<%=pb.getpCompany()%>


<br>


Quantity :
<%=pb.getpQty()%>



<div class="price">

₹ <%=pb.getpPrice()%>

</div>


</div>



<a class="buy"
href="Buy?pcode=<%=pb.getpCode()%>">

Buy Now

</a>


</div>



<%

}

}

%>


</div>


</body>
</html>