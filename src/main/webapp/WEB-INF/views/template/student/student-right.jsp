	<div id="rightcontent" class="col-md-2 col-sm-6">
			<div class="">
				<img
					style="padding: 5px; height: 60px; width: 60px; border: 2px solid #CCC"
					class="float-left img-circle"
					src="${pageContext.request.contextPath}/resources/img/user.png"
					alt="user-image" /> <label
					class="member-after-login-welcome float-right">Member
					Since: 2015-01-01 <br />Last Login: 2015-01-20 11:11:11 am
				</label>
			</div>
			<div class="">
				<label>Sort By </label> <select style="height: 30px; width: 100%">
					<option>USA</option>
					<option>Nepal</option>
				</select>
			</div>
			<c:forEach begin="1" end="5">
				<div class="student">
					<label>Name: Mr.A</label> <label>Country: USA</label> <label>
						Room No# 101</label>
				</div>
			</c:forEach>
		</div>