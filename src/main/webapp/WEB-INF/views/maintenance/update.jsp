<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>DORM Management - Maintenance Form</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" />
</head>
<body>
	<div class="container">
		<c:if test="${!empty postMessage}">
			<div class="row">
				<div class="alert alert-success">
					<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
					<strong>${postMessage}</strong>
				</div>
			</div>
		</c:if>

		<div class="row">
			<div class="panel panel-default">
				<div class="panel-heading">Act on Maintenance Request</div>
				<div class="panel-body">
					<form:form commandName="maintenance">
						<div class="form-group">
							<label class="text-success">Name</label> <label>Bijay Khatri</label>
						</div>
						<div class="form-group">
							<label for="title">Room No.:</label> <label>207</label>
						</div>
						<div class="form-group">
							<label for="title">Title</label>
							<form:label path="title">${maintenance.title}</form:label>
						</div>
						<div class="form-group">
							<label for="description">Description</label>
							<form:label path="title">${maintenance.description}</form:label>
						</div>
						<div class="form-group">
							<label for="status">Status</label>
							<form:label path="status">${maintenance.status}</form:label>
						</div>
						<div class="form-group">
							<label for="status">New Status</label>
							<select>
								<option value="0">New</option>
								<option value="0">On Progress</option>
								<option value="0">Completed</option>
							</select>
						</div>
						<button type="submit" class="btn btn-success">
							<span class="glyphicon glyphicon-ok"></span> Update
						</button>
					</form:form>
				</div>
			</div>

		</div>
	</div>


</body>
</html>