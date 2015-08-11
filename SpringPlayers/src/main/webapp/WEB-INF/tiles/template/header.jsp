<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>


<div style="float:right;text-align:right;">
Language : <a href="?language=en_US">English</a>|<a href="?language=nl">Nepali| <a href="?language=ar">Arabic</a>
</a>

</div>
<div>
	<p style="float:right; text-align:right; border-style: dotted solid;">

		<security:authorize access="isAuthenticated()">
  					Welcome  <security:authentication property="principal.username" />
		</security:authorize>
	</p>
</div>