<%@ page language="java" contentType="text/html;charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@page session="true"%>
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
<script src="<c:url value="/resources/js/dateTimePicker.js" />"></script>
</head>
<body>
	<div class="container">
		<form id="assignmentForm" class="form-horizontal" action="room/assign"
			method="post">
			<div class="form-group">
				<label for="studentId" class="col-xs-3 control-label">StudentId</label>
				<div class="col-xs-5">
					<input type="text" required class="form-control" id="studentId"
						name="studentId" placeholder="Student ID" />
				</div>
			</div>
			<div class="form-group">
				<label for="email" class="col-xs-3 control-label">Email</label>
				<div class="col-xs-5">
					<input type="email" required class="form-control" id="email"
						name="email" placeholder="Email" />
				</div>
			</div>
			<div class="form-group">
				<label class="col-xs-3 control-label">Date</label>
				<div class="col-xs-5 date">
					<div class="input-group input-append date" id="datePicker">
						<input type="text" class="form-control" required name="date" /> <span
							class="input-group-addon add-on"><span
							class="glyphicon glyphicon-calendar"></span></span>
					</div>
				</div>
			</div>
			<div class="form-group">
				<label for="buildingNo" class="col-xs-3 control-label">Building</label>
				<div class="col-xs-5">
					<select name="buildingNo" class="form-control">
						<option value="">--Select--</option>
						<c:forEach var="building" items="${buildings}">
							<option value="${building.buildingNo}">${building.buildingNo}</option>
						</c:forEach>
					</select>
				</div>
			</div>
			<div class="form-group">
				<label for="rooms" class="col-xs-3 control-label">Rooms</label>
				<div class="col-xs-5">
					<select name="rooms" class="form-control" id="rooms" value="">
						<optgroup label=""></optgroup>
					</select>
				</div>
			</div>
			<div class="form-group">
				<div class="col-xs-5 col-xs-offset-3">
					<button type="submit" class="btn btn-success">Assign</button>
				</div>
			</div>
		</form>
	</div>
</body>
</html>