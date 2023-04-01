<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		session.setAttribute("count", 0);
	session.setAttribute("user", "root");
	%>
	<hr>
	브라우저에 쿠키를 심었음.
	<a href="session속성가지고오기.jsp">session속성가지고오기.jsp</a>
</body>
</html>