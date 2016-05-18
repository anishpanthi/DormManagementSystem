<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="add-form">
	<h4 class="text-success">Add Building</h4>
	<hr />
	<div class="row-message">
		<c:if test="${!empty successMessage}">
			<div class="row">
				<div class="alert alert-success">
					<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
					<strong>${successMessage}</strong>
				</div>
			</div>
		</c:if>
	</div>
	<form:form commandName="building" class="form-horizontal" method="POST">
		<div class="form-group">
			<label for="buildingNo" class="col-xs-3 control-label">Building
				No</label>
			<div class="col-xs-5">
				<form:input type="text" class="form-control" id="buildingNo"
					path="buildingNo" placeholder="Building No" />
			</div>
		</div>
		<div class="form-group">
			<label for="buildingAddress" class="col-xs-3 control-label">Building
				Address</label>
			<div class="col-xs-5">
				<form:input type="text" required="required" class="form-control"
					id="buildingAddress" path="buildingAddress"
					placeholder="Building Address" />
			</div>
		</div>
		<div class="form-group">
			<label for="buildingName" class="col-xs-3 control-label">Building
				Name</label>
			<div class="col-xs-5">
				<form:input type="text" required="required" class="form-control"
					id="buildingName" path="buildingName" placeholder="Building Name" />
			</div>
		</div>
		<div class="form-group">
			<div class="row">
				<label for="buildingNo" class="col-xs-3 control-label">Rooms</label>
				<div class="dynamic-checkboxes col-xs-5">
					<form:checkboxes class="checkbox-inline" items="${roomList}"
						itemLabel="roomNo" itemValue="id" path="roomIds" />
					<c:if test="${!empty roomsByBuilding}">
						<c:forEach var="item" items="${roomsByBuilding}">
							<form:input type="checkbox" path='${item.id}' />${item.roomNo }
								</c:forEach>
					</c:if>
				</div>
			</div>
		</div>
		<div class="form-group">
			<div class="col-xs-5 col-xs-offset-3">
				<button type="submit" class="btn btn-success">Create</button>
			</div>
		</div>
	</form:form>
</div>

<div>
	<table class="table table-hover">
		<tr>
			<th>Building No</th>
			<th>Building Name</th>
			<th>Building Address</th>
			<th>Action</th>
		</tr>
		<tr ng-repeat="building in dorm.buildings">
			<td>{{building.buildingNo}}</td>
			<td>{{building.buildingName}}</td>
			<td>{{building.buildingAddress}}</td>
			<td><a
				href='<c:url value="/auth/admin/building/edit/{{building.id}}"/>'
				class="label label-info"> <span class="glyphicon glyphicon-edit" /></span>
					Edit
			</a> &nbsp;&nbsp;&nbsp;<a href='#' class="label label-danger"
				ng-click="dorm.removeBuilding(building.id)"> <span
					class="glyphicon glyphicon-remove" /></span> Delete
			</a></td>
		</tr>
	</table>
</div>
