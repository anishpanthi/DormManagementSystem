<%@ page language="java" contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ page contentType="text/html;charset=UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" />
<title>APUB - Dormitory Management System - Feedbacks</title>
</head>
<body>
	<%@ include file="header.jsp"%>
	<h1 align="center">
		<spring:message code="feedback.label.heading" />
	</h1>
	<div class="container">
		<table class="table table-striped">
			<th>First Name</th>
			<th>Last Name</th>
			<th>Comment</th>
			<c:forEach var="feedback" items="${feedbacks}">
				<tr>
					<td>${feedback.firstname}</td>
					<td>${feedback.lastname}</td>
					<td>${feedback.comments}</td>
				</tr>
			</c:forEach>
		</table>
		<br />
		<br /> <a href="/dormmanagement">Goto Home</a>
	</div>
</body>
</html>