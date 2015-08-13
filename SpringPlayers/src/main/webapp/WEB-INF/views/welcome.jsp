<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Welcome</title>

<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
<!--[if lt IE 9]>
<script src="//html5shiv.googlecode.com/svn/trunk/html5.js"></script>
<![endif]-->
<script src="<spring:url value="/resources/js/cart.js" />"></script>
</head>
<body>

	<div id='cssmenu'>
		<ul>
			<li><a href='#'><span>Category</span></a></li>
			<c:forEach items="${categories}" var="category">


				<spring:url value="Category/productCategory/{id}" var="show">
					<spring:param name="id" value="${category.id}" />
				</spring:url>

				<li><a href="${show}"><span>${category.categoryName}</span></a></li>
			</c:forEach>
		</ul>
	</div>
	
	<!-- Content -->
	<section id="wrapper">
	 
		<div id="container">
		<c:forEach items="${products}" var="product">
			<div class="grid">
				<div class="imgholder">
					<!-- <img
						src="http://www.inwebson.com/demo/blocksit-js/demo2/images/img27.jpg" /> -->
						
						<img src="<c:url value="/resources/images/${product.productID}.png"></c:url>" alt="image" />
				</div>
				<strong>${product.name}</strong>
				<p>${product.details}</p>
				<!-- <p> <a href="#" >Edit|</a> <a href="#">Delete</a></p> -->
				<a href="#" onclick="addToCart('${product.id}')">Add to Cart</a>
				<div class="meta"></div>
			</div>
      </c:forEach> 
		</div>
	
	</section>

</body>
</html>
