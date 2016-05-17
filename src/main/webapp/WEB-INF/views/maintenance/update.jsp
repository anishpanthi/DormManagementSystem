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
		<div class="row">
			<div class="panel panel-default">
				<div class="panel-heading">
					
					Act on Maintenance Request
				
				</div>
			</div>
			<div class="panel-body">
				<form:form commandName="maintenance">
					<div class="form-group">
						<div class="alert alert-info" role="alert">
							${maintenance.title}</div>
					</div>
					<div class="form-group">
						<div class="panel panel-default">
							<div class="panel-body">${maintenance.description}</div>
						</div>

					</div>
					<div class="form-group">
						<label for="status">Action</label>
						<form:select path="status">
							<form:option value="New">New</form:option>
							<form:option value="On Progres">On Progress</form:option>
							<form:option value="complete">Completed</form:option>
						</form:select>

					</div>
					<button type="submit" class="btn btn-success">
						<span class="glyphicon glyphicon-ok"></span> Update
					</button>
					<form:hidden path="student" />
				</form:form>
			</div>
		</div>

	</div>
	</div>


</body>
</html>