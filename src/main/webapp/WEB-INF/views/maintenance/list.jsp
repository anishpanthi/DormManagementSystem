<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>DORM Management - Maintenance List</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" />
</head>
<body>
	<div class="container">
		<div class="row">
			<table class="table">
				<tr>
					<th>S.No</th>
					<th>Title</th>
					<th>Description</th>
					<th>Requested Date</th>
					<th>Status</th>
					<th>Request By</th>
					<th>Room No</th>
					<th>Action</th>
				</tr>
				<%
					int counter = 1;
				%>
				<c:forEach items="${maintenances}" var="maintenance">
					<tr>
						<td><%=counter++%></td>
						<td>${maintenance.title}</td>
						<td>${maintenance.description}</td>
						<td>${maintenance.registeredDate}</td>
						<td>${maintenance.status}</td>
						<td><a href='#'>Bijay Khatri</a></td>
						<td>207</td>
						<td><a href='#'><span
								class="glyphicon glyphicon-eye-open"></span></a> view | 
								<a href="<c:url value='/auth/staff/maintenance/edit/${maintenance.id}'></c:url>"><span
								class="glyphicon glyphicon-pencil"></span></a>update</td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>
<body>

</body>
</html>