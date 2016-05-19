<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<nav id="dorm-nav">
	<div>
		<c:url value="/j_spring_security_logout" var="logoutUrl" />
		<form action="${logoutUrl}" method="post" id="logoutForm">
			<input type="hidden" name="${_csrf.parameterName}"
				value="${_csrf.token}" />
		</form>
	</div>
	<div>
		<div class="navbar-header">
			<a class="navbar-brand nav nav-pills" href="#"> <span
				class="glyphicon glyphicon-home"></span>&nbsp;&nbsp;<spring:message
					code="home.label.heading" />
			</a>


		</div>
		<ul class="nav nav-pills nav-tabs navbar-nav">

		</ul>
		<ul class="nav navbar-nav navbar-right"
			style="margin-top: 1%; margin-right: 2%;">

			<li><c:if
					test="${pageContext.request.userPrincipal.name != null}">
					<p class=" text-info">
						Welcome : ${pageContext.request.userPrincipal.name} | <a
							style="color: inherit; text-decoration: none;"
							href="javascript:formSubmit()"><span
							class="glyphicon glyphicon-off"></span> <spring:message
								code="auth.label.logout" /></a>
					</p>
				</c:if></li>
		</ul>
	</div>
</nav>