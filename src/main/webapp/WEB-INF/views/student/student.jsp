<%@ page language="java" contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page session="true"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Room Assignment</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" />
<link rel="stylesheet"
	href="//cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.3.0/css/datepicker.min.css" />
<link rel="stylesheet"
	href="//cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.3.0/css/datepicker3.min.css" />
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.2/jquery.min.js"></script>
<!-- Latest compiled and minified JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.3.0/js/bootstrap-datepicker.min.js"></script>
<script src='<c:url value="/resources/js/dateTimePicker.js" />'></script>
<script src='<c:url value="/resources/js/buildingChange.js" />'></script>
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
		<form:form id="assignmentForm" class="form-horizontal" action="roomassignment/assign" method="POST" modelAttribute="roomAssignment">
			<div class="form-group">
				<label for="studentId" class="col-xs-3 control-label">StudentId</label>
				<div class="col-xs-5">
					<form:input type="text" class="form-control" id="studentId"
						path="studentId" placeholder="Student ID" />
				</div>
			</div>
			<div class="form-group">
				<label for="email" class="col-xs-3 control-label">First Name</label>
				<div class="col-xs-5">
					<form:input type="text" class="form-control" id="firstName"
						path="firstName" placeholder="First Name" />
				</div>
			</div>
			<div class="form-group">
				<label for="middleName" class="col-xs-3 control-label">Middle Name</label>
				<div class="col-xs-5">
					<form:input type="text" class="form-control" id="middleName"
						path="middleName" placeholder="Middle Name" />
				</div>
			</div>
			<div class="form-group">
				<label for="email" class="col-xs-3 control-label">Last Name</label>
				<div class="col-xs-5">
					<form:input type="text" class="form-control" id="lastName"
						path="lastName" placeholder="Last Name" />
				</div>
			</div>
			<div class="form-group">
				<label for="buildingNo" class="col-xs-3 control-label">Building</label>
				<div class="col-xs-5">
					<form:select path="buildingNo" id="buildingNo" class="form-control">
						<form:option value="">--Select--</form:option>
						<c:forEach var="building" items="${buildings}">
							<form:option value="${building.buildingNo}">${building.buildingNo}</form:option>
						</c:forEach>
					</form:select>
				</div>
			</div>
			<div class="form-group">
				<label for="major" class="col-xs-3 control-label">Major</label>
				<div class="col-xs-5">
					<form:input type="text" class="form-control" id="middleName"
						path="middleName" placeholder="Middle Name" />
				</div>
			</div>
			<div class="form-group">
				<label for="email" class="col-xs-3 control-label">Email</label>
				<div class="col-xs-5">
					<form:input type="email" class="form-control" id="email"
						path="email" placeholder="Email" />
				</div>
			</div>
			<div class="form-group">
				<label class="col-xs-3 control-label">Date</label>
				<div class="col-xs-5 date">
					<div class="input-group input-append date" id="datePicker">
						<form:input type="text" class="form-control" name="entryDate" id="entryDate" path="entryDate" />
						<span class="input-group-addon add-on"><span
							class="glyphicon glyphicon-calendar"></span></span>
					</div>
				</div>
			</div>
			<div class="form-group">
				<label for="buildingNo" class="col-xs-3 control-label">Building</label>
				<div class="col-xs-5">
					<form:select path="buildingNo" id="buildingNo" class="form-control">
						<form:option value="">--Select--</form:option>
						<c:forEach var="building" items="${buildings}">
							<form:option value="${building.buildingNo}">${building.buildingNo}</form:option>
						</c:forEach>
					</form:select>
				</div>
			</div>
			<div class="form-group">
				<label for="rooms" class="col-xs-3 control-label">Rooms</label>
				<div class="col-xs-5">
					<form:select class="form-control" id="roomNo" path="roomNo">
						<form:option value="">--Select--</form:option>
					</form:select>
				</div>
			</div>
			<div class="form-group">
				<div class="col-xs-5 col-xs-offset-3">
					<button type="submit" class="btn btn-success">Assign</button>
				</div>
			</div>
		</form:form>
	</div>
</body>
</html>