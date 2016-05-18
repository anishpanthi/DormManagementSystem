<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ page contentType="text/html;charset=UTF-8"%>
<div id="dorm-lang" class="pull-right">
	<spring:message code="app.label.selectLanguage"/> <a href="?lang=en"><spring:message
				code="home.label.english" /></a> | <a href="?lang=np"><spring:message
				code="home.label.nepali" /></a>
			    <br>${serverTime}
	</span>
</div>
