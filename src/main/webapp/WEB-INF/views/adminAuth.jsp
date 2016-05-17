<%@ page language="java" contentType="text/html;charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true"%>
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
<br />
<br />

<div>
	<p>
		<a href="admin/roomassignment" class="btn btn-primary">RoomAssignment</a>
	</p>
	<p>
		<a href="admin/building" class="btn btn-primary">Building</a>
	</p>
	<p>
		<a href="admin/room" class="btn btn-primary">Room</a>
	</p>
	<p>
		<a href="admin/item" class="btn btn-primary">Add Items</a>
	</p>
	<p>
		<a href="admin/item/listItems" class="btn btn-primary">List Items</a>
	</p>
	<p>
		<a href="admin/form/checkinForm" class="btn btn-primary">CheckIn Form</a>
	</p>
</div>


