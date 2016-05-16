<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<nav class="container-fluid">
	<div class="container">
		<c:url value="/j_spring_security_logout" var="logoutUrl" />
		<form action="${logoutUrl}" method="post" id="logoutForm">
			<input type="hidden" name="${_csrf.parameterName}"
				value="${_csrf.token}" />
		</form>
	</div>
	<div class="container-fluid">
		<div class="navbar-header">
			<a class="navbar-brand nav nav-pills" href="#"><spring:message
					code="home.label.heading" /></a>
		</div>
		<ul class="nav nav-pills nav-tabs navbar-nav">
			<li><a href="${pageContext.request.contextPath}/">Home</a></li>
			<li><a href="<c:url value='student/maintenance'/>">Maintenance</a></li>
			
			<li class="dropdown"><a class="dropdown-toggle"
				data-toggle="dropdown" href="#">List1<span class="caret"></span></a>
				<ul class="dropdown-menu nav nav-pills">
				</ul></li>
			<li class="dropdown"><a class="dropdown-toggle"
				data-toggle="dropdown" href="#">List2<span class="caret"></span></a>
				<ul class="dropdown-menu nav nav-pills">
					<li><a href="#">value1</a></li>
					<li><a href="#">value2</a></li>
					<li><a href="#">value2</a></li>

				</ul></li>

		</ul>
		<ul class="nav navbar-nav navbar-right" style="margin-top: 1.2em">

			<li><c:if
					test="${pageContext.request.userPrincipal.name != null}">
					<p class=" text-info">
						Welcome : ${pageContext.request.userPrincipal.name} | <a
							href="javascript:formSubmit()"><span
							class="glyphicon glyphicon-log-out"></span> <spring:message
								code="auth.label.logout" /></a>
					</p>
				</c:if> <c:if test="${pageContext.request.userPrincipal.name == null}">
					<p class=" text-info">
						<a href="${pageContext.request.contextPath}/login"><span
							class="glyphicon glyphicon-log-in"></span>&nbsp;&nbsp;Login</a>
					</p>
				</c:if></li>
		</ul>
	</div>
</nav>