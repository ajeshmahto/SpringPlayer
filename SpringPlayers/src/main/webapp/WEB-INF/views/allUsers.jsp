<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE HTML>
<html>
<head>
<title>Users List</title>
<!-- <style type="text/css">@import url("<spring:url value="/css/main.css"/>");</style> -->
</head>
<body>

	<div id="global">
		<h3>Users List</h3>
		<br>



	</div>


	<div class="CSSTableGenerator" style="width: 600px; height: 150px;">
		<table>
		
				<tr>
				<td>User Name</td>
				<td>First Name</td>
				<td>Last Name</td>
				
			
			</tr>
			
					<c:forEach items="${users}" var="user">
				<tr>
					<%-- <td>${product.category.name}</td> --%>
					<td> ${user.user.username}</td>
					<td> ${user.firstName}</td>
					<td>${user.lastName}</td>
				


				  <!-- Spring:url for handling Spring template/@PathVariable -->
        								<spring:url value="user_edit/{id}"  var="edit" >
   										<spring:param name="id" value="${user.id}" />
 										</spring:url>
       										 <td><a href="${edit}">Edit</a></td>
 
 										<td><spring:url value="user_delete/{id}"  var="delete">
   										<spring:param name="id" value="${user.id}" /> 
 										</spring:url>
								  		<a href="${delete}">Delete</a></td>
								  		
								  	<td><a
									href=" <spring:url value="/users/userDetails?id=${user.id}"  /> ">
									 <span/></span><span  class="button">Details</span> 
										</a>	
										</td>
				</c:forEach>
				
		

		</table>
	</div>


</body>
</html>
		