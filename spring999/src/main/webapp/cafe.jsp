<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.multi.mvc04.BbsVO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	카페 공동구매<br>
	<img src="resources/img/apple.jpg"><br>
	
<%
	if(session.getAttribute("id") != null) { //로그인이 성공 
%>
	<a href="bbb"> <button>공동구매 참여</button></a>
<%}else{ %> <!-- 로그인 안함.  -->
	<a href="login.jsp">로그인페이지로</a>
<%}%>
</body>
</html>