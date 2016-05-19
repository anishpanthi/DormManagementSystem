<%@ page language="java" contentType="text/html; charset=ISO-8855-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<div id="maincontent" class="col-md-8 col-sm-12">
	<div class="panel panel-info">
		<div class="panel-heading">
			<h3 class="panel-title">Create Student</h3>
		</div>
		<div class="panel-body">
			<div class="add-form">
				<form:form class="form-horizontal" role="form"
					modelAttribute="student" method="post"
					action="${pageContext.request.contextPath}/auth/admin/student/create">
					<div class="form-group">
						<label class="control-label" for="firstName">First Name:</label>
						<div class="">
							<form:input type="text" class="form-control" path="firstName"
								id="firstName" placeholder="First Name" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label " for="middleName">Middle
							Name:</label>
						<div class="">
							<form:input type="text" class="form-control" path="middleName"
								id="middleName" placeholder="Middle Name" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label " for="lastName">Last Name:</label>
						<div class="">
							<form:input type="text" class="form-control" path="lastName"
								id="lastName" placeholder="Last Name" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label " for="id">Student Id:</label>
						<div class="">
							<form:input type="text" class="form-control" path="studentId"
								id="id" placeholder="Id" />
						</div>
					</div>
					<div class="form-group">
						<label class=" control-label">Entry Date:</label>
						<div class=" date">
							<div class="input-group input-append date" id="datePicker">
								<form:input type="text" class="form-control" name="entryDate"
									id="entryDate" path="entryDate" />
								<span class="input-group-addon add-on"><span
									class="glyphicon glyphicon-calendar"></span></span>
							</div>
						</div>
					</div>
					<div class="form-group">
						<label class="control-label " for="userName">User Name:</label>
						<div class="">
							<form:input type="text" class="form-control" path="username"
								id="userName" placeholder="User Name" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label " for="password">Password:</label>
						<div class="">
							<form:input type="password" class="form-control" path="password"
								id="password" placeholder="Password" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label " for="phoneNumber">Phone:</label>
						<div class="">
							<form:input type="tel" class="form-control" path="phoneNumber"
								id="phoneNumber" placeholder="Phone Number" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label " for="email">Email:</label>
						<div class="">
							<form:input type="email" class="form-control" path="email"
								id="email" placeholder="Email" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label " for="country">Country:</label>
						<div class="">
							<form:input type="text" class="form-control" path="country"
								id="country" placeholder="Country" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label " for="major">Major:</label>
						<div class="">
							<form:input type="text" class="form-control" path="major"
								id="major" placeholder="Major" />
						</div>
					</div>
					<div class="form-group">
						<label for="buildingNo" class=" control-label">Select
							Building:</label>
						<div class="">
							<form:select path="buildingNo" id="buildingNo"
								class="btn btn-default dropdown-toggle form-control" ng-click="dorm.getBuildingRooms('${buildingNo}')">
								<form:option value="">--Select--</form:option>
								<c:forEach var="building" items="${buildings}">
									<form:option value="${building.buildingNo}">${building.buildingNo}</form:option>
								</c:forEach>
							</form:select>
						</div>
					</div>
					<div class="form-group">
						<label for="rooms" class=" control-label">Rooms</label>
						<div class="">
							<form:select class="btn btn-default dropdown-toggle form-control"
								id="roomNo" path="roomNo">
								<form:option value="">--Select--</form:option>
								<form:option ng-repeat="room in dorm.buldingRooms" value="{{room.id}}">
							      {{room.roomNo}}
							    </form:option>
							</form:select>
						</div>
					</div>
					<div class="form-group">
						<div class="col-md-6">
							<input type="submit" class="btn btn-success" value="Submit">
						</div>
						<div class="col-md-6">
							<input type="reset" class="btn btn-warning" value="Reset">
						</div>
					</div>
				</form:form>
			</div>
		</div>
	</div>
</div>