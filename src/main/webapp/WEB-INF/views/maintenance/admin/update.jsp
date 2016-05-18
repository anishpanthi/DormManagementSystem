<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="add-form">
	<h3>Act on Maintenance Request</h3>
	<form:form commandName="maintenance">
		<div id="title">
			<span class="glyphicon glyphicon-education"></span>
			${maintenance.title}&nbsp;<label> - by
				${maintenance.student.firstName}&nbsp;
				${maintenance.student.lastName} on ${maintenance.registeredDate} </label>
		</div>
		<br/>

		<div id="description">${maintenance.description}</div> <br/>
		<div class="select form-group">
			<label for="status">Action</label>
			<form:select path="status">
				<form:option value="New">New</form:option>
				<form:option value="On Progres">On Progress</form:option>
				<form:option value="complete">Completed</form:option>
			</form:select>

		</div>
		<br/>
		<button type="submit" class="btn btn-success">
			<span class="glyphicon glyphicon-ok"></span> Update
		</button>
		<form:hidden path="student" />
	</form:form>

</div>