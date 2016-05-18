<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="display-list">
	<c:if test="${!empty postMessage}">
		<div class="message-row">

			<div class="row">
				<div class="alert alert-success">
					<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
					<strong>${postMessage}</strong>
				</div>
			</div>
		</div>
	</c:if>
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
			<c:forEach items="${maintenances}" var="maintenance"
				varStatus="counter">
				<tr>
					<td><c:out value="${counter.index +1}" /></td>
					<td>${maintenance.title}</td>
					<td>${maintenance.description}</td>
					<td>${maintenance.registeredDate}</td>
					<td>${maintenance.status}</td>
					<td><a href='#'>${maintenance.student.firstName}&nbsp;${maintenance.student.lastName}</a></td>
					<td>${maintenance.student.room.roomNo}</td>
					<td><a
						href="<c:url value='/auth/staff/maintenance/edit/${maintenance.id}'></c:url>"><span
							class="glyphicon glyphicon-pencil"></span></a>update</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</div>