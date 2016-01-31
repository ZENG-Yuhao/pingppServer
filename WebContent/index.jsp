<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<jsp:include page="/utils/header.jsp">
	<jsp:param name="title" value="pingppServer" />
	<jsp:param name="page" value="/index.jsp" />
</jsp:include>
<!-- Content -->
<div class="panel panel-default">
	<div class="panel-heading">
		<h2>
			<span class="glyphicon glyphicon-tag"></span> Examples
		</h2>
	</div>
	<div class="panel-body">
		<form action="/pingppServer/PageJump" method="post">
			<!-- Charge Example -->
			<button type="submit" class="btn btn-primary" name="btn"
				value="ChargeServlet" style="width: 190px; margin: 5px 5px;">
				<span class="glyphicon glyphicon-expand"></span>Charge
			</button>

			<button type="submit" class="btn btn-primary" name="btn"
				value="Events" style="width: 190px; margin: 5px 5px;">
				<span class="glyphicon glyphicon-expand"></span> Events
			</button>

			<button type="submit" class="btn btn-primary" name="btn"
				value="Refunds" style="width: 190px; margin: 5px 5px;">
				<span class="glyphicon glyphicon-expand"></span> Refunds
			</button>

			<button type="submit" class="btn btn-primary" name="btn"
				value="WebHooksVerify" style="width: 190px; margin: 5px 5px;">
				<span class="glyphicon glyphicon-expand"></span> WebHooksVerify
			</button>
		</form>
	</div>
</div>
<!-- Content -->
<jsp:include page="/utils/footer.jsp" />