<%@page import="multi.MemberVO"%>
<%@page import="multi.MemberDAO3"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String id = request.getParameter("id");

MemberDAO3 dao = new MemberDAO3();
MemberVO bag = dao.one(id);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	
</head>
<body>
	당신이 검색을 원하는 아이디는
	<%=id%>
	<hr color="red">
	검색한 pw:
	<%=bag.getPw()%>
	<br> 검색한 이름:
	<%=bag.getName()%>
	<br> 검색한 전화번호 :
	<%=bag.getTel()%>
	<br>
</body>
</html>