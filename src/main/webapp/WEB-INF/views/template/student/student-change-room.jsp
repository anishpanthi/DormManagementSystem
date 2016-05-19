<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div id="maincontent" class="col-md-8 col-sm-12">
<div class="bs-example" align="center">
	<h3>Room Change Request Details</h3>
	<form:form class="form-horizontal" role="form" modelAttribute="roomManagement" method="post" action="${pageContext.request.contextPath}/auth/student/room/roomChangeRequest">
		<div class="form-group">
			<label class="control-label col-xs-3" for="firstName">First
				Name:</label>
			<div class="col-xs-6">
				<input type="text" class="form-control" id="firstName"
					placeholder="First Name" value="${student.firstName}" disabled="disabled">
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-xs-3" for="middleName">Middle
				Name:</label>
			<div class="col-xs-6">
				<input type="text" class="form-control" id="middleName"
					placeholder="Middle Name" value="${student.middleName}"disabled="disabled">
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-xs-3" for="lastName">Last
				Name:</label>
			<div class="col-xs-6">
				<input type="text" class="form-control" id="lastName"
					placeholder="Last Name" value="${student.lastName}" disabled="disabled">
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-xs-3" for="studentId">Student Id:</label>
			<div class="col-xs-6">
				<input type="text" class="form-control" id="studentId" placeholder="studentId"
					value="${student.studentId}" disabled="disabled">
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-xs-3" for="country">Country:</label>
			<div class="col-xs-6">
				<input type="text" class="form-control" id="country" placeholder="Country"
					value="${student.country}" disabled="disabled">
			</div>
		</div>

		<div class="form-group">
			<label class="control-label col-xs-3" for="phoneNumber">Phone:</label>
			<div class="col-xs-6">
				<input type="text" class="form-control" id="phoneNumber"
					placeholder="Phone Number" value="${student.phoneNumber}">
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-xs-3" for="inputEmail">Email:</label>
			<div class="col-xs-6">
				<input type="text" class="form-control" id="inputEmail"
					placeholder="Email" value="${student.email}">
			</div>
		</div>
		<h3>
			<span class="label label-default">Current Room Details</span>
		</h3>
		<br>
		<div class="form-group">
			<label class="control-label col-xs-3" for="oldBuildingNo">Building
				No:</label>
			<div class="col-xs-6">
				<input type="text" class="form-control" id="oldBuildingNo"
					placeholder="oldBuildingNo" disabled="disabled">
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-xs-3" for="buildingType">Building
				Type:</label>
			<div class="col-xs-6">
				<input type="text" class="form-control" id="buildingType"
					placeholder="Male/Female">
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-xs-3" for="oldRoomNo">Building
				No:</label>
			<div class="col-xs-6">
				<input type="text" class="form-control" id="oldRoomNo"
					placeholder="oldRoomNo" disabled="disabled">
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-xs-3" for="postalAddress">Address:</label>
			<div class="col-xs-6">
				<input type="text" class="form-control" id="postalAddress"
					placeholder="Address">
			</div>
		</div>
		<h3>
			<span class="label label-default">Select New Available Room</span>
		</h3>
		<br>
		<div class="form-group">
			<label class="control-label col-xs-3">Select Building:</label>
			<div class="col-xs-3">
				<select class="form-control">
					<option>Building 1</option>
					<option>Building 3</option>
					<option>Building 3</option>
					<option>Building 4</option>
				</select>
			</div>
			<label class="control-label col-xs-3">Select Available Room:</label>
			<div class="col-xs-3">
				<select class="form-control">
					<option>Room 1</option>
					<option>Room 3</option>
					<option>Room 3</option>
				</select>
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-xs-3" for="reasonForChange">Reason For Change:</label>
			<div class="col-xs-6">
				<textarea rows="3" class="form-control" id="reasonForChange"
					placeholder="reasonForChange"></textarea>
			</div>
		</div>
		<div class="form-group">
			<div class="col-xs-offset-3 col-xs-6">
				<label class="checkbox-inline"> <input type="checkbox"
					value="agree"> I agree to the <a href="#">Terms and
						Conditions</a>.
				</label>
			</div>
		</div>
		<br>
		<div class="form-group">
			<div class="col-xs-offset-3 col-xs-6">
				<input type="submit" class="btn btn-primary" value="Submit">
				<input type="reset" class="btn btn-default" value="Reset">
			</div>
		</div>
	</form:form>
</div>
</div>