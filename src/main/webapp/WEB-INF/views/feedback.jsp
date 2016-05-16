<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" />
<title>APUB - Dormitory Management System - Feedback</title>
</head>
<body>
	<%@ include file="header.jsp"%>
	<div class="container">
		<h1 align="center">Please Provide Your Valuable Feedback.</h1>
		<form action="feedback" method="post">
			<table align="center">
				<tr>
					<spring:bind path="feedback.firstName">
						<td><label for="firstName">&nbsp;&nbsp;First
								Name:&nbsp;&nbsp;</label></td>
						<td><form:input path="feedback.firstName"
								class="form-control" id="firstName" /></td>
						<td><form:errors path="feedback.firstName"
								cssStyle="color: #ff0000;" class="alert alert-danger" /></td>
					</spring:bind>
				</tr>
				<tr>
					<td>&nbsp;</td>
				</tr>
				<tr>
					<spring:bind path="feedback.lastName">
						<td><label for="lastName">&nbsp;&nbsp;Last
								Name:&nbsp;&nbsp;</label></td>
						<td><form:input path="feedback.lastName" class="form-control"
								id="lastName" /></td>
						<td><form:errors path="feedback.lastName"
								cssStyle="color: #ff0000;" class="alert alert-danger" /></td>
					</spring:bind>
				</tr>
				<tr>
					<td>&nbsp;</td>
				</tr>
				<tr>
					<spring:bind path="feedback.email">
						<td><label for="email">&nbsp;&nbsp;Email:&nbsp;&nbsp;</label></td>
						<td><form:input path="feedback.email" class="form-control"
								id="email" /></td>
						<td><form:errors path="feedback.email"
								cssStyle="color: #ff0000;" class="alert alert-danger" /></td>
					</spring:bind>
				</tr>
				<tr>
					<td>&nbsp;</td>
				</tr>
				<tr>
					<spring:bind path="feedback.comments">
						<td><label for="comments">&nbsp;&nbsp;Comments:&nbsp;&nbsp;</label></td>
						<td><form:textarea path="feedback.comments" rows="5"
								cols="30" class="form-control" id="comments" /></td>
						<td><form:errors path="feedback.comments"
								cssStyle="color: #ff0000;" class="alert alert-danger" /></td>
					</spring:bind>
				</tr>
				<tr>
					<td>&nbsp;</td>
				</tr>
				<tr>
					<td>&nbsp;</td>
					<td><input type="submit" value="Submit"
						class="btn btn-default" /></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>