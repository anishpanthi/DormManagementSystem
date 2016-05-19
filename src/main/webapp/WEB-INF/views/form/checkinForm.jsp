<%@page session="true"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="student-container container-fluid">
	<div class="row">
		<%@ include file="/WEB-INF/views/template/student/student-left.jsp"%>
		<%@ include file="/WEB-INF/views/template/student/student-content-checkin.jsp"%>
		<%@ include file="/WEB-INF/views/template/student/student-right.jsp"%>
	</div>
</div>
