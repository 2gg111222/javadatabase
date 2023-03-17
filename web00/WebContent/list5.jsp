
<%@page import="multi.PlayerVO"%>
<%@page import="multi.PlayerDAO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	PlayerDAO dao = new PlayerDAO();
//5,6)dao가 리턴한 PlayerVO가 들어간 ArrayList를 받는다. 
ArrayList<PlayerVO> list = dao.list();
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
<style type="text/css">
body { /* 컨트롤 + / - 자동주석, 태그선택! */
	background: red;
}</style>

</head>
<body>
<a href="one5.html">
		<button id="b1">선수 상세페이지로</button>
	</a>\
	<a href="insert5.html">
		<button id="b1">선수명단등록 페이지로</button>
	</a>
	<a href="update5.html">
		<button id="b1">선수명단수정 페이지로</button>
	</a>
	<a href="delete5.html">
		<button id="b1">선수명단삭제 페이지로</button>
	</a>
<!-- 	만약 자료가 하나도 없다면 어떻게 처리할 것인가? 내부오류라고만 뜰텐데! -->
	전체 선수 명단:
	<%=list.size()%>
	<%
		if (list.size() == 0) {
	%>
	<h3>등록된 선수가 없습니다.</h3>
	<img src="img/football-gd3b45babd_1280.png" width=250 height="250">
	<%
		} else {
	%>
	<!-- <table class="table table-warning table-striped"> -->
		<table class="table table-hover">
		<tr>
			<td>등번호</td>
			<td>선수이름</td>
			<td>팀이름</td>
		</tr>
		<%
			for (PlayerVO bag2 : list) {
		%>
		<tr>
			<td>
			<!-- one4.jsp?id=102 -->
			<a href="one5.jsp?backnumber=<%=bag2.getBacknumber()%>">
			<%=bag2.getBacknumber()%>
			</a>
			</td>
			
			<td>
					<%=bag2.getName()%>
			</td>
			<td><%=bag2.getTeam()%></td>
		</tr>
		<%
			} //for
		%>
	</table>
	<%
		} //else
	%>
</body>
</html>