<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<spring:url var = "addCategory" value="/Category/addCategory" />
<div id="global">
<form:form  modelAttribute="newCategory"  action= "${addCategory}" method="post">
    <fieldset>
        <legend>Add a category</legend>
        
          <p>
            <label for="Name">Name </label>
            <form:input id="categoryName" path="categoryName"/>
  		  	<div style="text-align: center;">
 				
 			</div>
        </p>
        
        
        <p id="buttons">
             <input id="submit" type="submit" value="Add Book">
        </p>
    </fieldset>
</form:form>
</div>
</body>
</html>