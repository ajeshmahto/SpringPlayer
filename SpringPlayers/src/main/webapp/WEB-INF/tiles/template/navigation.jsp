<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html><html>
<style type="text/css">@import url("<spring:url value="/resources/css/menu.css"/>");</style>



<ul id="menu-bar">
	<li class="active" ><a href="<spring:url value="/"/>">Home</a></li>
	
	<li>
			<a href="<spring:url value="#"/> ">Register User</a>
		<ul>
		 	<li><a href="<spring:url value="/users/registration"/>">Register User</a>
		 
		 	
	




		 		<sec:authorize access="hasRole('ROLE_ADMIN')">
		 	<%-- <security:authorize ifAnyGranted="isAuthenticated()"> --%>
		 	<%-- <security:authorize access="ROLE_ADMIN"> --%>
		 	
		 	
		 	<li><a href="<spring:url value="/users/allUsers"/>">All Users</a>
		 </sec:authorize>
		 <%-- 	</security:authorize> --%>
		</ul>
	</li>
	<li><a href="<spring:url value="/Category/categoryList"/>">Category</a>
	<ul>
		 <li><a href="<spring:url value="/Category/addCategory"/>">Add Category</a>
		  <li><a href="<spring:url value="/Category/categoryList"/>">Category List</a>
		</ul>
		</li>
	
	<li>
		<a href="<spring:url value="/products/display"/>">Product</a>
		<ul>
		 <li><a href="<spring:url value="/products/addProduct"/>">Add Product</a>
		  <li><a href="<spring:url value="/products/productList"/>">Product List</a>
		</ul>
		
	</li>
	<li><a href="<spring:url value="/cart"/>">Cart</a>
	<security:authorize access="isAnonymous()">
	<li><a href="<spring:url value="/login"/>">Login</a></li>
	</security:authorize>
	<security:authorize access="isAuthenticated()">
	<li><a href="<spring:url value="javascript:formSubmit()"/>">Logout</a></li>
	</security:authorize>
	
</ul>


<c:url var="logoutUrl" value="/doLogout" />
	<form action="${logoutUrl}" method="post" id="logoutForm">
		<input type="hidden" name="${_csrf.parameterName}"
			value="${_csrf.token}" />
	</form>
	<script>
		function formSubmit() {
			document.getElementById("logoutForm").submit();
		}
	</script>
</html>