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
		<form id="room" class="form-horizontal" action="room/create" method="POST">
			<div class="form-group">
				<label for="buildingNo" class="col-xs-3 control-label">Building
					No</label>
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
				<label for="roomNo" class="col-xs-3 control-label">Room No</label>
				<div class="col-xs-5">
					<input type="text" required class="form-control" id="roomNo"
						name="roomNo" placeholder="Room No" />
				</div>
			</div>
			<div class="form-group">
				<div class="col-xs-5 col-xs-offset-3">
					<button type="submit" class="btn btn-success">Create</button>
				</div>
			</div>
		</form>
	</div>
</body>
</html>