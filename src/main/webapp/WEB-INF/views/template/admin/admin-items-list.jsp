<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div id="maincontent" class="col-md-8 col-sm-12">
<h4>List of Items</h4>
	<div class="add-form-large">
		<table class="table table-hover">
			<tr>
				<th>S.N.</th>
				<th>Item Name</th>
				<th>Description</th>
				<th>Action</th>
			</tr>
			
			<c:forEach items="${items}" var="it" varStatus="counter">
				<tr>
					<td>${counter.index+1}</td>
					<td>${it.itemName}</td>
					<td>${it.description}</td>
					<td><a
						href="<c:url value='/auth/admin/item/listItems/edit/${it.id}'></c:url>"
						class="label label-success"><span
							class="glyphicon glyphicon-pencil"></span>Edit</a></td>
					<td><a
						href="<c:url value='/auth/admin/item/listItems/delete/${it.id}'></c:url>"
						class="label label-danger"> <span
							class="glyphicon glyphicon-remove" /></span> Remove
					</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</div>