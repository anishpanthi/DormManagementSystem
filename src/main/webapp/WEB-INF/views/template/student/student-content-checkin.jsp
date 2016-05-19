<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<div id="maincontent" class="col-md-8 col-sm-12">
	<c:if test="${!empty itemPostMessage}">
		<div class="row">
			<div class="alert alert-success">
				<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
				<strong>${itemPostMessage}</strong>
			</div>
		</div>
	</c:if>
	<div class="row add-form-large">
		<h5>Check The Items You Have In Your Room</h5>
		<form:form modelAttribute="checkInFormData">
			<table class="table table-hover">
				<tr>
					<th>S.N.</th>
					<th>Item Name</th>
					<th>Description</th>
					<th>Available</th>
					<th>Current Status</th>
				</tr>

				<c:forEach items="${checkinFormItems}" var="it" varStatus="counter">
					<tr>
						<td><c:out value="${counter.index + 1}" /></td>
						<td>
							<div class="form-group">
								<div class="row">
									<div class="col-md-10">
										<form:input path="itemName" value="${it.itemName}"
											readonly="true" class="form-control" />

									</div>
								</div>
							</div>
						</td>
						<td>
							<div class="form-group">
								<div class="row">
									<textarea rows="2" cols="25" name="description"
										readonly="readonly">${it.description}</textarea>
								</div>
							</div>
						</td>

						<td>
							<div class="form-group">
								<div class="row">
									<label class="radio-inline"><input type="radio"
										name="available[${counter.index}]" value="1" checked>Yes</label>
								</div>
							</div>
							<div class="form-group">
								<div class="row">
									<label class="radio-inline"><input type="radio"
										name="available[${counter.index}]" value="0">No</label>
								</div>
							</div>
						</td>

						<td>
							<div class="form-group">
								<div class="row">
									<form:textarea path="status" rows="2" cols="25" value="status" />
								</div>
							</div>
						</td>
						<td><input type="hidden" name="id" value="${it.id}" />
					</tr>
				</c:forEach>
			</table>
			<input type="submit" value="Done" class="btn btn-primary" />
			<br />
			<br />
		</form:form>
	</div>
</div>