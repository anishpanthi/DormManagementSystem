<%@ page language="java" contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<h1 align="center">
	<spring:message code="feedback.label.heading" />
</h1>
<div class="container">
	<table class="table table-striped">
		<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Comment</th>
		</tr>
		<c:forEach var="feedback" items="${feedbacks}">
			<tr>
				<td>${feedback.firstName}</td>
				<td>${feedback.lastName}</td>
				<td>${feedback.comments}</td>
			</tr>
		</c:forEach>
	</table>
	<br /> <br /> <a href="/dormmanagement">Goto Home</a>
</div>
