<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
</head>




	<section id="wrapper">

	<div id="container">
		<c:forEach items="${products}" var="product">
			<div class="grid">
				<div class="imgholder">
					<img
						src="http://www.inwebson.com/demo/blocksit-js/demo2/images/img27.jpg" />
				</div>
				<strong>${product.name}</strong>
				<p>${product.details}</p>
				<p>
					<a href="#">Edit|</a> <a href="#">Delete</a>
				</p>
				<a href="#">Add to Cart</a>
				<div class="meta"></div>
			</div>
		</c:forEach>
	</div>

	</section>
	
	<section>
		<div class="jumbotron">
			<div class="container">
				<h1 class="alert alert-danger"> ${invalidCategoryId}</h1>
			</div>
		</div>
	</section>
	