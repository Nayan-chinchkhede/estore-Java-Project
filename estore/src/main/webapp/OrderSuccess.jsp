<%@ page import="com.Bean.CustomerBean"%>
<%@ page import="com.Bean.ProductBean"%>

<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>

<head>

<meta charset="UTF-8">

<title>Order Success</title>


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


/* Header */

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



/* Success Card */

.success-box{

    width:500px;
    background:white;
    margin:70px auto;
    padding:40px;
    border-radius:25px;
    text-align:center;
    box-shadow:0px 10px 30px rgba(0,0,0,0.2);

}



.icon{

    font-size:80px;
    margin-bottom:20px;

}



h1{

    color:#2e7d32;
    margin-bottom:20px;

}



.message{

    font-size:20px;
    color:#555;
    line-height:35px;

}



.amount{

    font-size:35px;
    color:#2874f0;
    font-weight:bold;

}



.btn{

    display:inline-block;
    margin-top:30px;
    padding:15px 45px;
    background:#2874f0;
    color:white;
    text-decoration:none;
    border-radius:30px;
    font-size:18px;
    font-weight:bold;

}



.btn:hover{

    background:#1255c4;

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




<%

CustomerBean cb =
(CustomerBean)session.getAttribute("CustomerBean");


ProductBean pb =
(ProductBean)session.getAttribute("product");



if(cb != null && pb != null)

{

%>




<div class="success-box">



<div class="icon">

✅

</div>




<h1>

Order Placed Successfully

</h1>




<div class="message">


Hello 
<b>
<%=cb.getUfname()%>
</b>


<br><br>


Your order has been confirmed.


<br>


You have been charged:


<br><br>



<div class="amount">

₹ <%=pb.getpPrice()%>

</div>



</div>





<a class="btn" href="View2">

🛒 Continue Shopping

</a>



</div>




<%

}

else

{

%>


<h2 style="text-align:center;margin-top:50px;">

Order Data Not Found

</h2>


<%

}

%>




</body>

</html>