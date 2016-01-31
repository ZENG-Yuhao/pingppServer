<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<jsp:include page="/utils/header.jsp">
	<jsp:param name="title" value="pingppServer" />
	<jsp:param name="page" value="/Pages/SimpleContentPrinter.jsp" />
</jsp:include>
<!-- Content -->
<div class="panel panel-default">
	<div class="panel-heading">
		<h2>
			<span class="glyphicon glyphicon-tag"></span> Content
		</h2>
	</div>
	<div class="panel-body">
		<%=request.getAttribute("content")%>
	</div>
</div>
<!-- Content -->
<jsp:include page="/utils/footer.jsp" />