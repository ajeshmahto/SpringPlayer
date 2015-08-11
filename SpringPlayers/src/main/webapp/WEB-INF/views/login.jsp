
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
</head>
<body>
	
	<div id="signup-form">

		
		<div id="signup-inner">

			<div class="clearfix" id="header"></div>
			<p>Login Here.</p>


			<form id="send" action="<spring:url value="/postLogin"></spring:url>" method="post">

				<p>

					<label for="username">username</label> <input id="username" type="text"
						name="username" value="" placeholder="username" />
				</p>

				<p>
					<label for="company">Password</label> <input id="password"
						type="password" name="password" value="" placeholder="password" />
				</p>
				<input type="hidden"
							name="${_csrf.parameterName}" value="${_csrf.token}" />
				<p>

						<button id="submit" type="submit">Login</button>
					</p>
			</form>
		</div>
	</div>
	

</body>
</html>