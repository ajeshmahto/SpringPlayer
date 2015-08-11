<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>
Spring Players
</title>
<style type="text/css">@import url("<spring:url value="/resources/css/style.css"/>");</style>
<style type="text/css">@import url("<spring:url value="/resources/css/table.css"/>");</style>
<style type="text/css">@import url("<spring:url value="/resources/css/submenu.css"/>");</style>
<style type="text/css">@import url("<spring:url value="/resources/css/display.css"/>");</style>
</head>
<body>
<div>
		<tiles:insertAttribute name="header" />
	</div>
	<div>
		<tiles:insertAttribute name="navigation" />
	</div>

	<div >
		<tiles:insertAttribute name="body" />
	</div>

	<div>
		<tiles:insertAttribute name="footer" />
	</div>
<script src="<spring:url value="/resources/js/blocksit.js" />"></script>
<script src="<spring:url value="/resources/js/blocksit.min.js" />"></script>
<script src="<spring:url value="/resources/js/display.js" />"></script>
</body>
</html>