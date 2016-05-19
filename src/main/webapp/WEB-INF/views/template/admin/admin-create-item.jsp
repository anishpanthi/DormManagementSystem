<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div id="maincontent" class="col-md-8 col-sm-12">
	<div class="add-form">

		<c:if test="${!empty itemPostMessage}">
			<div class="row-message">
				<div class="alert alert-success">
					<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
					<strong>${itemPostMessage}</strong>
				</div>
			</div>
		</c:if>
		<h4 class="text-success">Add Item</h4>
		<hr />
		<form:form commandName="item">
			<div class="form-group">
				<label for="title">Name</label>
				<form:input path="itemName" class="form-control" id="name" />
			</div>
			<div class="form-group">
				<label for="description">Description</label>
				<form:textarea path="description" class="form-control"
					id="description" />
			</div>
			<button type="submit" class="btn btn-success">
				<span class="glyphicon glyphicon-eye-open"></span> Add Item
			</button>
		</form:form>
	</div>
</div>
