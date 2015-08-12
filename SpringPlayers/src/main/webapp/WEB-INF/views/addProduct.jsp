<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

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


	<spring:url var="addProduct" value="/products/addProduct" />
	<div id="signup-form">
		<div id="signup-inner">
			<form:form modelAttribute="newProduct" id="send"
				action="${addProduct }" enctype="multipart/form-data"  method="post">
				<fieldset>
					<legend>Add a product</legend>
					<p>
						<form:errors path="*" cssStyle="color : red;" />
					</p>
					
					<p>
					<%-- <div style="text-align: center;">
						<form:errors path="price" cssStyle="color : red;" />
					</div> --%>
						<label for="productID">Product ID: </label>
						<form:input id="productID" path="productID" />
					</p>
					
					<p>
            <label for="category">Category </label>
             <form:select id="category" path="category.id" 
                items="${categories}" itemLabel="categoryName" itemValue="id"/>
        </p>
         
					<p>
					<%-- <div style="text-align: center;">
						<form:errors path="name" cssStyle="color : red;" />
					</div> --%>
						<label for="Name">Name </label>
						<form:input id="name" path="name" />
					
					</p>
					<p>
					<%-- <div style="text-align: center;">
						<form:errors path="price" cssStyle="color : red;" />
					</div> --%>
						<label for="price">Price: </label>
						<form:input id="price" path="price" />
					</p>
					<p>
					<%-- <div style="text-align: center;">
						<form:errors path="quantity" cssStyle="color : red;" />
					</div> --%>
						<label for="quantity">Quantity</label>
						<form:input id="quantity" path="quantity" />
					
					</p>
					<p>
					<%-- <div style="text-align: center;">
						<form:errors path="details" cssStyle="color : red;" />
					</div> --%>
						<label for="details">Details: </label>
						<form:input path="details" id="details" />
					</p>

					<div class="form-group">
						<label class="control-label col-lg-2" for="productImage">Image</label>
						<div class="col-lg-10">
							<form:input id="productImage" path="productImage" type="file"
								class="form:input-large" />
							<input type="hidden" name="${_csrf.parameterName}"
                value="${_csrf.token}" />	
						</div>
					</div>

					<p id="buttons">
						<input id="submit" type="submit" value="Add Product">
					</p>
<%-- 					<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
 --%>				</fieldset>
			</form:form>
		</div>

	</div>
</body>
</html>
