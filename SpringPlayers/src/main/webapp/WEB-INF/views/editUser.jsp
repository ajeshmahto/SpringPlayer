<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Update User Information</title>
</head>
<body>
	<div id="signup-form">

			<!--BEGIN #subscribe-inner -->
			<div id="signup-inner">
			<div class="clearfix" id="header"></div>
			
						
			</div>


<spring:url var = "user_update" value="/users/update" />

		<form:form  modelAttribute="userProfile" action= "${user_update}" >

				
<form:hidden path="id"/>

<fieldset>
        <legend>Update User's Information</legend>
        
						 <form:errors path="*" cssStyle="color: red;" element="div"/>
				<div>
					<label for="username"><spring:message code="registration.form.username.label"/></label>
					<div>
						<form:input id="user.username" path="user.username" type="text" />
						<form:errors path="user.username" cssStyle="color: red;" />
					</div>
				</div>

			
					<label  for="password"><spring:message code="registration.form.password.label"/></label>
					<div >
						<form:input id="user.password" type="password"  path="user.password" />
						<form:errors path="user.password" />
					</div>
				

			
				
					<label for="firstName"><spring:message code="registration.form.firstname.label"/></label>
					<div>
						<form:input id="firstName" path="firstName" type="text" /><br />
						<form:errors path="firstName" cssStyle="color: red;" />
					</div>
			



					<label for="lastName"><spring:message code="registration.form.lastname.label"/></label>
					<div>
						<form:input id="lastName" path="lastName" type="text" /><br />
						<form:errors path="lastName" cssStyle="color: red;" />
					</div>
				
				

				<div>
					<label  for="email"><spring:message code="registration.form.email.label"/></label>
					<div>
						<form:input id="email" path="email" type="text"/><br />
						<form:errors path="email" cssStyle="color: red;" />
					</div>
				</div>

	
					<label  for="phone"><spring:message code="registration.form.phone.label"/></label>
					<div >
						<form:input id="phone" path="phone" type="text" />
					</div>

<br />Billing Address<br />
		
					<label  for="lineOne"><spring:message code="registration.form.lineOne.label"/></label>
					<div>
						<form:input id="lineOne" path="billingAddress.lineOne" type="text" />
					</div>
		
				

					<label for="lineTwo"><spring:message code="registration.form.lineTwo.label"/></label>
					<div>
						<form:input id="lineTwo" path="billingAddress.lineTwo" type="text" />
					</div>

				

					<label  for="state"><spring:message code="registration.form.state.label"/></label>
					<div>
						<form:input id="state" path="billingAddress.state" type="text" />
					</div>

				

					<label  for="zipCode"><spring:message code="registration.form.zipCode.label"/></label>
					<div>
						<form:input id="zipCode" path="billingAddress.zipCode" type="text" />
					</div>

				
<br />shipping Address<br />

					<label  for="lineOne"><spring:message code="registration.form.lineOne.label"/></label>
					<div>
						<form:input id="lineOne" path="shippingAddress.lineOne" type="text"/>
					</div>

				

					<label  for="lineTwo"><spring:message code="registration.form.lineTwo.label"/></label>
					<div>
						<form:input id="lineTwo" path="shippingAddress.lineTwo" type="text" />
					</div>

				

					<label for="state"><spring:message code="registration.form.state.label"/></label>
					<div>
						<form:input id="state" path="shippingAddress.state" type="text" />
					</div>

				

					<label  for="zipCode"><spring:message code="registration.form.zipCode.label"/></label>
					<div>
						<form:input id="zipCode" path="shippingAddress.zipCode" type="text" />
					</div>

				

		
				
				  <p id="buttons">
            		 <input id="submit" type="submit" value="Update">
       			  </p>
				
			 </fieldset>
		</form:form>
		</div>

</body>
</html>
