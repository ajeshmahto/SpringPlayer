<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add </title>
</head>
<body>


<!--BEGIN #signup-form -->
<div id="signup-form">

<!--BEGIN #subscribe-inner -->
	<div id="signup-inner">
	<div class="clearfix" id="header"></div>
<form:form  modelAttribute="category"  action= "addCategory" method="post" id="send">
    <fieldset>
        <legend>Add a category</legend>
        
          <p>
            <label for="name"> 
           <spring:message code="addCategory.form.name.label" text=" Category Name:"/>
		</label>
            <form:input id="categoryName" path="categoryName"/>
            <form:errors path="categoryName" cssStyle="color : red;" />
             <form:input id="id" path="id" type="hidden"/>
  		  	<div style="text-align: center;">
 				
 			</div>
        </p>
        
        
        <p id="buttons">
             <input id="submit" type="submit" value="Add Category">
        </p>
    </fieldset>
</form:form>
</div>
</div>


</div>
</body>
</html>