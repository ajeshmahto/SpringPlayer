<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML>
<html>
<head>
<title>Edit Book Form</title>
</head>
<body>
	<spring:url var="editBook" value="products/editBook" />


	<spring:url var="product_update" value="/products/product_update" />


	<div id="signup-form">
		<div id="signup-inner">
			<form:form commandName="product" action="${product_update}">
				<fieldset>
					<legend>Edit a product</legend>
					<form:hidden path="id" />
					<%-- <p>
            <label for="category">Category: </label>
             <form:select id="category" path="category.id" items="${categories}"
                itemLabel="name" itemValue="id"/>
        </p> --%>
        
        <p>
					
						<label for="productID">Product ID: </label>
						<form:input id="productID" path="productID" />
					</p>
					<p>
						<label for="name">Name: </label>
						<form:input id="name" path="name" />
					</p>
					
					<p>
            <label for="category">Category </label>
             <form:select id="category" path="category.id" 
                items="${categories}" itemLabel="categoryName" itemValue="id"/>
        </p>
         
					<p>
						<label for="price">Price: </label>
						<form:input id="price" path="price" />
					</p>
					<p>
						<label for="quantity">Quantity:</label>
						<form:input id="qunatity" path="quantity" />
					</p>
					<p>
						<label for="details">Details: </label>
						<form:input path="details" id="details" />
					</p>

					<div class="form-group">
						<label class="control-label col-lg-2" for="productImage">Image</label>
						<div class="col-lg-10">
							<form:input id="productImage" path="productImage" type="file"
								class="form:input-large" />
						</div>
					</div>

					<p id="buttons">
						<input id="reset" type="reset" tabindex="4"> <input
							id="submit" type="submit" tabindex="5" value="Update Product">
					</p>
				</fieldset>
			</form:form>
		</div>
	</div>
</body>
</html>
