<%@page import="multi.PlayerVO"%>
<%@page import="multi.PlayerDAO"%>


<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%
	String backnumber = request.getParameter("backnumber");

	PlayerDAO dao = new PlayerDAO();
	PlayerVO bag2 = dao.one(backnumber);
	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	
	
	당신이 검색을 원하는 백넘버는 <%=backnumber%>
	<hr color="red">
	<table class="table table-warning table-striped">
		<tr>
			<td>선수 백넘버</td>
			<td><%=bag2.getBacknumber()%></td>
		</tr>
		<tr>
			<td>선수 이름</td>
			<td><%=bag2.getName()%></td>
		</tr>
		<tr>
			<td>선수 키</td>
			<td><%=bag2.getHeight()%></td>
		</tr>
		<tr>
			<td>선수 체중</td>
			<td><%=bag2.getWeight()%></td>
		</tr>
		<tr>
			<td>팀 이름</td>
			<td><%=bag2.getTeam()%></td>
		</tr>
		<tr>
			<img src="img/<%= bag2.getImg()%>" width="150" height="150">
		</tr>
	</table>
	<br>
</body>
</html>