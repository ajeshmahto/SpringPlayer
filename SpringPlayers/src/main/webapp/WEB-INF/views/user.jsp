<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
	
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!-- <link rel="stylesheet"	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css"> -->

	
	<style type="text/css">@import url("<c:url value="/resources/css/main.css"/>");</style>
<title>Products</title>
</head>
<body>
	<section>

				<h1>Users</h1>

	</section>
	<div id="global">
	<section class="container" >

	
		<div class="row">
		<div class="col-md-5">
	<!-- <img src="<c:url value="/resource/images/${product.productId}.png"></c:url>" alt="image"  style = "width:100%"/> -->
</div>
		
			<div>
				<h3>${user.firstName}</h3>
				<p>${user.lastName}</p>
				<p>
					<strong>ID : </strong><span >${user.id}</span>
				</p>
				<p>
					<strong>First Name</strong> : ${user.firstName}
				</p>
				
				<p>
					<strong>Last Name</strong> : ${user.lastName}
				</p>
				<p>
					<strong>Email</strong> : ${user.email}
				</p>
				<p>
					<strong>Phone</strong> : ${user.phone}
				</p>
			
				

 <a href="<spring:url value="all" />" class="button">
						<span></span> back
					</a>

			

			</div>
		</div>
<!--/div-->
	</section>
	</div>
	
</body>
</html>
