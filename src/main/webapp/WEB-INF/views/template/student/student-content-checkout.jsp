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
		<h5>These are the items currently available
			in your room. Please mark the current condition of each item(s).</h5>

		<form:form modelAttribute="checkOutFormData">
			<table class="table table-hover">
				<tr>
					<th>S.N.</th>
					<th>Item Name</th>
					<th>Description</th>
					<th>Previous Status</th>
					<th>Current Status</th>
				</tr>

				<c:forEach items="${checkInFormItems}" var="it" varStatus="counter">
					<tr>
						<td><c:out value="${counter.index + 1}" /></td>
						<td>
							<div class="form-group">
								<div class="row">
									<div class="col-md-12">
										<form:input path="itemName" value="${it.itemName}"
											readonly="true" class="form-control " />
									</div>

								</div>
							</div>
						</td>
						<td>
							<div class="form-group">
								<div class="row">
									<div class="col-md-8">
										<textarea rows="2" cols="35" name="description"
											class="form-control" readonly="readonly">${it.description}</textarea>
									</div>
								</div>
							</div>
						</td>

						<td>
							<div class="form-group">
								<div class="row">
									<div class="col-md-8">
										<textarea rows="2" cols="35" name="previousStatus"
											readonly="readonly" class="form-control">${it.status}</textarea>
									</div>
								</div>
							</div>
						</td>

						<td>
							<div class="form-group">
								<div class="row">
									<div class="col-md-12">
										<form:textarea path="currentStatus" rows="2" cols="40"
											value="currentStatus" class="form-control" />
									</div>
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