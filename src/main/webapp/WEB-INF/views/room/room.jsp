<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="add-form">
	<h4 class="text-success">Add Room</h4>
	<hr />
	<div class="message-row">
		<c:if test="${!empty successMessage}">
			<div class="row">
				<div class="alert alert-success">
					<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
					<strong>${successMessage}</strong>
				</div>
			</div>
		</c:if>
		<form:form commandName="room" method="post" class="form-horizontal">
			<div>
				<form:errors path="*" />
			</div>
			<div class="form-group">
				<div class="row">
					<label for="roomNo" class="col-xs-3 control-label">Room No</label>
					<div class="col-xs-5">
						<form:input type="text" class="form-control" id="roomNo"
							path="roomNo" placeholder="Room No" required="required" />
					</div>
				</div>
			</div>
			<div class="form-group">
				<div class="row ">
					<label for="buildingNo" class="col-xs-3 control-label">Room
						Items</label>
					<div class="dynamic-checkboxes col-xs-5">
						<form:checkboxes items="${itemList}" itemLabel="itemName"
							itemValue="id" path="itemIds" />
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
</div>
<div>
	<table class="table table-hover">
		<tr>
			<th>Room No</th>
			<th>Availability</th>
			<th>Action</th>
		</tr>
		<tr ng-repeat="room in dorm.rooms">
			<td>{{room.roomNo}}</td>
			<td>{{room.roomStatus}}</td>
			<td><a href='<c:url value="/auth/admin/room/edit/{{room.id}}"/>'
				class="label label-info"> <span
					class="glyphicon glyphicon-edit	" /></span> Edit
			</a> &nbsp;&nbsp;<a href="#" class="label label-danger"
				ng-click="dorm.removeRoom(room.id)"> <span
					class="glyphicon glyphicon-remove" /></span> Delete
			</a></td>
		</tr>
	</table>
</div>