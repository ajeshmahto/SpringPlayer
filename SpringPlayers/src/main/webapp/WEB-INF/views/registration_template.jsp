<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Welcome</title>
</head>
<body>
	<section>
		<!--BEGIN #signup-form -->
		<div id="signup-form">

			<!--BEGIN #subscribe-inner -->
			<div id="signup-inner">

				<div class="clearfix" id="header"></div>
				<p>Please complete the fields below.</p>


				<form id="send" action="">

					<p>

						<label for="name">Your Name *</label> <input id="name" type="text"
							name="name" value="" />
					</p>

					<p>
						<label for="company">Company Name</label> <input id="company"
							type="text" name="company" value="" />
					</p>

					<p>

						<label for="email">Email *</label> <input id="email" type="text"
							name="email" value="" />
					</p>

					<p>
						<label for="website">Website</label> <input id="website"
							type="text" name="website" value="http://" />
					</p>

					<p>

						<label for="phone">Phone</label> <input id="phone" type="text"
							name="phone" value="" />
					</p>

					<p>
						<label for="country">Country</label> <input id="Country"
							type="text" name="country" value="" />
					</p>

					<p>

						<button id="submit" type="submit">Submit</button>
					</p>

				</form>

				<div id="required">
					<p>
						* Required Fields<br />
				</div>


			</div>

		</div>

	</section>

</body>
</html>