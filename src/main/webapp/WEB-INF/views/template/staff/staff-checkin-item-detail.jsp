<%@ page language="java" contentType="text/html;charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div id="maincontent" class="col-md-8 col-sm-12">

	<a class="btn dorm-add-btn" style="margin-bottom:1%;" href="${pageContext.request.contextPath}/auth/staff/viewCheckIn">
		<span class="glyphicon glyphicon-arrow-left"></span> Back

	</a>
	<div class="panel panel-default">
		<div class="panel-heading">Student CheckIn Request Details</div>
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
</div>
