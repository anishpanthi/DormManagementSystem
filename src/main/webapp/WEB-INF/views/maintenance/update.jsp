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
					
						<table class="table table-striped">
							<tr>
								<td>Name</td>
								<td>Bijay</td>
							</tr>
							<tr>
								<td>Room No.:</td>
								<td>207</td>
							</tr>
							<tr>
								<td>Issue Title</td>
								<td>${maintenance.title}</td>
							</tr>
					
							<tr>
								<td>Issue Description</td>
								<td>${maintenance.description}</td>
							</tr>
				
							<tr>
								<td>Issue Title</td>
								<td>${maintenance.title}</td>
							</tr>
							
							<tr>
							<td>Status</td>
							<td><label style="font-size: 12px;
									    color: #FDFDFD;
									    background: #60A963;
									    padding: 3px;
									    text-transform: lowercase;">
								${maintenance.status}</label></td>
							</tr>
							
						</table>
						
			<form:form commandName="maintenance">
				<div class="form-group">
					<label for="status">Action</label> 
					<form:select path="status">
						<option value="0">New</option>
						<option value="1">On Progress</option>
						<option value="2">Completed</option>
					</form:select>
					
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