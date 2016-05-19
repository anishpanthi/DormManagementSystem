<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div id="maincontent" class="col-md-8 col-sm-12">
	<div class="row">
		<c:if test="${!empty postMessage}">
			<div class="">
				<div class="alert alert-success">
					<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
					<strong>${postMessage}</strong>
				</div>
			</div>
		</c:if>
		<div style="padding: 1.2%;" class="row">
			<a class="btn dorm-add-btn"
				href='<c:url value="student/maintenance" />'> <span
				class="glyphicon glyphicon-plus"></span> Add Maintenance Request
			</a>
		</div>
		<div class="panel panel-default">
			<div class="panel-heading">Maintainence Request History</div>
			<div class="panel-body">
				<table class="table">
					<tr>
						<th>S.No</th>
						<th>Title</th>
						<th>Description</th>
						<th>Registered Date</th>
						<th>Status</th>
						<th>Operation</th>
					</tr>

					<tr ng-repeat="maintenance in dorm.maintenances">
						<td>{{$index+1}}</td>
						<td>{{maintenance.title}}</td>
						<td>{{maintenance.description}}</td>
						<td>{{maintenance.registeredDate | date :"yyyy-MM-dd
							HH:mm:ss"}}</td>
						<td>{{maintenance.status}}</td>
						<td><a href="student/maintenance/edit/{{maintenance.id}}">Edit</a>
							<a href='#' ng-click="dorm.remove(maintenance.id)">Delete</a></td>

					</tr>

				</table>
			</div>
		</div>
	</div>

	<div class="row">
		<div class="panel panel-default">
			<div class="panel-heading">Room Change History</div>
			<div class="panel-body">
				<table class="table">
					<tr>
						<th>S.No</th>
						<th>From</th>
						<th>To</th>
						<th>Requested Date</th>
						<th>Reason</th>
						<th>Status</th>
						<th>Updated On</th>
					</tr>
					<tr>
						<td>1</td>
						<td>AC Not Working</td>
						<td>Ac is not working between 10PM to 12</td>
						<td>2016-05-15 12:12:12 am</td>
						<td>New</td>
						<td>NA</td>
						<td>NA</td>
					</tr>
				</table>
			</div>
		</div>
	</div>


	<div class="row">
		<div class="panel panel-default">
			<div class="panel-heading">Arrival Form</div>
			<div class="panel-body">
				<table class="table">
					<tr>
						<th>S.No</th>
						<th>Item</th>
						<th>Description</th>
						<th>Requested Date</th>
						<th>Status</th>
					</tr>
					<tr ng-repeat="item in dorm.checkInItems">
						<td>{{$index+1}}</td>
						<td>{{item.itemName}}</td>
						<td>{{item.description}}</td>
						<td>{{2+4}}</td>
						<td>{{item.status}}</td>
					</tr>
				</table>
			</div>
		</div>
	</div>
	
	<div class="row">
		<div class="panel panel-default">
			<div class="panel-heading">Departure Form</div>
			<div class="panel-body">
				<table class="table">
					<tr>
						<th>S.No</th>
						<th>Item</th>
						<th>Description</th>
						<th>Requested Date</th>
						<th>Status</th>
					</tr>
					<tr ng-repeat="item in dorm.checkOutItems">
						<td>{{$index+1}}</td>
						<td>{{item.itemName}}</td>
						<td>{{item.description}}</td>
						<td>{{2+4}}</td>
						<td>{{item.status}}</td>
					</tr>
				</table>
			</div>
		</div>
	</div>
	<div class="row">
		<h4>List of RA and Rd</h4>
		<div class="dorm-rd dorm-rd-rd col-md-4">
			<h4>RD: Cy Tamakoshi</h4>
			<p>Email: cy@gmail.com Contact No: +16411112222 Room No# 333
				Floor : 3rd Floor</p>
		</div>

		<div class="dorm-rd dorm-rd-ra col-md-4">
			<h4>RA: Cy Tamakoshi</h4>
			<p>Email: cy@gmail.com Contact No: +16411112222 Room No# 333
				Floor : 3rd Floor</p>
		</div>
		<div class="dorm-rd dorm-rd-ra col-md-4">
			<h4>RA: Bijay Tamakoshi</h4>
			<p>Email: cy@gmail.com Contact No: +16411112222 Room No# 333
				Floor : 3rd Floor</p>
		</div>
	</div>
	<div class="row">
		<h4 class="dorm-important-contact-h4">List of Important Contacts</h4>
		<div class="dorm-important-contact col-md-4">
			<h4>Campus Security: 1115</h4>
			<p>Email: cy@gmail.com Contact No: +16411112222 Room No# 333
			Floor : 3rd Floor</p>
		</div>

		<div class="dorm-important-contact col-md-4">
			<h4>RA: Cy Tamakoshi</h4>
			<p>Email: cy@gmail.com Contact No: +16411112222 Room No# 333
				Floor : 3rd Floor</p>
		</div>
		<div class="dorm-important-contact col-md-4">
			<h4>RA: Bijay Tamakoshi</h4>
			<p>Email: cy@gmail.com Contact No: +16411112222 Room No# 333
				Floor : 3rd Floor</p>
		</div>
	</div>

</div>
