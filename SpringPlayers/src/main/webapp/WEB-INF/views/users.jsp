<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

	<style type="text/css">@import url("<c:url value="/resources/css/main.css"/>");</style>
<title>Users</title>
</head>
<body>
	
	<section>
		<div class="jumbotron">
			<div class="container">
				<h1>Users</h1>
				<p>All the Users</p>
			</div>
		</div>
	</section>

<div id="global">
	<section class="container">
		<div >
			<c:forEach items="${users}" var="user">
				<div  style="padding-bottom: 15px">
					<div >
					<!-- img src="<c:url value="/resource/images/${product.productId}.png"></c:url>" alt="image"  style = "width:100%"/-->
						<div class="caption">
						<h3>UserName is: ${user.user.username}</h3>
							<p>Name is: ${user.firstName}
							${user.lastName}</p>

							<p>
							 	<a
									href=" <spring:url value="/users/user?id=${user.id}"  /> "
									> <span/></span><span  class="button">Details</span> 
								</a>
								
							</p>

						</div>
					</div>
				</div>
			</c:forEach>
		</div>
	</section>
	</div>
</body>
</html>
