<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<div class="container">
	<c:if test="${!empty itemPostMessage}">
		<div class="row">
			<div class="alert alert-success">
				<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
				<strong>${itemPostMessage}</strong>
			</div>
		</div>
	</c:if>
	<br /> <br />
	<div class="row">
		<h4 class="text-success">Check The Items You Have In Your Room</h4>
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
						<td><input type="text" value="${it.itemName}" name="itemName" width="40%" readonly="readonly" /></td>
						<td><textarea rows="2" cols="40" name="description" readonly="readonly">${it.description}</textarea></td>
						<td><input type="checkbox" name="available" id="checkBox"/></td>
						<td><textarea rows="2" cols="40" name="status"></textarea></td>
						<td><input type="hidden" name="id" value="${it.id}" />
					</tr>
				</c:forEach>
			</table>
			<input type="submit" value="Done" />
		</form:form>
	</div>
</div>