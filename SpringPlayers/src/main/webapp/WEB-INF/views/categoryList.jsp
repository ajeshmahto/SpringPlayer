<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">@import url("<spring:url value="/css/main.css"/>");</style>
</head>
<body>

<spring:url value="/Category/addCategory" var="addCategory" >
</spring:url>
<a href="${addCategory}">Add Category</a><br/>

<div class="CSSTableGenerator" style="width: 600px; height: 150px;">
	
<table>
<tr>
   <td>ID</td>
	<td>Category</td>
    <td></td>
    <td></td>
</tr>


 <c:forEach items="${categories}" var="category">
    <tr>
    <td>${category.id}</td>
    <td>${category.categoryName}</td>
        
       <td>
         <!-- Spring:url for handling Spring template/@PathVariable -->
         
         
       <spring:url value="/Category/category_edit/{id}"  var="edit" >   		
 		<spring:param name="id" value="${category.id}" />
 		</spring:url>
 		<a href="${edit}">Edit</a></td>
 		 
 		
 		
 		 <td>
 		 <spring:url value="/Category/category_delete/{id}"  var="delete" >
   				<spring:param name="id" value="${category.id}" />
 		</spring:url>
         
        <a href="${delete}">Delete</a></td>
        
    </tr>
</c:forEach>


</table>


</div>
</body>
</html>