<%@page session="true"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link rel="stylesheet"
	href="//cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.3.0/css/datepicker3.min.css" />
<script
	src="//cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.3.0/js/bootstrap-datepicker.min.js"></script>
<script src='<c:url value="/resources/js/dateTimePicker.js" />'></script>
<div class="student-container container-fluid">
	<div class="row">
		<%@ include file="/WEB-INF/views/template/admin/admin-left.jsp"%>
		<%@ include
			file="/WEB-INF/views/template/admin/admin-create-student.jsp"%>
		<%@ include file="/WEB-INF/views/template/admin/admin-right.jsp"%>
	</div>
</div>

