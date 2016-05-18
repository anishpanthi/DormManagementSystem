<%@ page language="java" contentType="text/html; charset=ISO-8855-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<style type="text/css">
h1 {
	margin: 30px 0;
	padding: 0 400px 15px 0;
	border-bottom: 1px solid #E5E5E5;
}

.bs-example {
	margin: 40px;
}
</style>
<div class="bs-example">
	<h4 align="center">
		<span class="label label-default">Create New Student</span>
	</h4>
	<br>
	<form:form class="form-horizontal" role="form" modelAttribute="student"
		method="post"
		action="${pageContext.request.contextPath}/auth/admin/student/create">
		<div class="form-group">
			<label class="control-label col-xs-4" for="firstName">First
				Name:</label>
			<div class="col-xs-5">
				<form:input type="text" class="form-control" path="firstName"
					id="firstName" placeholder="First Name" />
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-xs-4" for="middleName">Middle
				Name:</label>
			<div class="col-xs-5">
				<form:input type="text" class="form-control" path="middleName"
					id="middleName" placeholder="Middle Name" />
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-xs-4" for="lastName">Last
				Name:</label>
			<div class="col-xs-5">
				<form:input type="text" class="form-control" path="lastName"
					id="lastName" placeholder="Last Name" />
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-xs-4" for="id">Student Id:</label>
			<div class="col-xs-5">
				<form:input type="text" class="form-control" path="studentId"
					id="id" placeholder="Id" />
			</div>
		</div>
		<div class="form-group">
			<label class="col-xs-4 control-label">Entry Date:</label>
			<div class="col-xs-5 date">
				<div class="input-group input-append date" id="datePicker">
					<form:input type="text" class="form-control" name="entryDate"
						id="entryDate" path="entryDate" />
					<span class="input-group-addon add-on"><span
						class="glyphicon glyphicon-calendar"></span></span>
				</div>
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-xs-4" for="userName">User
				Name:</label>
			<div class="col-xs-5">
				<form:input type="text" class="form-control" path="username"
					id="userName" placeholder="User Name" />
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-xs-4" for="password">Password:</label>
			<div class="col-xs-5">
				<form:input type="password" class="form-control" path="password"
					id="password" placeholder="Password" />
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-xs-4" for="phoneNumber">Phone:</label>
			<div class="col-xs-5">
				<form:input type="tel" class="form-control" path="phoneNumber"
					id="phoneNumber" placeholder="Phone Number" />
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-xs-4" for="email">Email:</label>
			<div class="col-xs-5">
				<form:input type="email" class="form-control" path="email"
					id="email" placeholder="Email" />
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-xs-4" for="country">Country:</label>
			<div class="col-xs-5">
				<form:input type="text" class="form-control" path="country"
					id="country" placeholder="Country" />
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-xs-4" for="major">Major:</label>
			<div class="col-xs-5">
				<form:input type="text" class="form-control" path="major" id="major"
					placeholder="Major" />
			</div>
		</div>
		<div class="form-group">
			<label for="buildingNo" class="col-xs-4 control-label">Select
				Building:</label>
			<div class="col-xs-5">
				<form:select path="buildingNo" id="buildingNo"
					class="btn btn-default dropdown-toggle form-control">
					<form:option value="">--Select--</form:option>
					<c:forEach var="building" items="${buildings}">
						<form:option value="${building.buildingNo}">${building.buildingNo}</form:option>
					</c:forEach>
				</form:select>
			</div>
		</div>
		<div class="form-group">
			<label for="rooms" class="col-xs-4 control-label">Rooms</label>
			<div class="col-xs-5">
				<form:select class="btn btn-default dropdown-toggle form-control"
					id="roomNo" path="roomNo">
					<form:option value="">--Select--</form:option>
				</form:select>
			</div>
		</div>
		<div class="form-group" align="center">
			<div class="col-xs-offset-4 col-xs-4">
				<input type="submit" class="btn btn-primary" value="Submit">
				<input type="reset" class="btn btn-warning" value="Reset">
			</div>
		</div>
	</form:form>
</div>