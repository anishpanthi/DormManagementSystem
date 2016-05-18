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
			<li><a href="${pageContext.request.contextPath}/auth/student">Home</a></li>
			<li><a href="${pageContext.request.contextPath}/auth/student">Link1</a></li>
			<li><a href="${pageContext.request.contextPath}/auth/student">Link2</a></li>
			<li><a href="${pageContext.request.contextPath}/auth/student">Link3</a></li>
		</ul>
		<ul class="nav navbar-nav navbar-right" style="margin-top:1%;">

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