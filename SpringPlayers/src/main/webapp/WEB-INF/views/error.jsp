<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>404 Page Not Found</title>
</head>
<body>
<%@ include file="/WEB-INF/tiles/template/navigation.jsp"%>
<center>

<img src= "<spring:url value="/resources/images/404.jpg" htmlEscape="true" />"  alt="Page not found  JSP!!!"  />
 
<H2>${requestScope['javax.servlet.error.message']}</H2>
 

</center> 
</body>
</html>