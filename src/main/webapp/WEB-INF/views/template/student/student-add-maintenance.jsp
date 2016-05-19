<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<div id="maincontent" class="col-md-8 col-sm-12">
	<div class="add-form-large">
		<h4 class="text-success">Register a Maintenance Request</h4>
		<hr />
		<form:form commandName="maintenance">
			<form:errors path="*" cssClass="alert alert-danger" element="div" />
			<div class="form-group">
				<label for="title">Title</label>
				<form:input path="title" class="form-control" id="title" />
			</div>
			<div class="form-group">
				<label for="description">Description</label>
				<form:textarea path="description" class="form-control"
					id="description" />
			</div>
			<div class="form-group">
				<div class="text-muted">Submitting info as
					${student.firstName}&nbsp;${student.lastName}</div>
			</div>
			<%-- <form:hidden path="student"/> --%>
			<button type="submit" class="btn btn-success">
				<span class="glyphicon glyphicon-plus"></span> Save
			</button>
		</form:form>
	</div>
</div>