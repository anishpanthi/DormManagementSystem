<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<style type="text/css">
h1 {
	margin: 30px 0;
	padding: 0 200px 15px 0;
	border-bottom: 1px solid #E5E5E5;
}

.bs-example {
	margin: 20px;
}
</style>
<div class="bs-example">
	<h2>
		<span class="label label-default">Room Change Request Details</span>
	</h2>
	<br>
	<form:form class="form-horizontal" role="form" modelAttribute="roomManagement" method="post" action="${pageContext.request.contextPath}/auth/student/room/roomChangeRequest">
		<div class="form-group">
			<label class="control-label col-xs-2" for="firstName">First
				Name:</label>
			<div class="col-xs-9">
				<input type="text" class="form-control" id="firstName"
					placeholder="First Name" disabled="disabled">
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-xs-2" for="middleName">Middle
				Name:</label>
			<div class="col-xs-9">
				<input type="text" class="form-control" id="middleName"
					placeholder="Middle Name" disabled="disabled">
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-xs-2" for="lastName">Last
				Name:</label>
			<div class="col-xs-9">
				<input type="text" class="form-control" id="lastName"
					placeholder="Last Name" disabled="disabled">
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-xs-2" for="id">Last Name:</label>
			<div class="col-xs-9">
				<input type="text" class="form-control" id="id" placeholder="Id"
					disabled="disabled">
			</div>
		</div>

		<div class="form-group">
			<label class="control-label col-xs-2" for="phoneNumber">Phone:</label>
			<div class="col-xs-9">
				<input type="tel" class="form-control" id="phoneNumber"
					placeholder="Phone Number">
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-xs-2" for="inputEmail">Email:</label>
			<div class="col-xs-9">
				<input type="email" class="form-control" id="inputEmail"
					placeholder="Email">
			</div>
		</div>
		<h3>
			<span class="label label-default">Current Room Details</span>
		</h3>
		<br>
		<div class="form-group">
			<label class="control-label col-xs-2" for="oldBuildingNo">Building
				No:</label>
			<div class="col-xs-9">
				<input type="text" class="form-control" id="oldBuildingNo"
					placeholder="oldBuildingNo" disabled="disabled">
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-xs-2" for="buildingType">Building
				Type:</label>
			<div class="col-xs-9">
				<input type="text" class="form-control" id="buildingType"
					placeholder="Male/Female">
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-xs-2" for="oldRoomNo">Building
				No:</label>
			<div class="col-xs-9">
				<input type="text" class="form-control" id="oldRoomNo"
					placeholder="oldRoomNo" disabled="disabled">
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-xs-2" for="postalAddress">Address:</label>
			<div class="col-xs-9">
				<input type="text" class="form-control" id="postalAddress"
					placeholder="Address">
			</div>
		</div>
		<h3>
			<span class="label label-default">Select New Available Room</span>
		</h3>
		<br>
		<div class="form-group">
			<label class="control-label col-xs-2">Select State:</label>
			<div class="col-xs-2">
				<select class="form-control">
					<option>Iowa</option>
					<option>Texas</option>
				</select>
			</div>
			<label class="control-label col-xs-2">Location:</label>
			<div class="col-xs-2">
				<select class="form-control">
					<option>Location 1</option>
					<option>Location 2</option>
				</select>
			</div>
			<label class="control-label col-xs-2">Select Zip Code:</label>
			<div class="col-xs-2">
				<select class="form-control">
					<option>zip1</option>
					<option>zip2</option>
				</select>
			</div>
			<label class="control-label col-xs-2">Select Building Type:</label>
			<div class="col-xs-2">
				<select class="form-control">
					<option>Male</option>
					<option>Female</option>
				</select>
			</div>
			<label class="control-label col-xs-2">Select Building:</label>
			<div class="col-xs-2">
				<select class="form-control">
					<option>Building 1</option>
					<option>Building 2</option>
					<option>Building 3</option>
					<option>Building 4</option>
				</select>
			</div>
			<label class="control-label col-xs-2">Select Available Room:</label>
			<div class="col-xs-2">
				<select class="form-control">
					<option>Room 1</option>
					<option>Room 2</option>
					<option>Room 3</option>
				</select>
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-xs-2" for="reasonForChange">Reason For Change:</label>
			<div class="col-xs-9">
				<textarea rows="3" class="form-control" id="reasonForChange"
					placeholder="reasonForChange"></textarea>
			</div>
		</div>
		<div class="form-group">
			<div class="col-xs-offset-3 col-xs-9">
				<label class="checkbox-inline"> <input type="checkbox"
					value="agree"> I agree to the <a href="#">Terms and
						Conditions</a>.
				</label>
			</div>
		</div>
		<br>
		<div class="form-group">
			<div class="col-xs-offset-3 col-xs-9">
				<input type="submit" class="btn btn-primary" value="Submit">
				<input type="reset" class="btn btn-default" value="Reset">
			</div>
		</div>
	</form:form>
</div>