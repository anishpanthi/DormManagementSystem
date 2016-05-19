<%@ page language="java" contentType="text/html;charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<br />
<br />
<br />
<div class="panel panel-default">
	<div class="panel-heading">Student CheckIn Request</div>
	<div class="panel-body">
		<table class="table">
			<tr>
				<th>S.No</th>
				<th>Item Name</th>
				<th>Description</th>
				<th>Status</th>
			</tr>

			<c:forEach items="${checkInItems}" var="item" varStatus="counter">
				<tr>
					<td>${counter.index + 1 }</td>
					<td>${item.itemName}</td>
					<td>${item.description}</td>
					<td>${item.status}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</div>
<a href="${pageContext.request.contextPath}/auth/staff/viewCheckIn">Back</a>