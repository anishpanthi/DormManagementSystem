<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Building Info</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" />
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.2/jquery.min.js"></script>
<!-- Latest compiled and minified JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
	<c:if test="${!empty successMessage}">
			<div class="row">
				<div class="alert alert-success">
					<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
					<strong>${successMessage}</strong>
				</div>
			</div>
		</c:if>
		<form:form  commandName="room" action="room/create" method="post">
			<div class="form-group">
				<label for="buildingNo" class="col-xs-3 control-label">Building
					No</label>
				<div class="col-xs-5">
						<form:checkboxes items="${itemList}" itemLabel="name" itemValue="id" path="itemIds"/>
				</div>
			</div>
			<div class="form-group">
				<label for="roomNo" class="col-xs-3 control-label">Room No</label>
				<div class="col-xs-5">
					<form:input type="text" class="form-control" id="roomNo"
						path="roomNo" placeholder="Room No" />
				</div>
			</div>
			<div class="form-group">
				<div class="col-xs-5 col-xs-offset-3">
					<button type="submit" class="btn btn-success">Create</button>
				</div>
			</div>
		</form:form>
	</div>
</body>
</html>