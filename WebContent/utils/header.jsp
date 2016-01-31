 <%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title><%=request.getParameter("title")%></title>
<meta charset="utf-8">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="/pingppServer/ext/bootstrap/3.2.2/css/bootstrap.min.css">
<script src="/pingppServer/ext/jquery/1.11.2/jquery-1.11.2.js"></script>
<script src="/pingppServer/ext/bootstrap/3.2.2/js/bootstrap.min.js"></script>
</head>
<body>

	<nav class="navbar navbar-default">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand"
					href="<%=request.getContextPath()%>/index.jsp"><span class="glyphicon glyphicon-home"></span> <%=request.getParameter("title")%></a>
			</div>

			
		</div>
	</nav>

	<div class="container">

		<!-- ProjectFarm -->