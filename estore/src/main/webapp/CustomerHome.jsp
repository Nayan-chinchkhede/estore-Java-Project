<%@page import="com.Bean.CustomerBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>

<title>Customer Dashboard</title>

<style>

*{
    margin:0;
    padding:0;
    box-sizing:border-box;
    font-family:'Segoe UI',sans-serif;
}


body{

    min-height:100vh;
    background:linear-gradient(135deg,#141e30,#243b55);

}


/* Navbar */

.navbar{

    height:90px;
    background:rgba(255,255,255,0.95);
    display:flex;
    align-items:center;
    justify-content:space-between;
    padding:0 60px;
    box-shadow:0 10px 30px rgba(0,0,0,0.3);

}


.logo{

    font-size:35px;
    font-weight:800;
    color:#ff6b00;

}


.logo span{

    color:#333;

}



.logout a{

    text-decoration:none;
    background:#ff4757;
    color:white;
    padding:14px 35px;
    border-radius:30px;
    font-size:18px;
    transition:.4s;

}


.logout a:hover{

    background:#c0392b;
    transform:scale(1.1);

}



/* Welcome Section */


.main{

    text-align:center;
    color:white;
    margin-top:70px;

}


.main h1{

    font-size:45px;
    letter-spacing:1px;

}


.main p{

    font-size:22px;
    margin-top:15px;
    color:#ddd;

}



/* Cards */


.container{

    display:flex;
    justify-content:center;
    gap:40px;
    margin-top:60px;

}


.box{

    width:300px;
    height:220px;
    background:rgba(255,255,255,0.15);
    backdrop-filter:blur(15px);
    border-radius:25px;
    padding:35px;
    text-align:center;
    color:white;
    box-shadow:0 20px 40px rgba(0,0,0,0.3);
    transition:.5s;

}


.box:hover{

    transform:translateY(-15px);

}


.icon{

    font-size:60px;

}


.box h2{

    margin:20px;

}



.btn{

    display:inline-block;
    padding:12px 35px;
    border-radius:30px;
    background:#ff6b00;
    color:white;
    text-decoration:none;
    font-size:17px;
    font-weight:bold;

}


.btn:hover{

    background:#ff8500;

}



.footer{

    margin-top:70px;
    text-align:center;
    color:#ccc;
    font-size:16px;

}



</style>


</head>


<body>



<div class="navbar">

<div class="logo">
🛒 <span>E-STORE</span>
</div>


<div class="logout">

<a href="Logout">
Logout
</a>

</div>

</div>



<div class="main">

<h1>

<%

CustomerBean bbean=(CustomerBean)session.getAttribute("CustomerBean");

if(bbean!=null)
{
    out.println("Welcome, "+bbean.getUfname());
}
else
{
    response.sendRedirect("CustomerLogin.html");
    return;
}

%>

</h1>


<p>
Explore latest products at best prices
</p>


</div>



<div class="container">


<div class="box">

<div class="icon">
🛍️
</div>

<h2>
Products
</h2>

<a href="View2" class="btn">
View Product
</a>

</div>




<div class="box">

<div class="icon">
📦
</div>

<h2>
My Orders
</h2>


<a href="ViewOrdersServlet" class="btn">
View Orders
</a>
</div>




<div class="box">

<div class="icon">
👤
</div>

<h2>
Profile
</h2>

<a href="#" class="btn">
My Profile
</a>

</div>


</div>



<div class="footer">

© 2026 E-Store | Online Shopping System

</div>


</body>
</html>