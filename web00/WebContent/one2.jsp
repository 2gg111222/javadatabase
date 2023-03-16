<%@page import="multi.BBSDAO"%>
<%@page import="multi.BbsVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- 	 1. 전달된 값 받아주세요.(request이용) -->
		<% //자바로 인식시킴
		//스트립 트릿  - 조금 코드를 써서 만드는 작은 프로그램
		//자바코드 넣는 부분!!
		//HttpServletRequest request = new HttpServletRequest();-너무 길다 그래서
		//tomcat은 미리 request를 만들어서 내장시켜놓았다! 
		 String no = request.getParameter("no");
		
		BBSDAO dao = new BBSDAO();
		BbsVO bag2 = dao.one(Integer.parseInt(no));
				 %>
				 
		<!--  2. dao에게 값 전달.(dao이용) 생략 -->
		<!--  3. 전달된 값을 출력하는 결과를 브라우저에 html로 보내주세요.  -->


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>삭제</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>

</head>
<body>
<hr>
 <table class="table table-dark table-striped">
	<tr>
 		<td>검색한 제목</td>
 		<td><%= bag2.getTitle() %></td>
 	</tr>
 	<tr>
 		<td>검색한 내용</td>
 		<td><%= bag2.getContent() %></td>
 	</tr>
 	<tr>
 		<td>검색한 글쓴이</td>
 		<td><%= bag2.getWriter() %></td>
 	</tr>

</table>
</body>
</html>