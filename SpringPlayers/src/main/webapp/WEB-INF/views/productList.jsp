<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE HTML>
<html>
<head>
<title>Product List</title>
<style type="text/css">@import url("<spring:url value="/css/main.css"/>");</style>
</head>
<body>

<div id="global">
<h1>Product List</h1>

<!-- Query Parameter passing  -->
<spring:url value="/addProduct" var="addProduct_url" >
</spring:url>
<a href="${addProduct_url}">Add Product</a><br/>

 
 
<table>
<tr>
<!--     <th>Category</th>
 -->
   <th>Name</th>
    <th>Price</th>
    <th>Quantity</th>
    <th>Details</th>
</tr>
<c:forEach items="${products}" var="product">
    <tr>
        <%-- <td>${product.category.name}</td> --%>
        <td>${product.name}</td>
         <td>${product.price}</td>
        <td>${product.quantity}</td>
        <td>${product.details}</td>
        
        
        <!-- Spring:url for handling Spring template/@PathVariable -->
        <spring:url value="/product_edit/{id}"  var="edit" >
   				<spring:param name="id" value="${product.id}" />
 		</spring:url>
         
        <td><a href="${edit}">Edit</a></td>
        
        <spring:url value="/product_delete/{id}"  var="delete" >
   				<spring:param name="id" value="${product.id}" />
 		</spring:url>
         
        <td><a href="${delete}">Delete</a></td>
    </tr>
</c:forEach>
</table>
</div>
 
</body>
</html>
