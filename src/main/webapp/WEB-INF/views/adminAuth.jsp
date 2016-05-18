<%@ page language="java" contentType="text/html;charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true"%>
<div class="container">
	<c:url value="/j_spring_security_logout" var="logoutUrl" />
	<form action="${logoutUrl}" method="post" id="logoutForm">
		<input type="hidden" name="${_csrf.parameterName}"
			value="${_csrf.token}" />
	</form>
	<script>
		function formSubmit() {
			document.getElementById("logoutForm").submit();
		}
	</script>
</div>
<br />
<br />

<div align="center">
	<a href="admin/roomassignment" class="btn btn-primary">RoomAssignment</a>&nbsp;&nbsp;|
	<a href="admin/building" class="btn btn-primary">Building</a>&nbsp;&nbsp;|
	<a href="admin/room" class="btn btn-primary">Room</a>&nbsp;&nbsp;| <a
		href="admin/item" class="btn btn-primary">Add Items</a>&nbsp;&nbsp;| <a
		href="admin/item/listItems" class="btn btn-primary">List Items</a>&nbsp;&nbsp;|
	<a href="admin/form/checkinForm" class="btn btn-primary">CheckIn
		Form</a>&nbsp;&nbsp;| <a href="admin/form/checkoutForm"
		class="btn btn-primary">CheckOut Form</a>
</div>
<br />
<!-- Display Admin Information -->
<div
	class="col-xs-12 col-sm-12 col-md-6 col-lg-6 col-xs-offset-0 col-sm-offset-0 col-md-offset-3 col-lg-offset-3 toppad">
	<div class="panel panel-info">
		<div class="panel-heading">
			<h3 class="panel-title">Admin</h3>
		</div>
		<div class="panel-body">
			<div class="row">
				<div class="col-md-3 col-lg-3 " align="center">
					<img alt="User Pic"
						src="http://babyinfoforyou.com/wp-content/uploads/2014/10/avatar-300x300.png"
						class="img-circle img-responsive">
				</div>

				<div class=" col-md-9 col-lg-9 ">
					<table class="table table-user-information">
						<tbody>
							<tr>
								<td>First Name:</td>
								<td>${user.firstName}</td>
							</tr>
							<tr>
								<td>Middle Name:</td>
								<td>${user.middleName}</td>
							</tr>
							<tr>
								<td>Last Name:</td>
								<td>${user.lastName}</td>
							</tr>
							<tr>
								<td>Email:</td>
								<td>${user.email}</td>
							</tr>
							<tr>
								<td>House Number:</td>
								<td>abc</td>
							</tr>

							<tr>
								<td>Phone:</td>
								<td>abc</td>
							</tr>
							<tr>
								<td>State Name</td>
								<td>abc</td>
							</tr>
							<tr>
								<td>City</td>
								<td>abc</td>
							</tr>
							<tr>
								<td>Street Number</td>
								<td>abc</td>
							</tr>
							<tr>
								<td>Zip Code</td>
								<td>abc</td>
							</tr>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>
</div>


