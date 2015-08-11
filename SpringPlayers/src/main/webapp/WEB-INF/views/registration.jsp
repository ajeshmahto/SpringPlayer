<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<style type="text/css">@import url("<c:url value="/resources/css/main.css"/>");</style>

<title>Registration</title>
</head>
<body>
	<section>
	
				<h1>Registration</h1>
				<p>Add New User</p>
		
 			<div class="pull-right" style="padding-right:50px">
				<a href="?language=en" >English</a>|<a href="?language=nl" >Dutch</a>					
			</div>
			
		
	</section>
	
	<div id="global">
		<form:form  modelAttribute="registration">
			<fieldset>
				<legend>Registration</legend>

				<form:errors path="*" cssClass="alert alert-danger" element="div"/>
				<div class="form-group">
					<label class="control-label col-lg-2 col-lg-2" for="username"><spring:message code="registration.form.username.label"/></label>
					<div class="col-lg-10">
						<form:input id="user.username" path="user.username" type="text" />
						<form:errors path="user.username" cssClass="text-danger"/>
					</div>
				</div>

				<div class="form-group">
					<label  for="password"><spring:message code="registration.form.password.label"/></label>
					<div class="col-lg-10">
						<form:input id="user.password" type="password"  path="user.password" />
						<form:errors path="user.password" cssClass="text-danger"/>
					</div>
				</div>

			
				<div class="form-group">
					<label for="firstName"><spring:message code="registration.form.firstname.label"/></label>
					<div class="col-lg-10">
						<form:input id="firstName" path="firstName" type="text" />
					</div>
				</div>


				<div class="form-group">
					<label for="lastName"><spring:message code="registration.form.lastname.label"/></label>
					<div class="col-lg-10">
						<form:input id="lastName" path="lastName" type="text" />
					</div>
				</div>
				

				<div class="form-group">
					<label  for="email"><spring:message code="registration.form.email.label"/></label>
					<div class="col-lg-10">
						<form:input id="email" path="email" type="text"/>
					</div>
				</div>

				<div class="form-group">
					<label  for="phone"><spring:message code="registration.form.phone.label"/></label>
					<div class="col-lg-10">
						<form:input id="phone" path="phone" type="text" class="form:input-large"/>
					</div>
				</div>
<br />Billing Address<br />
				<div class="form-group">
					<label  for="lineOne"><spring:message code="registration.form.lineOne.label"/></label>
					<div class="col-lg-10">
						<form:input id="lineOne" path="billingAddress.lineOne" type="text" />
					</div>
				</div>
				
				<div class="form-group">
					<label for="lineTwo"><spring:message code="registration.form.lineTwo.label"/></label>
					<div class="col-lg-10">
						<form:input id="lineTwo" path="billingAddress.lineTwo" type="text" />
					</div>
				</div>
				
				<div class="form-group">
					<label  for="state"><spring:message code="registration.form.state.label"/></label>
					<div class="col-lg-10">
						<form:input id="state" path="billingAddress.state" type="text" />
					</div>
				</div>
				
				<div class="form-group">
					<label  for="zipCode"><spring:message code="registration.form.zipCode.label"/></label>
					<div class="col-lg-10">
						<form:input id="zipCode" path="billingAddress.zipCode" type="text" />
					</div>
				</div>
				
<br />shipping Address<br />
				<div class="form-group">
					<label  for="lineOne"><spring:message code="registration.form.lineOne.label"/></label>
					<div class="col-lg-10">
						<form:input id="lineOne" path="shippingAddress.lineOne" type="text"/>
					</div>
				</div>
				
				<div class="form-group">
					<label  for="lineTwo"><spring:message code="registration.form.lineTwo.label"/></label>
					<div class="col-lg-10">
						<form:input id="lineTwo" path="shippingAddress.lineTwo" type="text" />
					</div>
				</div>
				
				<div class="form-group">
					<label for="state"><spring:message code="registration.form.state.label"/></label>
					<div class="col-lg-10">
						<form:input id="state" path="shippingAddress.state" type="text" />
					</div>
				</div>
				
				<div class="form-group">
					<label  for="zipCode"><spring:message code="registration.form.zipCode.label"/></label>
					<div class="col-lg-10">
						<form:input id="zipCode" path="shippingAddress.zipCode" type="text" />
					</div>
				</div>
				

				<div >
					<div>
						<input type="submit" id="Register" value ="Register" class="button" />
					</div>
				</div>
				
			</fieldset>
		</form:form>
		</div>

</body>
</html>
