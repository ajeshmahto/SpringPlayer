<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>

<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
<!--[if lt IE 9]>
<script src="//html5shiv.googlecode.com/svn/trunk/html5.js"></script>
<![endif]-->
<script src="<spring:url value="/resources/js/cart.js" />"></script>


</head>
<body>

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