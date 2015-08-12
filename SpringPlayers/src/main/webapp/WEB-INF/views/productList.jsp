<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE HTML>
<html>
<head>
<title>Product List</title>
<!-- <style type="text/css">@import url("<spring:url value="/css/main.css"/>");</style> -->
</head>
<body>

	<div id="global">
		<h3>Product List</h3>
		<br>

		<!-- Query Parameter passing  -->
		<spring:url value="/products/addProduct" var="addProduct_url">
		</spring:url>
		<a href="${addProduct_url}">Add Product</a><br />

	</div>


	<div class="CSSTableGenerator" style="width: 600px; height: 150px;">
		<table>
			<tr>
				<td>ID</td>
				<td>Name</td>
				<td>Category</td>
				<td>Price</td>
				<td>Quantity</td>
				<td>Details</td>
				<td>Edit</td>
				<td>Delete</td>
			</tr>

			
				<c:forEach items="${products}" var="product">
				<tr>
					<%-- <td>${product.category.name}</td> --%>
					<td>${product.productID}</td>
					
					<td>${product.name}</td>
					<td>${product.category.categoryName}</td>
					<td>${product.price}</td>
					<td>${product.quantity}</td>
					<td>${product.details}</td>


					<!-- Spring:url for handling Spring template/@PathVariable -->
					<spring:url value="product_edit/{id}" var="edit">
						<spring:param name="id" value="${product.id}" />
					</spring:url>

					<td><a href="${edit}">Edit</a></td>

					<spring:url value="product_delete/{id}" var="delete">
						<spring:param name="id" value="${product.id}" />
					</spring:url>

					<td><a href="${delete}">Delete</a></td>
					</tr>
				</c:forEach>
			

		</table>
	</div>


</body>
</html>
