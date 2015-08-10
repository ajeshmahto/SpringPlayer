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
<table>
<tr>
    <th>Id</th>
    <th>Category</th>
    
</tr>
<tr></tr>
 <c:forEach items="${categories}" var="category">
    <tr>
        <td>${category.categoryName}</td>
        
      
         
        <td><a href="${edit}">Edit</a></td>
    </tr>
</c:forEach>


</table>



</body>
</html>