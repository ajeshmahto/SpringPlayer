<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>


<div>

	<p style="float:right">

		<security:authorize access="isAuthenticated()">
  					Welcome  <security:authentication property="principal.username" />
		</security:authorize>
	</p>
</div>