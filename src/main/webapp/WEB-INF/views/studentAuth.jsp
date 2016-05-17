<%@page session="true"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="container">
	<div class="row">
		<div id="leftcontent" class="col-md-2 col-sm-6">
			<div class="row">
				<img
					style="padding: 5px; height: 100px; width: 100px; border: 2px solid #CCC"
					class="img-circle"
					src="${pageContext.request.contextPath}/resources/img/user.svg"
					alt="user-image" /> <label>Memeber Since: 2015-01-01</label> <label>Last
					Login: 2015-01-20 11:11:11 am</label>
			</div>
			<hr />
			<div class="row">
				<div
					style="background: #D3F5AB; padding: 10px; color: #444; margin-bottom: 5px"
					class="dorm-rd">
					<h4>RD: Cy Tamakoshi</h4>
					<p>Email: cy@gmail.com Contact No: +16411112222 Room No# 333
						Floor : 3rd Floor</p>
				</div>
				<div
					style="background: #D3F5AB; padding: 10px; color: #444; margin-bottom: 5px"
					class="dorm-rd">
					<h4>RD: Bijay Tamakoshi</h4>
					<p>Email: cy@gmail.com Contact No: +16411112222 Room No# 333
						Floor : 3rd Floor</p>
				</div>
			</div>
			<hr />
			<div class="row">
				<div
					style="background: #FFE2EC; padding: 10px; color: #444; margin-bottom: 5px"
					class="dorm-rd">
					<h4>RA: Cy Tamakoshi</h4>
					<p>Email: cy@gmail.com Contact No: +16411112222 Room No# 333
						Floor : 3rd Floor</p>
				</div>
				<div
					style="background: #FFE2EC; padding: 10px; color: #444; margin-bottom: 5px"
					class="dorm-rd">
					<h4>RA: Bijay Tamakoshi</h4>
					<p>Email: cy@gmail.com Contact No: +16411112222 Room No# 333
						Floor : 3rd Floor</p>
				</div>
			</div>
			<div class="row">Important Contacts like security</div>
		</div>

		<div id="maincontent" class="col-md-8 col-sm-12">
			<div class="row">
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
							<th>Last Updated Date</th>
						</tr>
	
				<c:forEach items="${maintenances}" var="maintenance" varStatus="counter">
					<tr>
						<td><c:out value="${counter.index +1}"/></td>
						<td>${maintenance.title}</td>
						<td>${maintenance.description}</td>
						<td>${maintenance.registeredDate}</td>
						<td>${maintenance.status}</td>
						<td>${maintenance.updatedDate}</td>
								
					</tr>
					</c:forEach>
				
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

							<tr>
								<td>2</td>
								<td>AC Not Working</td>
								<td>Ac is not working between 10PM to 12</td>
								<td>2016-04-15 12:12:12 am</td>
								<td>Fixed</td>
								<td>2016-04-20 12:12:12 am</td>
								<td>NA</td>
							</tr>
						</table>
					</div>
				</div>
			</div>


			<div class="row">
				<div class="panel panel-default">
					<div class="panel-heading">Arrival Form</div>
					<div class="panel-body">Picturioal Format of Check in Form</div>
				</div>
			</div>

		</div>

		<div id="rightcontent" class="col-md-2 col-sm-6">
			<div class="row">
				<label>Sort By </label> <select style="height: 30px; width: 100%">
					<option>USA</option>
					<option>Nepal</option>
				</select>
			</div>

			<div class="row"
				style="color: #888; padding: 10px; margin-bottom: 5px; border-bottom: 1px solid #ddd">
				<label>Name: Mr.A</label> <label>Country: USA</label> <label>
					Room No# 101</label>
			</div>

			<div class="row"
				style="color: #888; padding: 10px; margin-bottom: 5px; border-bottom: 1px solid #ddd">
				<label>Name: Mr.A</label> <label>Country: USA</label> <label>
					Room No# 101</label>
			</div>

			<div class="row"
				style="color: #888; padding: 10px; margin-bottom: 5px; border-bottom: 1px solid #ddd">
				<label>Name: Mr.A</label> <label>Country: USA</label> <label>
					Room No# 101</label>
			</div>
		</div>

	</div>
</div>
