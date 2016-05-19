<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div id="maincontent" class="col-md-8 col-sm-12">
	<div class="panel panel-default">
		<div class="panel-heading">Student CheckIn Request</div>
		<div class="panel-body">
			<table class="table">
				<tr>
					<th>S.No</th>
					<th>Full Name</th>
					<th>Room Number</th>
					<th>Building Number</th>
					<th>Date</th>
					<th>Action</th>
				</tr>

				<c:forEach items="${studentsList}" var="student" varStatus="counter">
					<tr>
						<td>${counter.index + 1 }</td>
						<td>${student.firstName}${student.lastName}</td>
						<td>${student.room.roomNo}</td>
						<td>${student.buiding.buildingNo}</td>
						<td>${checkInForms.get(counter.index)[0].created}</td>
						<td><a
							href="${pageContext.request.contextPath}/auth/staff/viewCheckIn/details/${student.id}"
							class="label label-success">Details</a>&nbsp; | &nbsp; <a
							href="${pageContext.request.contextPath}/auth/staff/viewCheckIn/approve/1"
							class="label label-success">Approve</a></td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>
</div>