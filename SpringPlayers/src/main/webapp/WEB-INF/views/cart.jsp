<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
<!--[if lt IE 9]>
<script src="//html5shiv.googlecode.com/svn/trunk/html5.js"></script>
<![endif]-->
<script src="<spring:url value="/resources/js/cart.js" />"></script>
</head>
<body>
<div class="CSSTableGenerator" style="width: 600px; height: 150px;">
	
<table>
<tr>
    <td>Id</td>
	<td>ProductId</td>
    <td>ProductName</td>
    <td>Product Description</td>
    <td>Product Price</td>
    <td>Remove</td>
</tr>
  <c:set var="total" value="0"/>

 <c:forEach items="${cartItems}" var="cart">
    <tr>
    <td>${cart.id}</td>
    <td>${cart.productId}</td>
    <td>${cart.id}</td>
    <td>${cart.id}</td>
    <td>${cart.total}</td>
   
     <c:set var="total" value="${total + cart.total}" />    
        
       <td>
        <a href="#" onclick="removeFromCart('${cart.id}')">Remove</a>
        </td>
        
    </tr>
</c:forEach>


</table>


<br>
<p style="text-align:center;text-color:red"> Total : ${total} </p>
<br>
<br>
<input type="submit"  value="CheckOut"/>
</div>
</body>
</html>