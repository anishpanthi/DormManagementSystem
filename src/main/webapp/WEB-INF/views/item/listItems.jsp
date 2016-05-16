<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<section class="container">
	<div>
		<table class="table table-hover">
			<tr>
				<th>S.N.</th>
				<th>Item Name</th>
				<th>Description</th>
				<th>Action</th>
			</tr>
			<%
				int counter = 0;
			%>
			<c:forEach items="${items}" var="it">
				<tr>
					<td><%=++counter%></td>
					<td>${it.name}</td>
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
</section>