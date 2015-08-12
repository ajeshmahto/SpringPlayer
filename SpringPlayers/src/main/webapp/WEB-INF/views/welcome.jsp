<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Welcome</title>
</head>
<body>

	<div id='cssmenu'>
		<ul>
			<li><a href='#'><span>Category</span></a></li>
			<c:forEach items="${categories}" var="category">


				<spring:url value="Category/productCategory/{id}" var="show">
					<spring:param name="id" value="${category.id}" />
				</spring:url>



				<li><a href="${show}"><span>${category.categoryName}</span></a></li>
			</c:forEach>
		</ul>
	</div>

</body>
</html>
