<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE HTML>
<html>
<head>
<title>Add Product Form</title>
<!-- <style type="text/css">@import url("<c:url value="/css/main.css"/>");</style> -->
</head>
<body>

<%-- <spring:url var = "editProduct" value="/editProduct" />
<div id="rightList"> 
	<form:form modelAttribute="productSearch"  action= "${editProduct}"  method="post">
  <p>
            	<label for="productList"><spring:message code="product.product" /> </label>
             	<form:select id="productlist" path="id" 
                	items="${products}" itemLabel="title" itemValue="id"/>
  
             <input id="submit" type="submit" value="Edit Product">
</p>
    </form:form >
</div> --%>

 
<spring:url var = "addProduct" value="/products/addProduct" />
<div id="global">
<form:form modelAttribute="newProduct"  action= "${addProduct }" method="post">
    <fieldset>
        <legend>Add a product</legend>
  		<p>
  		     <form:errors path="*" cssStyle="color : red;" /> 
        </p>
        <%-- <p>
            <label for="category">Category </label>
             <form:select id="category" path="category.id" 
                items="${categories}" itemLabel="name" itemValue="id"/>
        </p>
          --%>
        <p>
            <label for="Name">Name </label>
            <form:input id="name" path="name"/>
  		  	<div style="text-align: center;">
 				<form:errors path="name" cssStyle="color : red;" /> 
 			</div>
        </p>
        <p>
            <label for="price">Price: </label>
            <form:input id="price" path="price"/>
        </p>
        <p>
            <label for="quantity">Quantity</label>
            <form:input id="quantity" path="quantity"/>
   		  	<div style="text-align: center;">
 				<form:errors path="quantity" cssStyle="color : red;" /> 
 			</div>
        </p>
           <p>
            <label for="details">Details: </label>
            <form:input path="details" id="details" />
         </p>
        
        <p id="buttons">
             <input id="submit" type="submit" value="Add Product">
        </p>
    </fieldset>
</form:form>
</div>
</body>
</html>
