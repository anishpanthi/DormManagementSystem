<%@ page language="java" contentType="text/html;charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@page session="true"%>
<html>
<head>
<title>APUB - Dorm Management System - Staff Console</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" />
</head>
<body>
	<div class="container">
		<c:url value="/j_spring_security_logout" var="logoutUrl" />
		<form action="${logoutUrl}" method="post" id="logoutForm">
			<input type="hidden" name="${_csrf.parameterName}"
				value="${_csrf.token}" />
		</form>
		<script>
			function formSubmit() {
				document.getElementById("logoutForm").submit();
			}
		</script>
	</div>

	<div class="container">
		<div class="row">
			<div class="col-md-5  toppad  pull-right col-md-offset-3 ">
				<c:if test="${pageContext.request.userPrincipal.name != null}">
					<p class=" text-info">
						Welcome : ${pageContext.request.userPrincipal.name} | <a
							href="javascript:formSubmit()"> <spring:message code="auth.label.logout" /></a>
					</p>
				</c:if>
			</div>
		</div>
		<p><h1>This is Staff Page.</h1>
	</div>
</body>
</html>