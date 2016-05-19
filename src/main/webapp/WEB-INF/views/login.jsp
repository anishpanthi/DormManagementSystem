<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true"%>

<div class="container" onload='document.loginForm.username.focus();'>
	<div class="card card-container">
		<img id="profile-img"
			class="profile-img-card"
			src="//ssl.gstatic.com/accounts/ui/avatar_2x.png" />
		<p id="profile-name" class="profile-name-card"></p>

		<c:if test="${not empty authFailed}">
			<div class="alert alert-danger">${authFailed}</div>
		</c:if>
		<c:if test="${not empty msg}">
			<div class="alert alert-success">${msg}</div>
		</c:if>

		<c:url value="${request.contextPath}/j_spring_security_check"
			var="loginUrl" />
		<form name='loginForm' action="${loginUrl}" method='POST'
			class="form-signin">
			<span id="reauth-email" class="reauth-email"></span>
			<hr class="colorgraph">
			<br> <input type='text' name='username' class="form-control"
				placeholder="Enter Username" required autofocus /> <input
				type='password' name='password' class="form-control"
				placeholder="Enter Password" required /> <input name="submit"
				type="submit" value="Login"
				class="btn btn-lg btn-primary btn-block btn-signin" /> <input
				type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
		</form>
	</div>

</div>
