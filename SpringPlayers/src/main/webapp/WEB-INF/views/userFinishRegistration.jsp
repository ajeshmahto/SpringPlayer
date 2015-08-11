<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
	
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!-- <link rel="stylesheet"	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css"> -->

	
	<style type="text/css">@import url("<c:url value="/resources/css/main.css"/>");</style>
<title>Users</title>
</head>
<body>

	<div id="global">
	<section class="container" >

	
		<div class="row">
		<div class="col-md-5">
	<!-- <img src="<c:url value="/resource/images/${product.productId}.png"></c:url>" alt="image"  style = "width:100%"/> -->
</div>
		
			<div>
				<h1>you have been registered successfully </h1><br /><br /><br />
	
			
				

 <a href="<spring:url value="/" />" class="button">
						<span></span> Home Page
					</a>

			

			</div>
		</div>
<!--/div-->
	</section>
	</div>
	
</body>
</html>
