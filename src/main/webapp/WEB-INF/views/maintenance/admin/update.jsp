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
<link rel="stylesheet" href='<c:url value="/resources/css/style.css"/>' />
</head>
<body>
	<div class="container">
		<div class="maintenance-row row">
			<h3>Act on Maintenance Request</h3>
			<form:form commandName="maintenance">

				<div id="title">
				<span class="glyphicon glyphicon-education"></span>
				${maintenance.title}&nbsp;<label> - by ${maintenance.student.firstName}&nbsp;
				${maintenance.student.lastName} on ${maintenance.registeredDate}
				</label></div>

				<div id="description">${maintenance.description}</div>
				<div class="select form-group">
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

</body>
</html>