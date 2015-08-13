<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
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
<body>
	<div class="CSSTableGenerator" style="width: 600px; height: 150px;">

		<table>
			<tr>
				<td>CartId</td>
				<td>ProductId</td>
				<td>ProductName</td>
				<td>Product Description</td>
				<td>Product Price</td>
				<td>Remove</td>
			</tr>
			<c:set var="total" value="0" />

			<c:forEach items="${cartItems}" var="cart">
				<tr>
					<td>${cart.id}</td>
					<td>${cart.productImageId}</td>
					<td>${cart.productName}</td>
					
					<td>
					<div style="background-size: 80px 60px;" >
					<!-- <img
						src="http://www.inwebson.com/demo/blocksit-js/demo2/images/img27.jpg" /> -->
						
						<img src="<c:url value="/resources/images/${cart.productImageId}.png"></c:url>" alt="image" height="80" width="80" />
				    </div>
					${cart.productDescription}
					
					</td>
					<td>${cart.total}</td>

					<c:set var="total" value="${total + cart.total}" />

					<td><a href="#" onclick="removeFromCart('${cart.id}')">Remove</a>
					</td>

				</tr>
			</c:forEach>


		</table>


		<br>
		<h2 style="text-align: center; color: red">Total : ${total}</h2>
		<form  id="send" action="checkout"   method="get">
		 <input type="submit" value="CheckOut" />
		</form>
	</div>
</body>
</html>