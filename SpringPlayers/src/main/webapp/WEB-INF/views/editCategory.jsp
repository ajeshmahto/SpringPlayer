<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<title>Insert title here</title>
</head>
<body>


<!--BEGIN #signup-form -->
<div id="signup-form">
<!--BEGIN #subscribe-inner -->
	<div id="signup-inner">
	<div class="clearfix" id="header"></div>
	
<%-- <spring:url var = "category_update" value="/Category/category_update" /> --%>

 <spring:url var = "category_update" value="/Category/addCategory" /> 
<form:form  modelAttribute="category"  method="post" action= "${category_update}" >
    <fieldset>
        <legend>Edit category</legend>
        
          <p>
            <label for="Name">Name : </label>
            <form:input id="categoryName" path="categoryName"/>
  		  	<div style="text-align: center;">
 			</div>
        </p>
        
        
        <p id="buttons">
             <input id="submit" type="submit" value="Edit Category">
        </p>
    </fieldset>
</form:form>
</div></div>

</body>
</html>