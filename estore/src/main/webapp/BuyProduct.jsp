<%@page import="com.Bean.ProductBean"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>Buy Product</title>


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



/* Main Card */

.buy-card{

    width:500px;
    background:white;
    margin:50px auto;
    padding:35px;
    border-radius:20px;
    box-shadow:0px 10px 30px rgba(0,0,0,0.2);
}



.title{

    text-align:center;
    font-size:30px;
    color:#333;
    margin-bottom:25px;

}



.product-icon{

    text-align:center;
    font-size:70px;

}




label{

    font-size:17px;
    font-weight:bold;
    color:#555;

}



input{

    width:100%;
    padding:12px;
    margin-top:8px;
    margin-bottom:15px;
    border-radius:10px;
    border:1px solid #ccc;
    font-size:16px;

}



input[readonly]{

    background:#f5f5f5;

}



.buy-btn{

    width:100%;
    padding:15px;
    background:#ff9f00;
    color:white;
    border:none;
    border-radius:30px;
    font-size:20px;
    font-weight:bold;
    cursor:pointer;

}



.buy-btn:hover{

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




<%

ProductBean pb = 
(ProductBean)session.getAttribute("product");


if(pb == null)
{
    out.println("<h2 style='text-align:center;'>Product data not found</h2>");
    return;
}

%>





<div class="buy-card">


<div class="product-icon">

📦

</div>



<div class="title">

Buy Product

</div>



<form action="ConfirmOrder" method="post">


<label>
Product Code
</label>

<input type="text" 
name="pcode"
value="<%=pb.getpCode()%>"
readonly>



<label>
Product Name
</label>

<input type="text"
name="pname"
value="<%=pb.getpName()%>"
readonly>




<label>
Company
</label>

<input type="text"
name="pcompany"
value="<%=pb.getpCompany()%>"
readonly>




<label>
Price
</label>

<input type="text"
name="pprice"
value="<%=pb.getpPrice()%>"
readonly>




<label>
Available Quantity
</label>

<input type="text"
name="pqty"
value="<%=pb.getpQty()%>"
readonly>




<label>
Enter Quantity
</label>

<input type="number"
name="reqqty"
min="1"
max="<%=pb.getpQty()%>"
required>



<input class="buy-btn"
type="submit"
value="🛒 Confirm Buy">


</form>


</div>



</body>
</html>