<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
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
		<form id="buildingInfo" class="form-horizontal"
			action="building/create" method="post">
			<div class="form-group">
				<label for="buildingName" class="col-xs-3 control-label">Building
					Name</label>
				<div class="col-xs-5">
					<input type="text" required class="form-control" id="buildingName"
						name="buildingName" placeholder="Building Name" />
				</div>
			</div>
			<div class="form-group">
				<label for="buildingNo" class="col-xs-3 control-label">Building
					No</label>
				<div class="col-xs-5">
					<input type="text" required class="form-control" id="buildingNo"
						name="buildingNo" placeholder="Building No" />
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